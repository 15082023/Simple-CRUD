FROM openjdk:17
COPY testApi-0.0.1-SNAPSHOT.jar ./spring-docker.jar
CMD ["java", "-jar", "./spring-docker.jar"]