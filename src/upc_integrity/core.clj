(ns upc-integrity.core)

(defn real-value-of
  "Returns the real value of the digit."
  [digit]
  1)

(defn upc-sum
  "Sums all the real values of the upc."
  [upc]
  (apply + (map real-value-of upc)))

(defn check-digit-of
  "Returns the check digit of the upc."
  [upc]
  (- 9 (mod (- (upc-sum upc) 1) 10)))

(defn check-upc-integrity
  "Checks whether the upc is valid or not."
  [upc]
  (if (= (count upc) 12)
    (= (check-digit-of upc) (last upc))
    false))
