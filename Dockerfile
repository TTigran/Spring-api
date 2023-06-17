FROM openjdk:17 AS builder

WORKDIR /app

COPY target/Spring-api-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","Spring-api-0.0.1-SNAPSHOT.jar"]