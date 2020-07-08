(ns my-web-project.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [my-web-project.myview :as index-view])
  )

(defroutes app-routes
  (GET "/" [] (index-view/index-page))
  (GET "/test/:id" [id] (index-view/test-page id))
  (GET "/request" request (str (get (request :params) :name1)))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes)
  )
  
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
