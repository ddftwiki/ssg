(ns cryogen.selmer
  (:require [selmer.filters :as f]))

(f/add-filter! :get get)
