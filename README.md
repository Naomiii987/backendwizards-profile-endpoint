# Backend Wizards Profile Endpoint

This project is part of the HNG Backend Stage 0 Task.  
It is a simple REST API that returns my basic profile information in JSON format.

---

## Live API URL

Base URL:  
https://backendwizards-profile-endpoint-production.up.railway.app

To view the profile endpoint, visit:  
https://backendwizards-profile-endpoint-production.up.railway.app/me


---

## GitHub Repository

https://github.com/Naomiii987/backendwizards-profile-endpoint

---

## Features

- Returns profile data in JSON format containing:
  - `name`
  - `utc_time`
  - `track`
  - `status_code`

---

## Technologies Used

- Java 17
- Spring Boot
- Maven (Build & Dependency Management)
- Railway (Hosting Platform)
- GitHub (Version Control)

---

## Dependencies

These dependencies are managed via Maven and are defined in the `pom.xml` file:

| Dependency | Purpose |
|-------------|----------|
| `spring-boot-starter-web` | To build and run RESTful web applications |
| `spring-boot-starter-test` | For testing (JUnit, MockMVC, etc.) |
| `spring-boot-maven-plugin` | For packaging and running the Spring Boot application |

To install all dependencies:
```bash
mvn clean install
