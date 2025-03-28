# DigitalLibrary
# Digital Library API

## 📌 Project Overview
The **Digital Library API** is a Spring Boot application that allows librarians to manage books efficiently. The system enables users to **add, update, search, and delete books**, while keeping track of their availability status.

## 🚀 Tech Stack
- **Java 17**
- **Spring Boot 3.4.4** (REST API, Data JPA, Validation)
- **H2 Database** (for in-memory storage)
- **Lombok** (to reduce boilerplate code)
- **Maven** (dependency management & build tool)
- **Deployment:** Render

---

## 🛠️ Setup & Run Locally

### **1️⃣ Clone the Repository**

### **2️⃣ Install Dependencies**
Ensure **Java 17+** and **Maven** are installed, then run:
```sh
mvn clean install
```

### **3️⃣ Run the Application**
```sh
mvn spring-boot:run
```

### **4️⃣ Access the API**

- **H2 Database Console:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (leave empty)

---

## 📌 API Endpoints

### **1️⃣ Add a Book**
**POST** `/api/books/add`
#### Request Body:
```json
{
  "id": 1,
  "title": "Java Programming",
  "author": "John Doe",
  "genre": "Technology",
  "status": "Available"
}
```
#### Response:
```json
{
  "book": {
    "id": 1,
    "title": "Java Programming",
    "author": "John Doe",
    "genre": "Technology",
    "status": "Available"
  }
}
```

### **2️⃣ View All Books**
**GET** `/api/books/getall`

### **3️⃣ Search Book by ID**
**GET** `/api/books/{id}`

### **4️⃣ Update Book Details**
**PUT** `/api/books/{id}`
#### Request Body:
```json
{
  "title": "Advanced Java",
  "status": "Checked Out"
}
```

### **5️⃣ Delete a Book**
**DELETE** `/api/books/{id}`
#### Response:
```json
{
  "message": "Book deleted successfully"
}
```

---





## 🎯 Challenges Faced & Improvements
### **Challenges:**
- Handling **method validation errors** properly.
- Designing a clean **RESTful API** structure.
- Deploying on **Render** and managing environment variables.

### **Future Improvements:**
- Implement **MySQL/PostgreSQL** for persistent storage.
- Add **User Authentication** (Spring Security + JWT).
- Enable **Frontend UI** (React or Angular) to interact with the API.

---

## 🤝 Contributing
Feel free to fork this repository and contribute! If you encounter issues, open a ticket or create a pull request.

**Author:** [Pragya Kumari](https://github.com/pragyamyra)

