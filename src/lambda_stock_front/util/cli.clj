(ns lambda-stock-front.util.cli
  (:require [lambda-stock-front.commands.requests :as requests])
  )

(defn ask[msg]
  (println msg)
  (flush)
  (read-line))

(defn show-stock[]
  (let [ticker (ask "Ticker: ")]
    (println (requests/stock ticker))))

(defn buy-menu[]
  (let [ticker (ask "Ticker: ")
        qtd (ask "Quantidade: ")]
    (println (requests/buy ticker qtd))))

(defn sell-menu[]
  (let [ticker (ask "Ticker: ")
        qtd (ask "Quantidade: ")]
   (println (requests/sell ticker qtd))))

(defn show-statement[]
  (let [start (ask "Início (AAAA-MM-DD): ")
        end   (ask "Fim (AAAA-MM-DD): ")]
    (println (requests/statement start end))))

(defn show-balance[]
  (println (requests/balance)))

(def menu
  {"1" show-stock
   "2" buy-menu
   "3" sell-menu
   "4" show-statement
   "5" show-balance})

(defn start []
    (println "\n1. Consultar ação")
    (println "2. Registrar compra")
    (println "3. Registrar venda")
    (println "4. Extrato")
    (println "5. Saldo")
    (println "6. Sair")
    (print "> ") 
    (flush)

    (let [ans (read-line)]
      (when (not= ans "6")
        (if-let [cmd (menu ans)]
          (cmd)
          (println "Opção inválida"))
        (recur))))

