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
