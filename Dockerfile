FROM openjdk:8-jre-alpine

RUN apk add --no-cache bash

WORKDIR /opt

COPY server/target/nonrest-0.0.1-SNAPSHOT.jar .

ENV PORT=8080

EXPOSE 8080

CMD ["java", "-Xms32m", "-Xmx128m", "-jar", "-Dserver.port=${PORT}", "nonrest-0.0.1-SNAPSHOT.jar"]