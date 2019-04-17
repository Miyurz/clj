(defn multiarity
  ([]     (multiarity "Hello" "friend!"))
  ([msg msg2] (println msg msg2)))

(multiarity "Good Morning!" "Good day!")
(multiarity)


(defn variadic
  [greeting & who]
  (println greeting who)
  )

(variadic "override" "one" "two" "three")
