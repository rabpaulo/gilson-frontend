(ns lambda-stock-front.util.cli
  (:require [lambda-stock-front.commands.requests :as requests])
  )

(def menu
  {"1" requests/show-stock
   "2" requests/register-buy
   "3" requests/register-sell
   "4" requests/show-statement
   "5" requests/show-balance})

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
