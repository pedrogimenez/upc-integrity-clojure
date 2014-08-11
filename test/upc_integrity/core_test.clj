(ns upc-integrity.core-test
  (:require [clojure.test :refer :all]
            [upc-integrity.core :refer :all]))

(deftest test-check-upc-integrity
  (testing "Returns true when the upc is valid."
    (is (true? (check-upc-integrity "013800151735")))))

(deftest test-check-digit-of
  (testing "Returns the check digit of the upc."
    (is (= (check-digit-of "01380015173") 5))))

(deftest test-upc-sum
  (testing "Returns the sum of the real values of the upc."
    (is (= (upc-sum "01380015173") 45))))

(deftest test-real-value-of
  (testing "Returns the real value of an upc digit."
    (is (= (real-value-of 1 \1) 1))))

(deftest test-real-value-of-something
  (testing "Returns the real value of an upc digit."
    (is (= (real-value-of 2 \3) 9))))
