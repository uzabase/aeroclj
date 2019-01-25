(defproject uzabase/aeroclj "0.1.3-SNAPSHOT"
  :description "Idiomatic Clojure wrapper around AeroSpike Java client."
  :url "https://github.com/codemomentum/aeroclj"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.aerospike/aerospike-client "4.3.0"]]
  :min-lein-version "2.4.3"
  ;release
  :scm {:name "git"
        :url "https://github.com/codemomentum/aeroclj"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"})
