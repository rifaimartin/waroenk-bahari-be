# WMB Backend

This is a mini project built using SpringBoot framework. It includes the following features:

- Swagger documentation for API endpoints
- Data persistence using JPA and MySQL database
- Support for multiple database connections (H2, PostgreSQL, MYSQL)
- Lombok annotations for code generation
- Unit tests using JUnit and AssertJ

## Getting Started

To run this project, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/rifaimartin/waroenk-bahari-be
   ```

2. Navigate to the project directory:

   ```
   cd wmb-backend
   ```

3. Build and run using Maven:

   ```
   mvn clean package
   java -jar target/wmb-backend-0.0.1-SNAPSHOT.jar
   ```

   Alternatively, you can use SpringBoot's embedded Tomcat server:

   ```
   mvn spring-boot:run
   ```

4. Open your web browser and go to `http://localhost:9090` to access Swagger documentation.

## Configuration

The project uses SpringBoot's `application-*.properties` files to provide configuration options based on environment variables:

- `application-local`: used during development or local testing
- `application-dev`: used for development or staging environments
- `application-prod`: used for production environments

You can override these properties by creating a `application.properties` file in your preferred environment.

## Database Connections

The project supports multiple database connections using SpringBoot's `DataSource` abstraction. By default, it uses MySQL database, but you can change it by providing the appropriate configuration in `application-*.properties` files.

Here's an example of how to configure H2 database:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
```

And here's an example of how to configure PostgreSQL database:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/wmb-db
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=org.postgresql.Driver
```

## Swagger Documentation

The project uses SpringFox's Swagger to generate API documentation. You can access it by going to `http://localhost:8080/swagger-ui.html`.

Here's an example of how to use Swagger to generate API documentation:

![Swagger Documentation](https://i.imgur.com/V8VVVVV.png)

## Unit Tests

The project includes unit tests using JUnit and AssertJ. You can run them using Maven:

```
mvn test
```

Here's an example of how to use AssertJ to assert test results:

```java
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    void testExample() {
        // given
        int expected = 42;
        int actual = 42;

        // when
        // nothing to do here

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
```

## Contributing

If you want to contribute to this project, please follow these guidelines:

1. Fork the repository
2. Create a new branch (e.g. `add-feature-x`)
3. Implement your changes
4. Write tests for your new feature
5. Push your changes to the branch
6. Submit a pull request
7. Wait for review and merge
