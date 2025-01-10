# Use a specific JDK 8 image that works well with Lombok
FROM maven:3.6.3-jdk-8

# Set working directory
WORKDIR /app

# Copy the project files
COPY . .

# Add Maven settings to fix Lombok
COPY settings.xml /root/.m2/settings.xml

# Build with specific Maven options
RUN mvn clean package -DskipTests -Dmaven.compiler.fork=true \
    -Dmaven.compiler.source=1.8 \
    -Dmaven.compiler.target=1.8

# Run stage
FROM openjdk:8-jre-slim
COPY --from=0 /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]