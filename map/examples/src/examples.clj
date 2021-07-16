(ns examples)

{"title" "Oliver Twist" "author" "Dickens" "published" 1838}

(hash-map "title" "Oliver Twist"
          "author" "Dickens"
          "published" 1838)

(def book {"title"     "Oliver Twist"
           "author"    "Dickens"
           "published" 1838})

(get book "published")
; => 1838

(book "published")
; => 1838

(def book {:title     "Oliver Twist"
           :author    "Dickens"
           :published 1838})

(println "Title:" (book :title))
; Title: Oliver Twist
; => nil

(println "By:" (book :author))
; By: Dickens
; => nil

(println "Published:" (book :published))
; Published: 1838
; => nil

(book :title)
; => "Oliver Twist"

(:title book)
; => "Oliver Twist"

(assoc book :page-count 362)
; => {:title "Oliver Twist", :author "Dickens", :published 1838, :page-count 362}

(assoc book :page-count 362 :title "War & Peace")
; => {:title "War & Peace", :author "Dickens", :published 1838, :page-count 362}

(dissoc book :published)
; => {:title "Oliver Twist", :author "Dickens"}

(dissoc book :title :author :published)
; => {}

(dissoc book :paperback :illustrator :favorite-zoo-animal)
; => {:title "Oliver Twist", :author "Dickens", :published 1838}

(assoc [:title :by :published] 1 :author)
; => [:title :author :published]

(keys book)
; => (:title :author :published)

(vals book)
; => ("Oliver Twist" "Dickens" 1838)

(def genres #{:sci-fi :romance :mystery})

(def authors #{"Dickens" "Austen" "King"})

(contains? authors "Austen")
; => true

(contains? genres "Austen")
; => false

(authors "Austen")
; => "Austen"

(genres :historical)
; => nil

(:sci-fi genres)
; => :sci-fi

(:historical genres)
; => nil

(def more-authors (conj authors "Clarke"))

(conj more-authors "Clarke")
; => #{"King" "Dickens" "Clarke" "Austen"}

(disj more-authors "King")
; => #{"Dickens" "Clarke" "Austen"}

(def db {:dbtype   "MySQL"
         :dbname   "books"
         :user     "russ"
         :password "noneofyourbeeswax"})

(book "title")
; => nil

(assoc book "title" "Pride and Prejudice")
; => {:title "Oliver Twist", :author "Dickens", :published 1838, "title" "Pride and Prejudice"}

(book :some-key-that-is-clearly-not-there)
; => nil

(def anonymous-book {:title "The Arabian Nights" :author nil})

(contains? anonymous-book :title)
; => true

(contains? anonymous-book :author)
; => true

(contains? anonymous-book :favorite-color)
; => false

(def possible-authors #{"Austen" "Dickens" nil})

(contains? possible-authors "Austen")
; => true

(contains? possible-authors "King")
; => false

(contains? possible-authors nil)
; => true

(first book)
; => [:title "Oliver Twist"]

(rest book)
; => ([:author "Dickens"] [:published 1838])

(count book)
; => 3
