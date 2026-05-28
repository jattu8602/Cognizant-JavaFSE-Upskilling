# Java Exercises — Setup Guide

## Compilation & Execution

### Basic exercises (1-30)
```bash
cd java
javac Filename.java
java Filename
```

### Exercise 31-33: JDBC (requires MySQL)
1. Install MySQL and create the database:
```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;
CREATE TABLE students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), grade VARCHAR(2));
INSERT INTO students (name, grade) VALUES ('Alice', 'A'), ('Bob', 'B');
CREATE TABLE accounts (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), balance DECIMAL(10,2));
INSERT INTO accounts (name, balance) VALUES ('Alice', 1000), ('Bob', 500);
```
2. Download `mysql-connector-j-x.x.x.jar` from https://dev.mysql.com/downloads/connector/j/
3. Compile and run with the connector on classpath:
```bash
javac JdbcBasicConnection.java
java -cp .:mysql-connector-j-x.x.x.jar JdbcBasicConnection
```

### Exercise 34: Java Modules
```bash
cd java/modules
javac -d mods/com.utils com.utils/module-info.java com.utils/com/utils/StringUtils.java
javac -d mods/com.greetings --module-path mods com.greetings/module-info.java com.greetings/com/greetings/Main.java
java --module-path mods -m com.greetings/com.greetings.Main
```

### Exercise 35: TCP Chat
Terminal 1: `java TcpChatServer`
Terminal 2: `java TcpChatClient`

### Exercise 36: HTTP Client (Java 11+)
```bash
javac HttpClientExample.java
java HttpClientExample
```

### Exercise 37: javap
```bash
javac BytecodeInspection.java
javap -c BytecodeInspection
```

### Exercise 38: Decompilation
Use JD-GUI (https://java-decompiler.github.io/) or CFR to open any `.class` file.

### Exercise 39: Reflection
```bash
javac ReflectionExample.java
java ReflectionExample
```

### Exercise 40: Virtual Threads (Java 21+)
```bash
javac VirtualThreadsExample.java
java VirtualThreadsExample
```

### Exercise 41: Executor Service
```bash
javac ExecutorServiceExample.java
java ExecutorServiceExample
```

## Notes
- All exercises are self-contained in `java/` directory
- Exercises 31-33 require MySQL running locally
- Exercises 34, 40 require Java 16+ and Java 21+ respectively
- Update DB credentials in JDBC files before running
