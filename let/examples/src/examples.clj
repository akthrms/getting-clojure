(ns examples)

(defn compute-discount-amount [amount user-name user-discounts min-charge]
  (let [discount-percent (user-discounts user-name)
        discount (* amount discount-percent)
        discounted-amount (* amount (- 1.0 discount))]
    (println "Discount:" discount)
    (println "Discounted amount:" discounted-amount)
    (if (> discounted-amount min-charge)
      discounted-amount
      min-charge)))

(def user-discounts {"Nicholas" 0.10 "Jonathan" 0.07 "Felicia" 0.05})

(defn mk-discount-price-f [user-name user-discounts min-charge]
  (let [discount-percent (user-discounts user-name)]
    (fn [amount]
      (let [discount (* amount discount-percent)
            discounted-amount (* amount (- 1.0 discount))]
        (if (> discounted-amount min-charge)
          discounted-amount
          min-charge)))))

(def compute-felicia-price (mk-discount-price-f "Felicia" user-discounts 10.0))

(compute-felicia-price 20.0)
; => 10.0
