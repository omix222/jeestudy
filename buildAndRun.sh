#!/bin/sh
mvn clean package && docker build -t jeestudy/jeefirst .
docker rm -f jeefirst || true && docker run -d -p 8080:8080 -p 4848:4848 -p 8082:8082 --name jeefirst jeestudy/jeefirst
