# Project Structure

```
/home/sherif/IdeaProjects/
├───JAVA_LEARNING_ROADMAP.md
├───README.MD
├───.git/...
└───variable/
    └───src/
        ├───Main.java
        └───README.md
```

---

# My Java Learning Journey: From Fundamentals to Spring Boot

This document outlines my personal roadmap for learning Java, starting from the very basics and progressing to advanced topics like the Spring Framework and Spring Boot. Each section includes a list of topics to cover, followed by exercises and a mini-project to apply the learned concepts.

---

## Section 1: Java Fundamentals

This section covers the absolute basics of the Java programming language. The goal is to understand the syntax, basic data types, and control flow.

### Topics:
-   **Introduction to Java:**
    -   What is Java? The JVM, JRE, and JDK.
    -   "Write Once, Run Anywhere" philosophy.
    -   Setting up the development environment (JDK, IDE like IntelliJ IDEA or VS Code).
-   **Your First Program:**
    -   The `main` method: `public static void main(String[] args)`.
    -   Using `System.out.println()` to print to the console.
    -   Compiling and running a Java program from the command line (`javac`, `java`).
-   **Variables and Data Types:**
    -   **Primitive Types:** `int`, `double`, `char`, `boolean`, `byte`, `short`, `long`, `float`.
    -   **Reference Types:** Introduction to `String`.
    -   Declaring and initializing variables.
-   **Operators:**
    -   Arithmetic: `+`, `-`, `*`, `/`, `%`.
    -   Relational: `==`, `!=`, `>`, `<`, `>=`, `<=`.
    -   Logical: `&&`, `||`, `!`.
    -   Assignment: `=`, `+=`, `-=`, etc.
-   **Control Flow:**
    -   **Conditional Statements:** `if`, `else if`, `else`.
    -   **Switch Statements:** `switch`, `case`, `break`, `default`.
    -   **Loops:** `for`, `while`, `do-while`.
    -   `break` and `continue` keywords.
-   **Arrays:**
    -   Declaring, initializing, and accessing arrays.
    -   Iterating over arrays.
    -   Multi-dimensional arrays.
-   **Methods:**
    -   Defining and calling methods.
    -   Parameters and return values.
    -   Method overloading.

### 🏋️ Exercises & Mini-Project 1

-   **Exercises:**
    1.  Write a program that converts temperature from Celsius to Fahrenheit.
    2.  Create a simple calculator that can perform basic arithmetic operations.
    3.  Write a program to find the largest number in an array.
    4.  Create a method that checks if a given number is a prime number.
-   **Mini-Project: Number Guessing Game**
    -   The program generates a random number between 1 and 100.
    -   The user has a limited number of attempts to guess the number.
    -   The program provides feedback ("Too high", "Too low", "You guessed it!").

---

## Section 2: Object-Oriented Programming (OOP) in Java

This is the most critical part of learning Java. The goal is to think in terms of objects and classes.

### Topics:
-   **Classes and Objects:**
    -   Defining a class (blueprint) and creating objects (instances).
    -   Instance variables (fields) and methods.
    -   Constructors.
-   **The Four Pillars of OOP:**
    1.  **Encapsulation:**
        -   Using `private` access modifiers to hide data.
        -   Providing `public` getters and setters.
    2.  **Inheritance:**
        -   `extends` keyword.
        -   Superclasses and subclasses.
        -   The `super` keyword.
        -   Method overriding (`@Override`).
    3.  **Polymorphism:**
        -   Casting objects.
        -   The `instanceof` operator.
    4.  **Abstraction:**
        -   `abstract` classes and methods.
        -   Interfaces (defining a contract).
-   **Static vs. Instance:**
    -   `static` keyword for variables and methods.
-   **Packages:**
    -   Organizing classes into packages (`package` statement).
    -   Importing classes (`import` statement).

### 🏋️ Exercises & Mini-Project 2

-   **Exercises:**
    1.  Create a `Person` class with fields for name and age.
    2.  Design a `Dog` class that inherits from an `Animal` class.
    3.  Create an interface `Shape` with a method `calculateArea()`. Implement this interface in `Circle` and `Rectangle` classes.
-   **Mini-Project: Simple Banking System**
    -   Create a `BankAccount` class with fields for account number, balance, and owner name.
    -   Implement methods for `deposit()` and `withdraw()`).
    -   Create a `Bank` class to manage a collection of `BankAccount` objects.
    -   Add features like creating new accounts and transferring funds between them.

---

## Section 3: Intermediate Java

Building on the OOP foundation with more advanced and practical topics.

### Topics:
-   **Java Collections Framework:**
    -   `List` interface (`ArrayList`, `LinkedList`).
    -   `Set` interface (`HashSet`, `TreeSet`).
    -   `Map` interface (`HashMap`, `TreeMap`).
    -   Iterating through collections.
-   **Exception Handling:**
    -   `try`, `catch`, `finally` blocks.
    -   Checked vs. Unchecked exceptions.
    -   Creating custom exceptions.
