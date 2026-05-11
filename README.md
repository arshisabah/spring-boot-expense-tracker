# 🚀 Expense Tracker API V2 (Spring Boot REST API)

A backend-focused Expense Tracker application built using Spring Boot and REST APIs.

This project demonstrates how modern backend systems handle HTTP requests, JSON data, business logic, and API architecture.

---

# 📌 Project Overview

Expense Tracker API V2 is a RESTful backend application that allows users to:

* Add expenses
* Fetch all expenses
* Delete expenses
* Calculate total spending
* Exchange data using JSON
* Test APIs using Postman

The project is designed to help transition from Core Java applications to real backend development using Spring Boot.

---

# 🎯 Objectives

The goal of this project is to learn:

* Spring Boot fundamentals
* REST API development
* HTTP methods
* JSON request/response handling
* Layered backend architecture
* Dependency Injection
* Controller-Service workflow
* Backend application structure

---

# 🛠️ Tech Stack

| Technology    | Purpose                     |
| ------------- | --------------------------- |
| Java 21       | Programming language        |
| Spring Boot   | Backend framework           |
| Maven         | Dependency management       |
| IntelliJ IDEA | Development IDE             |
| REST APIs     | Client-server communication |
| JSON          | Data exchange format        |
| Postman       | API testing                 |
| ArrayList     | In-memory data storage      |

---

# 📂 Project Structure

```bash
expense-tracker-api/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.expensetracker.expense_tracker_api/
│       │       ├── controller/
│       │       │   └── ExpenseController.java
│       │       │
│       │       ├── service/
│       │       │   └── ExpenseService.java
│       │       │
│       │       ├── model/
│       │       │   └── Expense.java
│       │       │
│       │       └── ExpenseTrackerApiApplication.java
│       │
│       └── resources/
│
└── pom.xml
```

---

# 🧠 Architecture

## 🔹 Controller Layer

### `ExpenseController.java`

Handles incoming HTTP requests.

Responsibilities:

* Process API requests
* Receive JSON payloads
* Return JSON responses
* Call service layer methods

Annotations used:

```java
@RestController
@RequestMapping
@GetMapping
@PostMapping
@DeleteMapping
@PathVariable
@RequestBody
```

---

## 🔹 Service Layer

### `ExpenseService.java`

Contains business logic.

Responsibilities:

* Store expenses
* Add expenses
* Delete expenses
* Calculate total spending
* Manage application data

Concepts used:

* ArrayList
* Lambdas
* Loops
* Business logic separation

---

## 🔹 Model Layer

### `Expense.java`

Represents expense entity.

Fields:

* id
* title
* amount
* category

Responsibilities:

* Store expense data
* Provide getters/setters
* Support JSON conversion

---

# 🔄 Application Workflow

```text
Client/Postman
       ↓
HTTP Request
       ↓
Controller Layer
       ↓
Service Layer
       ↓
ArrayList Storage
       ↓
JSON Response
```

---

# 🌐 REST API Endpoints

| Method | Endpoint          | Description          |
| ------ | ----------------- | -------------------- |
| GET    | `/expenses`       | Fetch all expenses   |
| POST   | `/expenses`       | Add new expense      |
| DELETE | `/expenses/{id}`  | Delete expense by ID |
| GET    | `/expenses/total` | Get total spending   |

---

# 📥 Sample API Requests

## ✅ Add Expense

### Endpoint

```http
POST /expenses
```

### Request Body

```json
{
  "id": 1,
  "title": "Pizza",
  "amount": 300,
  "category": "Food"
}
```

### Response

```text
Expense Added Successfully
```

---

## ✅ Get All Expenses

### Endpoint

```http
GET /expenses
```

### Response

```json
[
  {
    "id": 1,
    "title": "Pizza",
    "amount": 300,
    "category": "Food"
  }
]
```

---

## ✅ Delete Expense

### Endpoint

```http
DELETE /expenses/1
```

### Response

```text
Expense Deleted Successfully
```

---

## ✅ Get Total Expenses

### Endpoint

```http
GET /expenses/total
```

### Response

```text
760.0
```

---

# 🔥 Core Spring Boot Concepts Used

| Concept              | Purpose                       |
| -------------------- | ----------------------------- |
| @RestController      | REST API controller           |
| @Service             | Business logic layer          |
| @RequestMapping      | Base API path                 |
| @GetMapping          | Handle GET requests           |
| @PostMapping         | Handle POST requests          |
| @DeleteMapping       | Handle DELETE requests        |
| @RequestBody         | JSON → Java object conversion |
| @PathVariable        | Extract value from URL        |
| Dependency Injection | Automatic object management   |

---

# 📌 HTTP Methods Used

| Method | Usage       |
| ------ | ----------- |
| GET    | Fetch data  |
| POST   | Create data |
| DELETE | Remove data |

---

# 🔥 JSON Conversion Workflow

## Request Flow

```text
JSON Request
      ↓
Spring Boot
      ↓
Expense Object
```

---

## Response Flow

```text
Java Object/List
       ↓
Spring Boot
       ↓
JSON Response
```

---

# 🧪 API Testing

APIs were tested using:

* Postman
* Browser endpoints
* HTTP requests

Example URL:

```text
http://localhost:8080/expenses
```

---

# 📈 Learning Outcomes

This project helped in understanding:

* Backend architecture
* REST API development
* Spring Boot fundamentals
* Client-server communication
* JSON handling
* HTTP methods
* Dependency Injection
* Layered application design

---

# 🚀 Future Enhancements

## Version 3

* MySQL integration
* JPA/Hibernate
* Persistent database storage

## Version 4

* JWT Authentication
* User login system
* Role-based authorization

## Version 5

* Docker deployment
* Cloud hosting
* Microservices architecture

---

# 💡 Key Takeaways

This project demonstrates how modern backend APIs are built using Spring Boot.

It serves as a strong foundation for learning:

* Database integration
* Authentication
* Enterprise backend architecture
* Scalable API development

---

# 👨‍💻 Author

ARSHI SABAH

Java Backend Development Journey 🚀
