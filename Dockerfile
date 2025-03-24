FROM gradle:8.3-jdk AS builder

WORKDIR /app

VOLUME ["/home/gradle/.gradle"]

COPY . .

RUN ./gradlew clean build --no-daemon

FROM openjdk:17

WORKDIR /app

ARG JAR_FILE=/build/libs/docker_0320-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /docker_0320.jar

ENTRYPOINT [ "java","-jar","/docker_0320.jar" ]
