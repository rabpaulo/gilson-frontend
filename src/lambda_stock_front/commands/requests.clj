(ns lambda-stock-front.commands.requests
  (:require [lambda-stock-front.util.http :as http]
            [lambda-stock-front.util.inputs :as input]))

(defn show-stock[]
  (let 
    [ticker (input/ask "Ticker da ação: ")
    resp (http/GET (str "/stocks/" ticker))]
    (println resp)))

(defn show-balance[]
  (println (http/GET "/wallet/balance"))
  )
