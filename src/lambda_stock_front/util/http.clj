(ns lambda-stock-front.util.http
  (:require [clj-http.client :as http]
            [cheshire.core :as json]))

(def base-url "http://localhost:3000")

(defn GET [path]
  (-> (http/get (str base-url path)
                {:as :json})
      :body))

(defn POST [path data]
  (-> (http/post (str base-url path)
                 {:content-type :json
                  :accept :json
                  :body (json/encode data)
                  :as :json})
      :body))
