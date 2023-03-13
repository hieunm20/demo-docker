FROM adoptopenjdk/openjdk11:latest
MAINTAINER com.example
USER spring
COPY target/demo-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]