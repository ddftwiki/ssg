(ns cryogen.dfa
  (:require [clojure.string :as str]
            [clojure.pprint :as pprint]))

(defn card-path
  [card]
  (-> (mapv (comp keyword str) card)
      (conj :card?)))

(defn dfa
  [words]
  (reduce (fn [t x] (assoc-in t (card-path x) true)) {} words))

(defn card-exists?
  [dfa card]
  (->> (card-path card)
       (get-in dfa)))

(defn maybe-card
  "true for a card, false for definitely not a card, next state for maybe"
  [dfa c]
  (if-let [dfa' (dfa (keyword (str/lower-case (str c))))]
    (:card? dfa' dfa')
    false))

(defn list->string
  [l]
  (->> l
       flatten
       (map #(if % % " "))
       (str/join "")))

(defn bool?
  [x]
  (or (= x true)
      (= x false)
      false))

(defn wrap-card-tag
  [card]
  (format "<a class=\"mtg-card\" href=\"https://deckbox.org/mtg/%s\">%s</a>" card card))

(comment
  (println
   (wrap-card-tag "dark ritual")))

(defn first-and-last-capitalized?
  [card ]
  (let [xs (str/split card #"\s")
        f (first xs)
        l (last xs)]
    (and (= (str/capitalize (str (first f))) (str (first f)))
         (= (str/capitalize (str (first l))) (str (first l))))))

(defn actual-card?
  [dfa card]
  (comment (and (first-and-last-capitalized? card)
                (card-exists? dfa card)))
  (first-and-last-capitalized? card))

(defn annotate-stream
  "Reads chars looking for a magic card name. If one is found, wrap it with f"
  ([DFA chars] (annotate-stream DFA chars wrap-card-tag))
  ([DFA chars f]
   (loop [buf [] ;; buffer holding the current possible card
          dfa DFA ;; state
          [c & more] chars  ;; c is the character under examination, more is what's left
          results []] ;; the results so far
     #_ (pprint/pprint {:buf (list->string buf)
                       :c c
                       :more (list->string more)
                       :results (list->string results)
                       :maybe-card-bool? (bool? (maybe-card dfa c))
                       :maybe-card (let [r (maybe-card dfa c)]
                                     (when (bool? r)
                                       r))})
     (if (seq more)
       (let [r (maybe-card dfa c)]
         (cond
           ;; we definitely have a card
           (and (= r true)
                (actual-card? DFA (list->string (conj buf c))))
           (recur [] DFA more (conj results (wrap-card-tag (list->string (conj buf c)))))
           ;; we have a faux card
           (and (= r true)
                (not (actual-card? DFA (list->string (conj buf c)))))
           (recur [] DFA (concat (drop 1 (conj buf c)) more) (conj results (or (first buf) c)))
           ;; we definitely don't have a card
           (= r false) (recur []
                              DFA
                              (concat (drop 1 (conj buf c)) more)
                              (conj results (or (first buf) c)))
           ;; we still might have a card
           :else (recur (conj buf c) r more results)))
       ;; we ran out of characters! either finish or reset the buffers
       (if c
         (if (= 0 (count buf))
           ;; we're on the last character
           (list->string (conj results c))
           ;; reset as though we failed
           (recur [] DFA (drop 1 (conj buf c)) (conj results (or (first buf) c))))
         ;; no characters and no more, we're done here
         (list->string (conj results buf)))))))

(comment

  (require '[cryogen.mtgcards :as cards])

  (def cards-dfa (dfa cards/card-names))

  (println
    (annotate-stream cards-dfa "my favorite card is dark ritual by a lot."))

  (println
   (annotate-stream cards-dfa "<p>My favorite card is Dark Ritual by a lot. +1 to that!"))

  (println (annotate-stream cards-dfa "<p>"))

  )


