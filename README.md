# 🛒 Simple Ecommerce Store - Spring Boot REST API

[![build](https://github.com/roshanchitrang9307-gif/simple-ecommerce-store/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/roshanchitrang9307-gif/simple-ecommerce-store/actions)
[![tag](https://img.shields.io/badge/release-v1.0.0-blue.svg)](https://github.com/roshanchitrang9307-gif/simple-ecommerce-store/releases)


A modern, feature-rich e-commerce REST API built with **Spring Boot 4.1**, **JWT Authentication**, **MySQL**, and **Swagger OpenAPI** documentation. Production-ready with comprehensive testing, validation, and security.

## 📋 Features

✅ **User Management**
- User registration with validation
- JWT-based authentication
- Secure password encoding
- User role management

✅ **Product Management**
- Full CRUD operations
- Product filtering by category
- Stock management
- Image URL support
- Detailed product information

✅ **Security**
- JWT token-based authentication
- Role-based access control (RBAC)
- Spring Security integration
- Password validation
- CORS support

✅ **API Documentation**
- Swagger/OpenAPI 3.0 integration
- Interactive API testing interface
- Complete endpoint documentation
- Request/Response examples

✅ **Testing**
- Comprehensive unit tests
- Integration tests
- Controller tests
- Service layer tests
- Input validation testing

✅ **Database**
- MySQL integration
- JPA/Hibernate ORM
- Automatic schema generation
- Data persistence

---

## 🚀 Quick Start

### Prerequisites
- **Java**: 17 or higher
- **Maven**: 3.8+
- **MySQL**: 8.0+

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/roshanchitrang9307-gif/simple-ecommerce-store.git
cd simple-ecommerce-store
```

2. **Configure MySQL Database**
```bash
mysql -u root -p
CREATE DATABASE ecommerce_store;
```

Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store
spring.datasource.username=root
spring.datasource.password=your_password
```

3. **Build the project**
```bash
mvn clean install
```

4. **Run the application**
```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`

---

## 🔌 API Documentation

### Interactive API Testing

#### **Option 1: Swagger UI (Recommended)**
```
http://localhost:8080/swagger-ui/index.html
```
- ✅ Interactive API testing
- ✅ Try-it-out functionality
- ✅ Request/Response visualization
- ✅ Model schema documentation

#### **Option 2: API Tester Interface**
```
http://localhost:8080/api-tester.html
```
- ✅ User-friendly web interface
- ✅ Pre-configured test endpoints
- ✅ Real-time responses

#### **Option 3: Postman Collection**
Import the included `postman_collection.json` file into Postman for comprehensive API testing.

---

## 🔐 Authentication

### Registration
```bash
POST /api/auth/register
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "SecurePass@123"
}
```

**Response:**
```json
{
  "message": "User registered successfully"
}
```

---

### Login
```bash
POST /api/auth/login
Content-Type: application/json

{
  "email": "john@example.com",
  "password": "SecurePass@123"
}
```

**Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "message": "Login successful"
}
```

---

## 📦 Product API Endpoints

### Get All Products
```bash
GET /api/products
Authorization: Bearer <token>
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "iPhone 15",
    "category": "Electronics",
    "price": 999.99,
    "stock": 50,
    "description": "Latest iPhone model",
    "imageUrl": "http://example.com/iphone15.jpg"
  }
]
```

---

### Get Product by ID
```bash
GET /api/products/{id}
Authorization: Bearer <token>
```

---

### Create Product
```bash
POST /api/products
Authorization: Bearer <token>
Content-Type: application/json

{
  "name": "Samsung Galaxy S24",
  "category": "Electronics",
  "price": 899.99,
  "stock": 30,
  "description": "Premium smartphone",
  "imageUrl": "http://example.com/galaxy.jpg"
}
```

**Response:** `201 Created`

---

### Update Product
```bash
PUT /api/products/{id}
Authorization: Bearer <token>
Content-Type: application/json

{
  "name": "Updated Product Name",
  "price": 799.99,
  "stock": 25
}
```

**Response:** `200 OK`

---

### Delete Product
```bash
DELETE /api/products/{id}
Authorization: Bearer <token>
```

**Response:** `204 No Content`

---

### Search by Category
```bash
GET /api/products/category/{category}
Authorization: Bearer <token>
```

---

## 🧪 Running Tests

### Run all tests
```bash
mvn test
```

### Run specific test class
```bash
mvn test -Dtest=AuthControllerTest
mvn test -Dtest=ProductControllerTest
mvn test -Dtest=ProductServiceTest
```

### Generate test coverage report
```bash
mvn clean test jacoco:report
# Report location: target/site/jacoco/index.html
```

### Test Coverage
- **AuthController**: Registration, Login, Validation
- **ProductController**: CRUD operations, Filtering
- **ProductService**: Business logic, Error handling
- **Validation**: Input validation, Constraints
- **Edge Cases**: Not found errors, Invalid data

---

## 📊 Project Structure

```
simple-ecommerce-store/
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/simple_ecommerce_store/
│   │   │   ├── controller/          # REST endpoints
│   │   │   ├── service/             # Business logic
│   │   │   ├── repository/          # Data access
│   │   │   ├── entity/              # Database entities
│   │   │   ├── dto/                 # Data transfer objects
│   │   │   ├── security/            # JWT & Security
│   │   │   └── config/              # Configuration
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/api-tester.html
│   └── test/
│       └── java/com/ecommerce/simple_ecommerce_store/
│           ├── controller/          # Controller tests
│           └── service/             # Service tests
├── pom.xml
├── README.md
└── postman_collection.json
```

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|-----------|---------|---------|
| Spring Boot | 4.1.0 | Framework |
| Spring Security | Latest | Authentication & Authorization |
| JWT | 0.11.5 | Token-based authentication |
| MySQL | 8.0+ | Database |
# 🛒 Simple Ecommerce Store - Spring Boot REST API

A modern, feature-rich e-commerce REST API built with **Spring Boot 4.1**, **JWT Authentication**, **MySQL**, and **Swagger OpenAPI** documentation. Production-ready with comprehensive testing, validation, and security.

## 📋 Features

✅ **User Management**
- User registration with validation
- JWT-based authentication
- Secure password encoding
- User role management

✅ **Product Management**
- Full CRUD operations
- Product filtering by category
- Stock management
- Image URL support
- Detailed product information

✅ **Security**
- JWT token-based authentication
- Role-based access control (RBAC)
- Spring Security integration
- Password validation
- CORS support

✅ **API Documentation**
- Swagger/OpenAPI 3.0 integration
- Interactive API testing interface
- Complete endpoint documentation
- Request/Response examples

✅ **Testing**
- Comprehensive unit tests
- Integration tests
- Controller tests
- Service layer tests
- Input validation testing

✅ **Database**
- MySQL integration
- JPA/Hibernate ORM
- Automatic schema generation
- Data persistence

---

## 🚀 Quick Start

### Prerequisites
- **Java**: 17 or higher
- **Maven**: 3.8+
- **MySQL**: 8.0+

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/roshanchitrang9307-gif/simple-ecommerce-store.git
cd simple-ecommerce-store
```

2. **Configure MySQL Database**
```bash
mysql -u root -p
CREATE DATABASE ecommerce_store;
```

Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store
spring.datasource.username=root
spring.datasource.password=your_password
```

3. **Build the project**
```bash
mvn clean install
```

4. **Run the application**
```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`

---

## 🔌 API Documentation

### Interactive API Testing

#### **Option 1: Swagger UI (Recommended)**
```
http://localhost:8080/swagger-ui/index.html
```
- ✅ Interactive API testing
- ✅ Try-it-out functionality
- ✅ Request/Response visualization
- ✅ Model schema documentation

#### **Option 2: API Tester Interface**
```
http://localhost:8080/api-tester.html
```
- ✅ User-friendly web interface
- ✅ Pre-configured test endpoints
- ✅ Real-time responses

#### **Option 3: Postman Collection**
Import the included `postman_collection.json` file into Postman for comprehensive API testing.

---

## 🔐 Authentication

### Registration
```bash
POST /api/auth/register
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "SecurePass@123"
}
```

**Response:**
```json
{
  "message": "User registered successfully"
}
```

---

### Login
```bash
POST /api/auth/login
Content-Type: application/json

