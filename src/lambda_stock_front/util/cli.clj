(ns lambda-stock-front.util.cli)

(defn sla[]
  (println "funcionou")
  )
;;(def menu
;;  {"1" stocks/show-stock
;;   "2" trades/register-buy
;;   "3" trades/register-sell
;;   "4" trades/show-statement
;;   "5" wallet/show-balance})
(def menu 
  {"1" sla
  "2" sla})

(defn start []
    (println "\n1. Consultar ação")
    (println "2. Registrar compra")
    (println "3. Registrar venda")
    (println "4. Extrato")
    (println "5. Saldo")
    (println "0. Sair")
    (print "> ") 
    (flush)

    (let [ans (read-line)]
      (when (not= ans "0")
        (if-let [cmd (menu ans)]
          (cmd)
          (println "Opção inválida"))
        (recur))))

  ;:(let [opt (read-line)]
  ;:  (when (not= opt "0")
  ;:    (if-let [cmd (menu opt)]
  ;:      (cmd)
  ;:      (println "Opção inválida"))
  ;:    (recur)))))
