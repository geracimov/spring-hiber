#!/usr/bin/env bash
docker-compose down
docker rm -f spring-hiber-container
docker rmi -f spring-hiber-image
mvn clean package
docker build . -t spring-hiber-image
#docker run -p 8080:8080 --name spring-hiber-container spring-hiber-image
#docker logs -f spring-hiber-container
docker-compose up