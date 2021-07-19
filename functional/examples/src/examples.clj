(ns examples)

(def dracula {:title  "Dracula"
              :author "Stoker"
              :price  1.99
              :genre  :horror})

(defn cheap? [book]
  (when (<= (:price book) 9.99)
    book))

(defn pricey? [book]
  (when (> (:price book) 9.99)
    book))

(defn horror? [book]
  (when (= (:genre book) :horror)
    book))

(defn adventure? [book]
  (when (= (:genre book) :adventure)
    book))

(defn cheap-horror? [book]
  (when (and (cheap? book) (horror? book))
    book))

(defn pricey-adventure? [book]
  (when (and (pricey? book) (adventure? book))
    book))

(defn run-with-dracula [f]
  (f dracula))

(run-with-dracula pricey?)

(run-with-dracula horror?)

(defn both? [first-predicate-f second-predicate-f book]
  (when (and (first-predicate-f book) (second-predicate-f book))
    book))

(both? cheap? horror? dracula)

(both? pricey? adventure? dracula)

(defn cheaper-f [max-price]
  (fn [book]
    (when (<= (:price book) max-price)
      book)))

(def real-cheap? (cheaper-f 1.00))

(def kind-of-cheap? (cheaper-f 1.99))

(def marginally-cheap? (cheaper-f 5.99))

(defn both-f [predicate-f-1 predicate-f-2]
  (fn [book]
    (when (and (predicate-f-1 book) (predicate-f-2 book))
      book)))

(def cheap-horror? (both-f cheap? horror?))

(def real-cheap-adventure? (both-f real-cheap? adventure?))

(def real-cheap-horror? (both-f real-cheap? horror?))

(def cheap-horror-possession?
  (both-f
    cheap-horror?
    (fn [book] (= (:title book) "Possession"))))

(apply + [1 2 3 4])
; => 10

(def my-inc (partial + 1))

(def not-adventure? (complement adventure?))

(def cheap-horror? (every-pred cheap? horror?))

(def book {:title "Emma" :copies 1000})

(def new-book (update book :copies inc))

(def by-author {:name "Jane Austen" :book {:title "Emma" :copies 1000}})

(def new-by-author (update-in by-author [:book :copies] inc))
