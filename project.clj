(defproject org.clojars.bmabey/compojure "0.3.3"
  :description "0.3.3 compojure version compat with clojure 1.2"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 [commons-codec "1.3"]
                 [commons-io "1.4"]
                 [commons-fileupload "1.2.1"]
                 [org.mortbay.jetty/jetty "6.1.21"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]]
  :namespaces [compojure
               compojure.control
               compojure.html
               compojure.html.gen
               compojure.html.form-helpers
               compojure.html.page-helpers
               compojure.http
               compojure.http.routes
               compojure.http.request
               compojure.http.response
               compojure.http.session
               compojure.http.servlet
               compojure.http.helpers
               compojure.ns-utils
               compojure.server.common
               compojure.server.jetty
               compojure.str-utils
               compojure.validation])
