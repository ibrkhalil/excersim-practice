(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (let [success-rate (cond
                       (< speed 1) 0.0
                       (< speed 5) 1.0
                       (<= speed 8) 0.9
                       (< speed 10) 0.8
                       (= speed 10) 0.77)]
    (* speed 221 success-rate)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (quot (production-rate speed) 60)))
