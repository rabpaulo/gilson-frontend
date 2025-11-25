(ns lambda-stock-front.commands.requests
  (:require [lambda-stock-front.util.http :as http]))

(defn stock[ticker]
  (let  [resp (http/GET (str "/stocks/" ticker))]
    resp))

(defn balance[]
  (http/GET "/wallet/balance")
  )

(defn statement[start end]
  (http/GET (str "/trades/statement?start=" start "&end=" end)))

(defn buy[ticker qtd]
  (http/POST (str "/stocks/buy" ticker) qtd))
  
(defn sell[ticker qtd]
  (http/POST (str "/stocks/sell" ticker) qtd))
  
