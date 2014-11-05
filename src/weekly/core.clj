(ns weekly.core
  (:require clojure.set)
  (:gen-class))

(defn triangle-number
  ([n]
     (triangle-number n 0))
  ([n acc]
     (if (zero? n)
       acc
       (triangle-number (dec n) (+ acc n)))))

(defn triangle-number-recur
  ([n]
     (triangle-number-recur n 0))
  ([n acc]
     (if (zero? n)
       acc
       (recur (dec n) (+ acc n)))))

(defn sum-of-3-5
  [n]
  (apply + (set (clojure.set/union (range 0 n 3)
                                   (range 0 n 5)))))

(defn sum-of-3-5-for
  [n]
  (apply + (for [x (range n)
                 :when (or (zero? (rem x 3))
                           (zero? (rem x 5)))]
             x)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
