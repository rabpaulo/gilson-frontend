(ns lambda-stock-front.core
  (:require [lambda-stock-front.cli :as cli])
  )

(defn -main [& _]
  (cli/start))
