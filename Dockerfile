FROM C:\Program Files\Java\jdk-11.0.16.1
MAINTAINER com.example
RUN addgroup --system spring && adduser -S -s /bin/false -G spring spring
USER spring
COPY target/demo-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]