-   **File I/O (Input/Output):**
    -   Reading from and writing to files (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`).
-   **Generics:**
    -   Creating generic classes and methods to work with any data type.
-   **Java 8 Features:**
    -   **Lambda Expressions:** Writing concise, anonymous functions.
    -   **Streams API:** Performing powerful operations on collections (e.g., `filter`, `map`, `reduce`).
    -   `Optional` for handling null values gracefully.

### 🏋️ Exercises & Mini-Project 3

-   **Exercises:**
    1.  Write a program that reads a text file and counts the frequency of each word using a `HashMap`.
    2.  Create a generic `Box` class that can hold any type of object.
    3.  Use the Streams API to find all even numbers in a list and calculate their sum.
-   **Mini-Project: Contact Book Application**
    -   Create a `Contact` class.
    -   Use an `ArrayList` or `HashMap` to store and manage a list of contacts.
    -   Implement features to add, search, update, and delete contacts.
    -   Save the contact list to a file and load it back when the application starts.

---

## Section 4: Advanced Java & Tooling

Topics that are essential for building professional, large-scale applications.

### Topics:
-   **Build Tools:**
    -   **Maven** or **Gradle:** Understanding dependency management and the build lifecycle.
    -   The `pom.xml` (Maven) or `build.gradle` file.
-   **Unit Testing:**
    -   **JUnit:** Writing and running unit tests.
    -   Assertions (`assertEquals`, `assertTrue`, etc.).
-   **Concurrency and Multithreading:**
    -   Creating threads by extending `Thread` or implementing `Runnable`.
    -   Basic synchronization (`synchronized` keyword).

### 🏋️ Exercises & Mini-Project 4

-   **Exercises:**
    1.  Convert one of your previous mini-projects to use Maven or Gradle for dependency management.
    2.  Write JUnit tests for the `BankAccount` class from the banking system project.
    3.  Create a simple program where two threads run concurrently to print numbers.
-   **Mini-Project: Simple Web Scraper**
    -   Use a library like Jsoup (added via Maven/Gradle) to fetch the title of a web page.
    -   Extend it to download all images from a given URL.
    -   (Advanced) Use multiple threads to download images faster.

---

## Section 5: Introduction to Databases and JDBC

Learn how to connect your Java applications to a relational database.

### Topics:
-   **SQL Basics:** `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
-   **Relational Databases:** Understanding tables, rows, columns, and primary keys. (Use a database like PostgreSQL or H2).
-   **JDBC (Java Database Connectivity):**
    -   The `Connection`, `Statement`, `PreparedStatement`, and `ResultSet` interfaces.
    -   Connecting to a database, executing queries, and processing results.

### 🏋️ Mini-Project 5

-   **Project: Refactor Contact Book with a Database**
    -   Modify the "Contact Book Application" from Section 3.
    -   Instead of saving contacts to a file, store them in a SQL database.
    -   All operations (add, search, update, delete) should now interact with the database using JDBC.

---

## Section 6: The Spring Framework & Spring Boot

This is where you leverage a powerful framework to build enterprise-grade applications quickly.

### Topics:
-   **Introduction to Spring:**
    -   What is Spring? The concept of Inversion of Control (IoC) and Dependency Injection (DI).
    -   The `ApplicationContext`.
-   **Spring Boot:**
    -   What is Spring Boot? "Convention over Configuration".
    -   Using Spring Initializr (start.spring.io) to create a new project.
    -   Understanding auto-configuration.
-   **Core Spring Boot Concepts:**
    -   **Beans and Components:** `@Component`, `@Service`, `@Repository`.
    -   **Dependency Injection:** `@Autowired`.
    -   **Configuration:** `application.properties` or `application.yml`.
-   **Building a Web Application with Spring Boot:**
    -   **Spring MVC:** `@RestController`, `@GetMapping`, `@PostMapping`.
    -   Handling JSON data.
    -   **Spring Data JPA:**
        -   Simplifying database interactions.
        -   The `JpaRepository` interface.
        -   Entities (`@Entity`).

### 🏋️ Mini-Project 6

-   **Project: To-Do List REST API**
    -   Create a new Spring Boot project.
    -   Define a `TodoItem` entity (ID, title, completed status).
    -   Create a `TodoController` that exposes REST endpoints:
        -   `GET /api/todos` - Get all items.
        -   `POST /api/todos` - Create a new item.
        -   `PUT /api/todos/{id}` - Update an item.
        -   `DELETE /api/todos/{id}` - Delete an item.
    -   Use Spring Data JPA to connect to an in-memory database (like H2) or a real database.
    -   Test your API using a tool like Postman or curl.

---

## Section 7: Final Capstone Project

Combine everything you've learned into a single, more complex application.

### 🏆 Capstone Project Idea: Simple E-commerce Platform API

-   **Features:**
    -   **User Management:** Users can register and log in.
    -   **Products:** Admins can add/update products. Users can view products.
    -   **Shopping Cart:** Users can add products to a shopping cart.
    -   **Orders:** Users can "check out" their cart, which creates an order.
-   **Tech Stack:**
    -   **Backend:** Java and Spring Boot.
    -   **Database:** PostgreSQL and Spring Data JPA.
    -   **Build Tool:** Maven or Gradle.
    -   **Testing:** JUnit for unit and integration tests.

This project will challenge you to structure a larger application, manage relationships between different data models (Users, Products, Orders), and build a comprehensive and practical API.