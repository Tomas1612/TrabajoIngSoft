FROM openjdk:8-jre-alpine

RUN apk add --no-cache bash

WORKDIR /opt

COPY target/*-SNAPSHOT.jar .

ENV JAVA_OPTS="-Xms32m -Xmx128m"

ENTRYPOINT exec java $JAVA_OPTS -jar *-SNAPSHOT.jar
