FROM openjdk:8-jdk-alpine
MAINTAINER vmdb
COPY build/libs/vmdb-0.0.1-SNAPSHOT.jar vmdb-1.0.0.jar
ENTRYPOINT ["java","-jar","vmdb-1.0.0.jar"]