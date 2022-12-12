(let
 [filt (fn [f coll]
         (when (< 0 (count coll))
           (let [[fst & rst] coll]
             (if (f fst)
               (conj (filt f rst) fst)
               (filt f rst)))))]
  (filt odd? (range 10)))

