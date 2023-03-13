FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
MAINTAINER com.example
USER spring
COPY target/spring-boot-docker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]