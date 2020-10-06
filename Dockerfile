FROM openjdk:8-jdk-alpine
EXPOSE 9090
ADD target/springboot-demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]