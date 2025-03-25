FROM gradle:7.2.0-jdk AS builder

WORKDIR /app
COPY . .
RUN gradlew clean build --no-daemon

FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=./build/libs/docker_0320-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /docker_0320.jar
ENTRYPOINT [ "java", "-jar", "/docker_0320.jar" ]