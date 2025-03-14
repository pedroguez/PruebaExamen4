FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/pruebaexamen-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

ENTRYPOINT ["java", "-jar", "app.jar"]