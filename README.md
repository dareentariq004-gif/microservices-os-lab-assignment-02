# Food Ordering System – Microservices Architecture

## 1. Project Description

The Food Ordering System is a web-based application designed to simplify the process of ordering food online.

The system is developed using a Microservices Architecture, where each service is responsible for a specific business function. These services work together to provide a complete food ordering experience, starting from browsing the menu and placing an order to processing payments and managing deliveries.

The main goal of this project is to build a scalable, modular, and maintainable food ordering system using modern software technologies.

## 2. Microservices

The system consists of the following independent microservices:

- **Customer Service:** Manages customer information and profiles.
- **Menu Service:** Manages food menu items.
- **Order Service:** Handles customer orders.
- **Payment Service:** Manages payment operations.
- **Delivery Service:** Handles delivery operations.
- **API Gateway:** Provides a single entry point for accessing the microservices.
- **Eureka Server:** Handles service registration and discovery.

## 3. Technologies Used
- Java 17
- Spring Boot
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Gradle
- MySQL
- Docker
- Git and GitHub
- Postman

## 4. Service Ports

| Service | Port |
|---|---:|
| API Gateway | 8080 |
| Eureka Server | 8761 |
| Customer | 7777 |
| Order | 7776 |
| Menu | 7775 |
| Payment | 7774 |
| Delivery | 7773 |

## 5. Requirements
To run the project locally, you need:

- Java JDK 17
- MySQL Server
- IntelliJ IDEA or another Java IDE
- Docker Desktop (for Docker execution)

## 6. Running the Project Locally
1. Start the MySQL database server.
2. Configure the database connection in each microservice's application configuration.
3. Start the Eureka Server.
4. Start the microservices.
5. Start the API Gateway.

## 7. Docker Instructions

The Customer Service has been containerized and tested using Docker.

### Build the Docker Image

Open PowerShell inside the Customer directory:

```bash
.\gradlew.bat clean bootJar -x test
docker build -t customer-service:1.0 .
```

### Run the Docker Container

```bash
docker run -d --name customer-container -p 7778:7777 -e "SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:4306/customardb?serverTimezone=UTC" -e "EUREKA_CLIENT_ENABLED=false" customer-service:1.0
```

### Test the API

Send a GET request using Postman:

```text
http://localhost:7778/customers
```

## 8. Testing
The Customer Service Docker container was tested successfully. The API returned a successful HTTP 200 OK response through Postman.

## 9. Repository
GitHub Repository:

https://github.com/dareentariq004-gif/microservices-os-lab-assignment-02

## 10. Author
Developed as part of the Operating Systems Lab Assignment 02.