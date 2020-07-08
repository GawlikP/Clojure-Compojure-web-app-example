(ns my-web-project.myview
  (:use hiccup.page hiccup.element)
  )

(defn index-page[]
  (html5
    [:html
     [:head]
     [:body "INDEX"]]
    )
  )

(defn test-page
  [zmienna] 
  (def n "Zobaczymy co wpisales")

  (html5
    [:html
     [:head]
     [:body 
      [:p "Zobaczymy co wpisales"]
      n
      [:b zmienna]
      ]
     ]
  )
)
(defn params-test
  [params]
  (html5
    [:html
    [:head]
    [:body
      
     ]
     ]
    )
  )
