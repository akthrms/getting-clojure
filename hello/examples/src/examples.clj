(ns examples)

(println "Hello, world!")
; Hello, world!
; => nil

(str "Clo" "jure")
; => "Clojure"

(str "Hello," " " "world" "!")
; => "Hello, world!"

(str 3 " " 2 " " 1 " Blast off!")
; => "3 2 1 Blast off!"

(count "Hello, world")
; => 12

(count "Hello")
; => 5

(count "")
; => 0

(println true)
; true
; => nil

(println false)
; false
; => nil

(println "Nobody's home:" nil)
; Nobody's home: nil
; => nil

(println "We can print many things:" true false nil)
; We can print many things: true false nil
; => nil

(+ 1900 84)
; => 1984

(* 16 124)
; => 1984

(- 2000 16)
; => 1984

(/ 25792 13)
; => 1984

(/ (+ 1984 2010) 2)
; => 1997

(+ 1000 500 500 1)
; => 2001

(- 2000 10 4 2)
; => 1984

(/ (+ 1984.0 2010.0) 2.0)
; => 1997.0

(def first-name "Russ")

(def the-average (/ (+ 20 40.0) 2))

(defn hello-world []
  (println "Hello, world!"))

(hello-world)
; Hello, world!
; => nil

(defn say-welcome [what]
  (println "Welcome to" what))

(say-welcome "Clojure")
; Welcome to Clojure
; => nil

(defn average [a b]
  (/ (+ a b) 2))

(average 5.0 10.0)
; => 7.5

(defn chatty-average [a b]
  (println "chatty-average function called")
  (println "** first argument:" a)
  (println "** second argument:" b)
  (/ (+ a b) 2))

(chatty-average 10 20)
; chatty-average function called
; ** first argument: 10
; ** second argument: 20
; => 15
