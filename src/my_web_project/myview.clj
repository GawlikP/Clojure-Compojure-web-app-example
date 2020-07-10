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
     [:h1
      (if (= (get(params :params) :name1) "test")
        (list [:p "Ty to dziala"])
        (list [:p "No chyba nie wpisales test"])
        )   
      ] 
    ]
     ]
    )
  )
