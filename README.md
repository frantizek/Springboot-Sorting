# Spring Boot Sorting Application

This application demonstrates sorting employee data by age using Spring Boot.

## Features
- REST API to retrieve employee data
- Sorting by age (ascending)
- Standalone executable JAR

## How to Run

1. Build the project:
```bash
mvn clean package
```

2. Run the application:

```bash
java -jar target/springboot-sorting-0.0.1-SNAPSHOT.jar
```

Access the application:

Visit http://localhost:8080/ to see sorted employee list

Or use API endpoint: http://localhost:8080/employees

Employee Data
The application comes with sample data:

Sandhya, Age: 20 Yrs, Exp: 0 Yrs

Kemp, Age: 24 Yrs, Exp: 2 Yrs

Anil, Age: 22 Yrs, Exp: 3 Yrs

Kumar, Age: 30 Yrs, Exp: 6 Yrs

Tim, Age: 32 Yrs, Exp: 7 Yrs