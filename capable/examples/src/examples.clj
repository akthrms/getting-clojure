(ns examples)

(defn greet
  ([to-whom] (greet "Welcome to Blotts Books" to-whom))
  ([message to-whom] (println message to-whom)))

(defn print-any-args [& args]
  (println "My arguments are:" args))

(print-any-args 7 true nil)
; My arguments are: (7 true nil)
; => nil

(defn first-argument [& args]
  (first args))

(defn new-first-argument [x & args] x)

(defn dispatch-book-format [book]
  (cond
    (vector? book) :vector-book
    (contains? book :title) :standard-map
    (contains? book :book) :alternative-map))

(defmulti normalize-book dispatch-book-format)

(defmethod normalize-book :vector-book [book]
  {:title (first book) :author (second book)})

(defmethod normalize-book :standard-map [book]
  book)

(defmethod normalize-book :alternative-map [book]
  {:title (:book book) :author (:by book)})

(normalize-book {:title "War and Peace" :author "Tolstoy"})
; => {:title "War and Peace", :author "Tolstoy"}

(normalize-book {:book "Emma" :by "Austen"})
; => {:title "Emma", :author "Austen"}

(normalize-book ["1984" "Orwell"])
; => {:title "1984", :author "Orwell"}

(defn dispatch-published [book]
  (cond
    (< (:published book) 1928) :public-domain
    (< (:published book) 1978) :old-copyright
    :else :new-copyright))

(defmulti compute-royalties dispatch-published)

(defmethod compute-royalties :public-domain [book] 0)

(defmethod compute-royalties :old-copyright [book])

(defmethod compute-royalties :new-copyright [book])

(def books [{:title "Pride and Prejudice" :author "Austen" :genre :romance}
            {:title "World War Z" :author "Brooks" :genre :zombie}])

(defmulti book-description :genre)

(defmethod book-description :romance [book]
  (str "The heart warming new romance by " (:author book)))

(defmethod book-description :zombie [book]
  (str "The heart consuming new zombie adventure by " (:author book)))

(def ppz {:title  "Pride and Prejudice and Zombies"
          :author "Grahame-Smith"
          :genre  :zombie-romance})

(defmethod book-description :zombie-romance [book]
  (str "The heart warming and consuming new romance by " (:author book)))
