# Spring Boot CRUD Operation

This is a simple CRUD (Create, Read, Update, Delete) application built using **Spring Boot**, **Hibernate (JPA)**, and **MySQL**.  
The project demonstrates database operations on a `Student` entity.

## 🚀 Technologies Used

- Java
- Spring Boot
- Hibernate (JPA)
- MySQL or H2 (depending on your setup)
- Maven
- IntelliJ IDEA (or any IDE of your choice)

## ⚙️ Getting Started

### Prerequisites

- Java 17+ installed
- Maven installed
- MySQL installed and running (or use H2 in-memory DB)

### Clone the Repository

```bash
git clone https://github.com/patilchetan21/Spring_Boot_CRUD_Operation.git
cd Spring_Boot_CRUD_Operation

📁 Project Structure
src
├── main
│   ├── java
│   │   └── com.hibernet.cruddemo
│   │       ├── dao
│   │       │   ├── StudentDAO.java
│   │       │   └── StudentDAOImpl.java
│   │       ├── entity
│   │       │   └── Student.java
│   │       └── CruddemoApplication.java
│   └── resources
│       └── application.properties
└── test
🔧 Configuration

Update the application.properties file with your database details:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🛠️ Build and Run the Project
Build the Project
mvn clean install

Run the App
mvn spring-boot:run
