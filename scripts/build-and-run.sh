#!/bin/bash
set -e

cd ..
./gradlew compileJava
./gradlew build
java -jar build/libs/vmdb-0.0.1-SNAPSHOT.jar
docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/gs-spring-boot-docker .
docker run -p 8080:8080 springio/gs-spring-boot-docker
