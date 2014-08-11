(ns upc-integrity.core)

(defn get-int
  "Casts a char to an int."
  [character]
  (read-string (str character)))

(defn real-value-of
  "Returns the real value of the digit."
  [index digit]
  (if (even? (+ index 1))
    (get-int digit)
    (* (get-int digit) 3)))

(defn upc-sum
  "Sums all the real values of the upc."
  [upc]
  (reduce + (keep-indexed real-value-of upc)))

(defn check-digit-of
  "Returns the check digit of the upc."
  [upc]
  (- 9 (mod (- (upc-sum upc) 1) 10)))

(defn check-upc-integrity
  "Checks whether the upc is valid or not."
  [upc]
  (if (= (count upc) 12)
    (= (check-digit-of (take 11 upc)) (get-int (last upc)))))
