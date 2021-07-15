(ns examples)

[1 2 3 4]

[1 "two" 3 "four"]

[true 3 "four" 5]

[1 [true 3 "four" 5] 6]

[0 [1 [true 3 "four" 5] 6] 7]

(vector true 3 "four" 5)
; => [true 3 "four" 5]

(vector)
; => []

(def novels ["Emma" "Coma" "War and Peace"])

(count novels)
; => 3

(first novels)
; => "Emma"

(rest novels)
; => ("Coma" "War and Peace")

(rest (rest novels))
; => ("War and Peace")

(rest ["War and Peace"])
; => ()

(rest [])
; => ()

(def year-books ["1491" "April 1865" "1984" "2001"])

(def third-book (first (rest (rest year-books))))

(nth year-books 2)
; => "1984"

(year-books 2)
; => "1984"

(conj novels "Carrie")
; => ["Emma" "Coma" "War and Peace" "Carrie"]

(cons "Carrie" novels)
; => ("Carrie" "Emma" "Coma" "War and Peace")

'(1 2 3)

'(1 2 3 "four" 5 "six")

'(1 2.0 2.9999 "four" 5.001 "six")

'([1 2 ("a" "list" "inside" "a" "vector")] "inside" "a" "list")

(list 1 2 3 "four" 5 "six")
; => (1 2 3 "four" 5 "six")

(def poems '("Iliad" "Odyssey" "Now We Are Six"))

(count poems)
; => 3

(first poems)
; => "Iliad"

(rest poems)
; => ("Odyssey" "Now We Are Six")

(nth poems 2)
; => "Now We Are Six"

(conj poems "Jabberwocky")
; => ("Jabberwocky" "Iliad" "Odyssey" "Now We Are Six")

(def vector-poem ["Iliad" "Odyssey" "Now We Are Six"])

(conj vector-poem "Jabberwocky")
; => ["Iliad" "Odyssey" "Now We Are Six" "Jabberwocky"]

(def more-novels (conj novels "Jaws"))

; (defn escape-html [string]
;   (replace-all string [["&" "&amp;"]
;                        ["\"" "&quot;"]
;                        ["<" "&lt;"]
;                        [">" "&gt;"]]))

; (defroutes routes
;            [[["/" {:get home-page} ^:interceptors [bootstrap/html-body]]
;              ["/hiccup" {:get hiccup-page}]
;              ["/enlive" {:get enlive-page}]
;              ["/mustache" {:get mustache-page}]
;              ["/stringtemplate" {:get stringtemplate-page}]
;              ["/comb" {:get comb-page}]]])
