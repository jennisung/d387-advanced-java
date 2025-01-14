#FROM openjdk:17-jdk-alpine
#MAINTAINER baeldung.com
#COPY target/docker-java-jar-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


FROM openjdk:17-jdk-slim

WORKDIR /app

EXPOSE 8080

COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/myapp.jar

ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
