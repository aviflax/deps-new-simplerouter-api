(ns {{top/ns}}.{{main/ns}}.ops.db.migrations
  (:require [migratus.core :as migratus]))


(def config {:store                :database
             :migration-dir        "migrations/"
             :init-script          "init.sql"
             :init-in-transaction? false
             :migration-table-name "_ops_migratus_migrations"
             :db {:connection-uri (get (System/getenv) "DB_URL")}})



(comment
  ; initialize the database using the 'init.sql' script
  (migratus/init config)

  ; apply pending migrations
  (migratus/migrate config)

  ; rollback the migration with the latest timestamp
  (migratus/rollback config)

  ; bring up migrations matching the ids
  (migratus/up config 20111206154000)

  ; bring down migrations matching the ids
  (migratus/down config 20111206154000)

  ; create a SQL migration
  (migratus/create config "seeds")
)
