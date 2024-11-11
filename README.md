# Spring Boot SQLite Example

Welcome to the **Spring Boot SQLite Example** project! This repository contains a simple Spring Boot application that demonstrates how to integrate SQLite as an embedded database. This project is perfect for learning and understanding how to work with Spring Boot and an embedded database for development and testing purposes.

## Project Overview

This project walks you through creating a Spring Boot application from scratch that uses SQLite as an embedded database. We start by setting up the project using Spring Initializr, creating the data model, configuring the data source, and exposing REST APIs to interact with the data.

### Features

- **Spring Boot Integration**: Uses Spring Boot to create a RESTful application.
- **SQLite Embedded Database**: Lightweight database perfect for prototyping and testing.
- **CRUD Operations**: Basic CRUD operations using Spring Data JPA.
- **Well-Structured Codebase**: Organized into packages for configurations, domain models, repositories, and controllers.

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven
- IDE of your choice (e.g., IntelliJ, VS Code)

### Cloning the Repository

You can clone this repository using any of the following methods:

- **HTTPS Clone URL**: `https://github.com/imsma/springboot-sqlite.git`
- **SSH Clone URL**: `git@github.com:imsma/springboot-sqlite.git`
- **GitHub CLI Command**: `gh repo clone imsma/springboot-sqlite`

### Project Setup

To set up the project locally, follow these steps:

1. Clone the repository:
   ```sh
   git clone https://github.com/imsma/springboot-sqlite.git
   cd springboot-sqlite
   ```
2. Open the project in your IDE.
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

The application should now be running on `http://localhost:8080`.

## Project Structure

- **config**: Contains configuration classes (e.g., for the database).
- **domain**: Contains the entity classes.
- **repository**: Contains repository interfaces for data access.
- **web/controller**: Contains REST controllers for API endpoints.

## API Endpoints

- **Get All Users**: `GET /users`
- **Create User**: `POST /users` (Content-Type: `application/json`)

### Example API Requests

We recommend using the REST Client extension for VS Code to test the APIs. You can create a directory named `src/test/http` and add a `test.http` file to test the APIs as follows:

```http
### Get All Users
GET http://localhost:8080/users

### Create User
POST http://localhost:8080/users
Content-Type: application/json

{
    "name": "Kim Doe",
    "email": "kim@test.com"
}
```

## Configuration

Make sure to configure the `application.yml` file under `src/main/resources`:

```yaml
spring:
  datasource:
    url: jdbc:sqlite:mydatabase.db
    driver-class-name: org.sqlite.JDBC
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate.dialect: org.hibernate.dialect.SQLiteDialect
    show-sql: true
```

## Additional Tips

- **Testing**: We highly recommend adding unit and integration tests to ensure the stability of your application.
- **Data Initialization**: You can use `@PostConstruct` or Spring Boot features to initialize some dummy data for testing.
- **Production Readiness**: SQLite is great for development, but for production, consider using a more robust database like PostgreSQL or MySQL.
- **Security**: Ensure that endpoints are properly secured using Spring Security for production environments.

## Resources

For more detailed steps on creating this application, please refer to the related article at [https://sma.im](https://sma.im).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to reach out or open an issue on GitHub.

Happy coding, and don’t forget to ⭐ the repo if you found this helpful!

---

Thanks for checking out this Spring Boot SQLite example. If you want more articles, guides, and tutorials, make sure to visit my blog: [https://sma.im](https://sma.im).
