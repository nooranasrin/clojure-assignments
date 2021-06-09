(ns assignments.fibonacci-test
  (:require [clojure.test :as t]
            [assignments.fibonacci :as fib]))

(t/deftest ^:implemented fibonacci-seqs-test
  (t/testing "Should give the first fibnocci number"
    (t/is (= [0] (fib/fibonacci-seqs 1))))
  (t/testing "Should give the first two fibnocci numbers"
    (t/is (= [0 1] (fib/fibonacci-seqs 2))))
  (t/testing "Should give the first n fibnocci numbers"
    (t/is (= [0 1 1 2 3 5 8 13] (fib/fibonacci-seqs 8)))))

