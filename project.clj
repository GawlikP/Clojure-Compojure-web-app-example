(defproject my-web-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins      [[lein-ring "0.12.5"]
                 [compojure "1.6.1"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring "1.8.1"]
                 [hiccup "1.0.5"]
                 [compojure "1.6.1"]]
  :ring {:handler my-web-project.core/handler
         :auto-reload? true
         :auto-refresh? false}
  ) 
