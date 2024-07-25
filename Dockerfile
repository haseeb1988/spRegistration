FROM eclipse-temurin:17
WORKDIR /app
COPY target/spRegistration-0.0.1-SNAPSHOT.jar /app/spRegistration-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","spRegistration-0.0.1-SNAPSHOT.jar"]