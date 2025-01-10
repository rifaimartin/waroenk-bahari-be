FROM eclipse-temurin:8-jdk-alpine as builder
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw package -DskipTests

FROM eclipse-temurin:8-jre-alpine
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]