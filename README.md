
# Human Resources Management Application

This is a comprehensive Human Resources management application developed in Java, featuring RESTful APIs to handle various HR functions. The application provides robust tools for managing employees, departments, jobs, and leave requests. It is designed to streamline HR processes and ensure efficient data handling.

## Features
- Employee Management: Add, update, delete, and retrieve employee information.
- Department Management: Manage department details seamlessly.
- Job and Job History Management: Track job categories, assignments, and history.
- Leave Management: Handle employee leave requests and approvals.
- Inventory Management: Manage employee-related inventory efficiently.
- RESTful API: Built with REST principles for easy integration and scalability.
- Error Handling: Includes custom exceptions for resource not found errors.

## Project Structure
The project is organized into the following main components:
- `entity/`: Contains entity classes representing the database tables.
- `repository/`: Includes repository interfaces for data persistence.
- `services/`: Business logic and service layer for the application.
- REST services: Individual REST controllers for each feature, e.g., `DemoEmployeeRestServices.java`, `DemoLeaveRestServices.java`.

## Technologies Used
- Java: Core programming language.
- Spring Framework: For building the RESTful APIs and managing dependencies.
- Maven: Dependency management and build tool.

## Getting Started
### Prerequisites
- JDK 11 or later
- Maven 3.6+
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd HumanResources-main
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the APIs via:
   - `http://localhost:8080/api/employees` for employee management
   - Additional endpoints are defined for other resources.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or support, please contact [simayseyman@gmail.com].
