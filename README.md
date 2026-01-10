# Student Management System (Java + JDBC + MySQL)

A console-based Student Management System developed using Java, JDBC, and MySQL that allows performing full CRUD operations with persistent database storage.

---

## 🚀 Features
- Add new student
- View all students
- Search student by ID
- Update student details
- Delete student records
- Persistent storage using MySQL
- Clean layered architecture

---

## 🛠️ Tech Stack
- Java
- JDBC
- MySQL
- IntelliJ IDEA
- Git & GitHub

---

## 🧩 Project Architecture
- model → Student entity
- service → Business logic & JDBC operations
- util → Database connection
- Main → User interaction & menu handling

---

## 🗄️ Database Schema

```sql
CREATE DATABASE student_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(50),
    marks DOUBLE
);
