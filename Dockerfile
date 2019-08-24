FROM openjdk

WORKDIR /app

COPY build/libs/*.jar /app

EXPOSE 8080

CMD ["java", "-jar",  "microservice1-1.0.jar"]