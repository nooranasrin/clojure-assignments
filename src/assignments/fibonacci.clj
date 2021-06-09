(ns assignments.fibonacci)

(defn add-fibo [[a b]] [b (+ a b)])

(defn fibonacci-seqs [n]
  (->> [0 1]
       (iterate add-fibo)
       (take n)
       (map first)))
