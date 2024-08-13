# ProjectMVC

## Overview

This project is a web application designed to manage and display data related to departments, positions, employees, and projects. It is built using Java technologies and provides a simple interface for CRUD (Create, Read, Update, Delete) operations on these entities.

## Technologies Used

- **Java**: Core programming language used for backend development.
- **Spring Framework**: For building the application, including MVC architecture, dependency injection, and transaction management.
- **Hibernate**: For Object-Relational Mapping (ORM) to interact with the database.
- **Spring Boot**: Simplifies the development process by providing a comprehensive configuration and setup.
- **PostgreSQL**: The relational database used for storing the application's data.
- **JSP (JavaServer Pages)**: For rendering dynamic web content and creating user interfaces.
- **JSTL (JavaServer Pages Standard Tag Library)**: For simplifying JSP pages with tags for loops and conditionals.
- **HikariCP**: Connection pooling library to manage database connections efficiently.
- **Maven**: Build and dependency management tool.
- **SLF4J**: Logging facade used for logging within the application.

## Features

- **Main Menu**: A central hub for navigating to different sections of the application, including Departments, Positions, Employees, and Projects.
- **Departments Management**: View, update, and delete departments.
- **Positions Management**: View and manage positions within the organization.
- **Employees Management**: View, add, update, and delete employees. Employees are linked to departments and positions.
- **Projects Management**: View and manage projects within the organization (assuming this feature is implemented similarly to other entities).

## Usage

- **Main Menu**: Use the main menu to navigate to:
  - **Departments**: View and manage departments.
  - **Positions**: View and manage positions.
  - **Employees**: View, add, update, and delete employees.
  - **Projects**: View and manage projects (if implemented).

- **CRUD Operations**:
  - **Create**: Add new departments, positions, employees, and projects.
  - **Read**: View details of existing entities.
  - **Update**: Modify existing entities.
  - **Delete**: Remove entities from the system.

## Getting Started

### Prerequisites

- Java 11 or higher
- PostgreSQL database
- Maven
- An IDE like IntelliJ IDEA or Eclipse (optional)
