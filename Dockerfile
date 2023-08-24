FROM openjdk:17
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-docker.jar"]