{
  "email": "john@example.com",
  "password": "SecurePass@123"
}
```

**Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "message": "Login successful"
}
```

---

## 📦 Product API Endpoints

### Get All Products
```bash
GET /api/products
Authorization: Bearer <token>
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "iPhone 15",
    "category": "Electronics",
    "price": 999.99,
    "stock": 50,
    "description": "Latest iPhone model",
    "imageUrl": "http://example.com/iphone15.jpg"
  }
]
```

---

### Get Product by ID
```bash
GET /api/products/{id}
Authorization: Bearer <token>
```

---

### Create Product
```bash
POST /api/products
Authorization: Bearer <token>
Content-Type: application/json

{
  "name": "Samsung Galaxy S24",
  "category": "Electronics",
  "price": 899.99,
  "stock": 30,
  "description": "Premium smartphone",
  "imageUrl": "http://example.com/galaxy.jpg"
}
```

**Response:** `201 Created`

---

### Update Product
```bash
PUT /api/products/{id}
Authorization: Bearer <token>
Content-Type: application/json

{
  "name": "Updated Product Name",
  "price": 799.99,
  "stock": 25
}
```

**Response:** `200 OK`

---

### Delete Product
```bash
DELETE /api/products/{id}
Authorization: Bearer <token>
```

**Response:** `204 No Content`

