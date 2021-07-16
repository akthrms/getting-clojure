(ns examples)

(defn print-greeting [preferred-customer]
  (if preferred-customer
    (println "Welcome back to Blotts Books!")
    (println "Welcome to Blotts Books!")))

(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    0.00
    (* order-amount 0.10)))

(= 1 1)
; => true

(= 2 (+ 1 1))
; => true

(= "Anna Karenina" "Jane Eyre")
; => false

(= "Emma" "Emma")
; => true

(= (+ 2 2) 4 (/ 40 10) (* 2 2) (- 5 1))
; => true

(= 2 2 2 2 3 2 2 2 2 2)
; => false

(not= "Anna Karenina" "Jane Eyre")
; => true

(not= "Anna Karenina" "Anna Karenina")
; => false

(number? 1984)
; => true

(number? "Anna Karenina")
; => false

(string? "Anna Karenina")
; => true

(keyword? "Anna Karenina")
; => false

(keyword? :anna-karenina)
; => true

(map? :anna-karenina)
; => false

(map {:title 1984})
; => true

(vector? 1984)
; => false

(vector? [1984])
; => true

(defn shipping-surcharge? [preferred-customer express oversized]
  (and (not preferred-customer) (or express oversized)))

(if 1
  "I like science fiction!"
  "I like mysteries!")
; => "I like science fiction!"

(if "hello"
  "I like science fiction!"
  "I like mysteries!")
; => "I like science fiction!"

(if [1 2 3]
  "I like science fiction!"
  "I like mysteries!")
; => "I like science fiction!"

(if false
  "I like science fiction!"
  "I like mysteries!")
; => "I like mysteries!"

(if nil
  "I like science fiction!"
  "I like mysteries!")
; => "I like mysteries!"

(if 0 "yes" "no")
; => "yes"

(if 1 "yes" "no")
; => "yes"

(if 1.0 "yes" "no")
; => "yes"

(if :russ "yes" "no")
; => "yes"

(if "Russ" "yes" "no")
; => "yes"

(if "true" "yes" "no")
; => "yes"

(if "false" "yes" "no")
; => "yes"

(if "nil" "yes" "no")
; => "yes"

(if [] (println "An empty vector is true!"))
; An empty vector is true!
; => nil

(if [1 2 3] (println "So is a populated vector!"))
; So is a populated vector!
; => nil

(if {} (println "An empty map is true!"))
; An empty map is true!
; => nil

(if {:title "Make Room! Make Room!"} (println "So is a full map!"))
; So is a full map!
; => nil

(if () (println "An empty list is true!"))
; An empty list is true!
; => nil

(if '(:full :list) (println "So is a full list!"))
; So is a full list!
; => nil

(do
  (println "This is four expressions.")
  (println "All grouped together as one")
  (println "That prints some stuff and then evaluates to 44")
  44)
; This is four expressions.
; All grouped together as one
; That prints some stuff and then evaluates to 44
; => 44

(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    (do
      (println "Preferred customer, free shipping!")
      0.00)
    (do
      (println "Regular customer, charge them for shipping.")
      (* order-amount 0.10))))

(defn shipping-charge [preferred-customer order-amount]
  (cond
    preferred-customer 0.0
    (< order-amount 50.0) 5.0
    (< order-amount 100.0) 10.0
    :else (* order-amount 0.10)))

(defn customer-greeting [status]
  (case status
    :gold "Welcome, welcome, welcome back!!!"
    :preferred "Welcome back!"
    "Welcome to Blotts Books"))

(def book {:title "Emma"})

(defn publish-book [book]
  (when (not (:title book))
    (throw
      (ex-info "A book needs a title" {:book book}))))

(try
  (publish-book book)
  (catch ArithmeticException e (println "Math problem."))
  (catch StackOverflowError e (println "Unable to publish..")))

(and true 1984)
; => 1984

(and 2001 "Emma")
; => "Emma"

(and 2001 nil "Emma")
; => nil
