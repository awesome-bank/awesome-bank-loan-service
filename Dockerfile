FROM openjdk:11-slim as build

COPY target/loan-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]