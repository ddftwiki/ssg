(ns cryogen.ddftwiki-markdown
  (:require [cryogen.dfa :as dfa]
            [cryogen.mtgcards :as cards]))

(def cards-dfa (dfa/dfa cards/card-names))

(defn deckbox-card-link-transformer
  [text state]
  (if (state :paragraph)
    [(dfa/annotate-stream cards-dfa text) state]
    [text state]))

(def custom-transformers [deckbox-card-link-transformer])
