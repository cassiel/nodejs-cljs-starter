(ns user
  (:require [net.cassiel.nodejs-cljs-starter.core :as core]))

(core/stop)

(core/start)


(-> core/S deref :dummy)
