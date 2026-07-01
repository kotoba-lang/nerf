(ns nerf-test
  (:require [clojure.test :refer [deftest is testing]]
            [nerf]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? nerf))))
