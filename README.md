# Simple CRUD Application

## Overview
This project is a console-based Java application designed to perform basic CRUD (Create, Read, Update, Delete) operations on a database table representing student records. The application interacts with a MySQL database and provides a menu-driven interface for users to manage student data efficiently.

## Features
1. **Create Operation**: Add a new student record with an ID, name, and email.
2. **Read Operation**: Retrieve and display all student records from the database.
3. **Update Operation**: Update the name and email of an existing student record based on the provided ID.
4. **Delete Operation**: Delete a student record from the database based on the provided ID.

## Components

### 1. Main Class (`Main.java`)
- Entry point of the application.
- Contains a menu-driven interface that prompts the user to select an operation (Create, Read, Update, Delete).
- Collects user input and invokes the appropriate method from the `Operations` class to perform the selected operation.

### 2. Database Connection Class (`Database.java`)
- Manages the database connection.
- Provides a static method `createConnection()` to establish and return a connection to the MySQL database using JDBC.

### 3. Table Class (`Table.java`)
- Represents a student record with fields for `id`, `name`, and `email`.
- Includes a constructor to initialize these fields and a `toString()` method for displaying the object's data.

### 4. SQL Query Class (`Query.java`)
- Contains static strings for SQL queries needed for the CRUD operations.
- Provides static getter methods to access these SQL query strings.

### 5. Operations Class (`Operations.java`)
- Contains static methods for performing CRUD operations on the `Table` objects.
  - `create(Table t)`: Inserts a new student record into the database.
  - `read()`: Retrieves all student records from the database and returns them as an `ArrayList` of `Table` objects.
  - `update(Table t)`: Updates the name and email of an existing student record based on the provided `Table` object.
  - `delete(int id)`: Deletes a student record from the database based on the provided ID.

## How It Works
1. **User Interaction**: The user interacts with the application through a console-based menu.
2. **Database Operations**: Depending on the user’s choice, the application performs the corresponding CRUD operation using JDBC to interact with the MySQL database.
3. **Data Handling**: The `Table` class is used to encapsulate the student data, and the `Operations` class contains the logic to manipulate this data in the database.

## Prerequisites
- Java Development Kit (JDK)
- MySQL Database
- JDBC Driver for MySQL

## Setup and Usage
1. **Set Up Database**:
   - Create a MySQL database named `testing`.
   - Create a table named `students` with the following schema:
     ```sql
     CREATE TABLE students (
         id INT PRIMARY KEY,
         name VARCHAR(50),
         email VARCHAR(50)
     );
     ```

2. **Configure Database Connection**:
   - Ensure the database URL, username, and password in `Database.java` are correct:
     ```java
     String url = "jdbc:mysql://localhost:3306/testing";
     String userName = "root";
     String password = "admin";
     ```

3. **Compile the Java files**:
   ```bash
   javac myPackage/*.java

4. **Run the application**:
   ```bash
   java myPackage.Main

5. **Follow the on-screen prompts to perform CRUD operations on the student records.**

## Conclusion
This project serves as a basic example of how to implement CRUD operations in a Java application using JDBC to interact with a MySQL database. It demonstrates fundamental concepts such as database connectivity, SQL operations, and user input handling in a console-based interface.

## License
This project is open-source and available under the MIT License. Feel free to use, modify, and distribute as needed.
