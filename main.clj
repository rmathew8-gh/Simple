;; (reduce + (range 10))              
;; (transduce xform f coll)
;; (transduce xform f init coll)

(let
 [map (fn [f coll]
        (when (< 0 (count coll))
          (conj (map f (rest coll))
                (f (first coll)))))]
  (map inc [1 2 3]))
