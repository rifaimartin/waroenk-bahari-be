# Stage 1: Build the application
FROM maven:3.6.3-jdk-8 AS build

# Set working directory
WORKDIR /app

# Copy source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:8-jre-slim

# Copy JAR file from build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]