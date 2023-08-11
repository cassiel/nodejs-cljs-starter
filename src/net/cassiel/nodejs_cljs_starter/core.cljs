(ns net.cassiel.nodejs-cljs-starter.core
  (:require [com.stuartsierra.component :as component]
            [net.cassiel.nodejs-cljs-starter.component.dummy :as dummy]))

;; This is a rather messy bootstrap. We need to bring up max-api and do a
;; promise-based fetch from a Max dictionary to get our configuration, before
;; we can actually bring up the whole system.

(defn boot-system []
  (component/system-map :dummy (dummy/map->DUMMY {})))

(defonce S (atom (boot-system)))

(defn start []
  (swap! S component/start))

(defn stop []
  (swap! S component/stop))

(start)
