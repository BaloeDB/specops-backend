FROM openjdk:21-slim
COPY target/specops-0.0.1-SNAPSHOT-plain.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
EXPOSE 443