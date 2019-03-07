#! /bin/bash
# startMySql

docker run --name mysql-rbac -p 3306:3306 -e MYSQL_ROOT_PASSWORD="rbac123456" -d mysql