---

### Search by Category
```bash
GET /api/products/category/{category}
Authorization: Bearer <token>
```

---

## 🧪 Running Tests

### Run all tests
```bash
mvn test
```

### Run specific test class
```bash
mvn test -Dtest=AuthControllerTest
mvn test -Dtest=ProductControllerTest
mvn test -Dtest=ProductServiceTest
```

### Generate test coverage report
```bash
mvn clean test jacoco:report
# Report location: target/site/jacoco/index.html
```

### Test Coverage
- **AuthController**: Registration, Login, Validation
- **ProductController**: CRUD operations, Filtering
- **ProductService**: Business logic, Error handling
- **Validation**: Input validation, Constraints
- **Edge Cases**: Not found errors, Invalid data

---

## 📊 Project Structure

```
simple-ecommerce-store/
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/simple_ecommerce_store/
│   │   │   ├── controller/          # REST endpoints
│   │   │   ├── service/             # Business logic
│   │   │   ├── repository/          # Data access
│   │   │   ├── entity/              # Database entities
│   │   │   ├── dto/                 # Data transfer objects
│   │   │   ├── security/            # JWT & Security
│   │   │   └── config/              # Configuration
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/api-tester.html
│   └── test/
│       └── java/com/ecommerce/simple_ecommerce_store/
│           ├── controller/          # Controller tests
│           └── service/             # Service tests
├── pom.xml
├── README.md
└── postman_collection.json
```

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|-----------|---------|---------|
| Spring Boot | 4.1.0 | Framework |
| Spring Security | Latest | Authentication & Authorization |
| JWT | 0.11.5 | Token-based authentication |
| MySQL | 8.0+ | Database |
| Hibernate/JPA | Latest | ORM |
| Lombok | Latest | Boilerplate reduction |
| SpringDoc OpenAPI | 2.5.0 | API documentation |
| JUnit 5 | Latest | Unit testing |
| Tomcat | 11.0.22 | Application server |

---

## 📝 Validation Rules

### User Registration
- **Name**: Required, 2-100 characters
- **Email**: Valid email format, unique
- **Password**: Minimum 8 characters, at least 1 uppercase, 1 lowercase, 1 digit, 1 special character

### Product Creation
- **Name**: Required, 1-255 characters
- **Category**: Required, 1-100 characters
- **Price**: Required, minimum 0.01
- **Stock**: Required, minimum 0
- **Description**: Optional, max 500 characters

---

## 🔒 Security Features

✅ **JWT Authentication**
- Secure token generation and validation
- 10-hour token expiration
- Custom user details service

✅ **Input Validation**
- Bean Validation annotations
- Request body validation
- Parameter validation

✅ **Error Handling**
- Custom exception handling
- Meaningful error messages
- HTTP status codes

✅ **Password Security**
- Bcrypt encryption
- Salt generation
- Secure storage

---

## 📚 API Response Codes

| Code | Meaning |
|------|---------|
| 200 | Success |
| 201 | Created |
| 204 | No Content |
| 400 | Bad Request (Validation error) |
| 401 | Unauthorized (Auth required) |
| 403 | Forbidden (Permission denied) |
| 404 | Not Found |
| 500 | Server Error |

---

## 🐛 Troubleshooting

### MySQL Connection Error
```bash
# Verify MySQL is running
mysql -u root -p -e "SELECT 1"

# Check connection string in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store
```

### Port Already in Use
```bash
# Change port in application.properties
server.port=8081
```

### Token Expiration
- Tokens expire after 10 hours
- Login again to get a new token
- Include token in Authorization header: `Bearer <token>`

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 👨‍💻 Author

**Roshan Chitrang**
- GitHub: [@roshanchitrang9307-gif](https://github.com/roshanchitrang9307-gif)
- Email: roshanchitrang9307@gmail.com

---

## 🚀 Future Enhancements

- [ ] Order management system
- [ ] Payment integration (Stripe/PayPal)
- [ ] Product reviews and ratings
- [ ] Shopping cart functionality
- [ ] Wishlist feature
- [ ] Admin dashboard
- [ ] Email notifications
- [ ] Docker containerization
- [ ] Kubernetes deployment
- [ ] GraphQL API

---

## 📞 Support

For support, email roshanchitrang9307@gmail.com or open an issue on GitHub.

---

**Last Updated**: 2026-06-23
>>>>>>> portfolio-ready
