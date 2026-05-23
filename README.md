# JobListing Backend

Robust Spring Boot REST API for a modern Job Listing platform.

## Overview

This repository contains the backend service for the Job Listing application.  
It provides RESTful APIs for job management, authentication, applications, and search functionality.

### Frontend Repository
[JobListing Frontend](https://github.com/lensen-degife/joblisting-frontend)

---

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Security
- JWT Authentication (planned)
- Maven
- MongoDB
- Swagger UI

---

## Features

- Create, update, delete, and view jobs
- Job search and filtering
- User authentication & authorization
- Job application management
- RESTful API architecture
- Swagger API documentation

---

## Getting Started

### Prerequisites

Make sure you have installed:

- Java 17+
- Maven
- MongoDB

---

## Installation

### 1. Clone the repository

```bash
git clone https://github.com/lensen-degife/JobListing-backend.git
cd JobListing-backend
```

### 2. Configure MongoDB

Edit:

```properties
src/main/resources/application.properties
```

Example configuration:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/joblisting
spring.data.mongodb.database=joblisting
```

### 3. Run the application

Using Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or:

```bash
mvn spring-boot:run
```

---

## API Documentation

After starting the server, open:

```text
http://localhost:8080/swagger-ui.html
```

---

## Example API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/jobs` | Get all jobs |
| GET | `/api/jobs/search` | Search jobs |
| POST | `/api/jobs` | Create a new job |
| PUT | `/api/jobs/{id}` | Update a job |
| DELETE | `/api/jobs/{id}` | Delete a job |
| POST | `/api/auth/login` | User login |

---

## Project Structure

```text
src/main/java/com/lensen/joblisting/
├── controller/
├── service/
├── repository/
├── model/
├── dto/
└── security/
```

---

## Future Improvements

- JWT authentication
- Role-based authorization
- Resume upload support
- Docker support
- CI/CD pipeline
- Unit & integration testing

---
