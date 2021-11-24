FROM openjdk:11-slim as build

COPY target/loan-0.0.1-SNAPSHOT.jar loan-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "loan-0.0.1-SNAPSHOT.jar"]