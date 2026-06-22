# 🛒 Simple E-Commerce Store (Spring Boot)

A backend REST API for a simple e-commerce system built using Spring Boot.  
It supports authentication, product management, and MySQL database integration.

---

## ⚙️ Tech Stack

- Java 17
- Spring Boot
- Spring Security (JWT-based authentication)
- Spring Data JPA
- MySQL
- Maven

---

## ✨ Features

### 👤 Authentication
- User Registration
- User Login
- JWT-based security

### 📦 Product Management
- Create Product
- Get All Products
- Get Product by ID
- Update Product
- Delete Product

### 🔐 Security
- Spring Security integration
- Protected API endpoints
- Role-based structure (ready for upgrade)

---

## 📂 Project Structure
controller → API endpoints
service → business logic
repository → database layer
entity → database models
dto → request/response objects
security → JWT + security config


---

## 🗄️ Database Setup (MySQL)

Create database:

```sql
CREATE DATABASE ecommerce_store;

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
▶️ How to Run
1. Clone repo
git clone https://github.com/roshanchitrang9307-gif/simple-ecommerce-store.git
2. Open project
3. Run MySQL server
4. Run Spring Boot app
mvn spring-boot:run
🔥 API Endpoints
Auth
POST /api/auth/register
POST /api/auth/login
Products
GET    /api/products
GET    /api/products/{id}
POST   /api/products
PUT    /api/products/{id}
DELETE /api/products/{id}
Future Improvements
Full JWT token implementation
Role-based access (ADMIN / USER)
Frontend (React or HTML UI)
Payment gateway integration
Order management system
