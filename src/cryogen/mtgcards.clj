(ns cryogen.mtgcards
  "Loads data from mtgjson.com to highlight mtg cards"
  (:require [clojure.java.io :as io]
            [cheshire.core :as json]
            [clojure.string :as str]
            [clojure.set :as set]))

(def card-url "https://mtgjson.com/json/AllCards.json.zip")

(def db (let [stream (-> card-url
                         io/input-stream
                         java.util.zip.ZipInputStream.)]
          (.getNextEntry stream)
          (-> stream
              slurp
              json/parse-string))) 

(def card-names (into #{}
                      (comp (map first)
                            (map str/lower-case))
                      db))
