#  Banking Application
The **Banking Application* is a RESTful web application developed using **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL**. It provides a simple and efficient way to manage bank accounts through REST APIs.

The application follows a layered architecture consisting of **Controller**, **Service**, **Repository**, **Entity**, **DTO**, and **Mapper** layers, making the code modular, maintainable, and easy to extend.

Users can perform all basic banking account operations such as creating a new account, retrieving account details, updating account information, and deleting an account. The application uses **Spring Data JPA** for database operations and **MySQL** as the backend database. All APIs were tested using **Postman** to ensure correct functionality.

This project demonstrates the implementation of RESTful API development, CRUD operations, object mapping using DTOs, database integration, and clean architecture following Spring Boot best practices.

##  Features

- Create a new bank account
- View all bank accounts
- View account details by ID
- Update account holder information and balance
- Delete an existing account
- RESTful API implementation
- MySQL database integration
- DTO and Mapper pattern
- Layered Architecture
- Postman API testing

##  Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA


##  Project Structure

```
src
 ├── controller
 ├── dto
 ├── entity
 ├── mapper
 ├── repository
 ├── service
 └── exception
```

##  Installation

```bash
git clone https://github.com/Shambhavisharma13/Banking-App.git
```
## Learning Outcomes

Through this project, I gained hands-on experience with:

- Developing REST APIs using Spring Boot
- Building CRUD applications with Spring Data JPA
- Integrating Spring Boot with MySQL
- Using DTOs and Mapper classes for clean code
- Layered architecture (Controller → Service → Repository)
- Testing APIs using Postman
- Managing dependencies using Maven
- Version control using Git and GitHu

Open in IntelliJ and run:

```
BankingApplication.java
```

##  API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /api/accounts | Create Account |
| GET | /api/accounts/{id} | Get Account |
| PUT | /api/accounts/{id}/deposit | Deposit |
| PUT | /api/accounts/{id}/withdraw | Withdraw |
| DELETE | /api/accounts/{id} | Delete Account |


#  Screenshots

## Database Table

![Database Table](src/Screenshots/Table.png)

---

##  POST API

![POST API](src/Screenshots/Post%20Api.png)

---

##  GET API

![GET API](src/Screenshots/Get%20Api.png)

## 🔄 PUT API

![PUT API](src/Screenshots/put%20Api.png)
--

## 🔹 Get All Accounts

![Get All Accounts](src/Screenshots/Get%20Api.png)
--

### 🔹 Delete Account

![Delete Account](src/Screenshots/Delete%20Api.png)
--

### 🔹 MySQL Database

![MySQL Database](src/Screenshots/DELETE%20DATABASE.png)
--

## Author

**Shambhavi Sharma**

- GitHub: https://github.com/Shambhavisharma13

