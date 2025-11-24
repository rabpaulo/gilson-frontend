(ns lambda-stock-front.util.inputs)

(defn ask[msg]
  (println msg)
  (flush)
  (read-line))
