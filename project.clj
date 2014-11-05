(defproject weekly "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot weekly.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :java-source-paths ["java"]

  :repl-options {:welcome (println "Welcome to the magical world of Clojure!")}
  )
