FROM openjdk:16-jdk-alpine

EXPOSE 8080

ADD target/autorization_rest-0.0.1-SNAPSHOT.jar authapp.jar

CMD ["java", "-jar", "/authapp.jar"]