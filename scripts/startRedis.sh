#! /bin/bash
# startRedis

docker run --name redis-rbac -p 6379:6379 -d --restart=always redis:latest redis-server --appendonly yes --requirepass "rbac"