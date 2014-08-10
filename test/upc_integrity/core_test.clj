(ns upc-integrity.core-test
  (:require [clojure.test :refer :all]
            [upc-integrity.core :refer :all]))

(deftest test-check-upc-integrity
  (testing "Returns true when the upc is valid."
    (is (true? (check-upc-integrity "013800151735")))))

(deftest test-real-value-of
  (testing "Returns the real value of an upc digit."
    (is (= (real-value-of "0") 1))))

(deftest test-upc-sum
  (testing "Returns the sum of the real values of the upc."
    (is (= (upc-sum "013800151735") 12))))
