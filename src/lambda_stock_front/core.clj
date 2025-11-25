(ns lambda-stock-front.core
  (:require [lambda-stock-front.util.cli :as cli])
  )

(defn -main [& _]
  (cli/start))
