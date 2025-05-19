# Estate-Connect

Estate-Connect is a full-stack web application for real estate property management built using Angular 10, Spring Boot, and MySQL 8. The application provides separate interfaces for users and administrators to manage properties, inquiries, and feedback.

## Technologies Used

- Frontend: Angular 10
- Backend: Spring Boot 3.0.1
- Database: MySQL 8
- Security: Spring Security with JWT
- Java Version: 17

## Features

### User Features
- View available properties
- Submit property inquiries
- Add feedback for properties
- Track inquiry status
- User authentication and authorization
- Responsive user interface

### Admin Features
- Property management (Add/Edit/Delete)
- View and manage user inquiries
- View user feedback
- Admin control panel
- Property listing management

## Prerequisites

- Node.js and npm
- Angular CLI 10.x
- Java Development Kit (JDK) 17
- MySQL 8.x
- Maven

## Installation & Setup

### Clone the Repository
```bash
git clone https://github.com/yourusername/Estate-Connect.git
cd Estate-Connect
```

### Frontend Setup (Angular)
```bash
cd angularapp
npm install
ng serve
```
The frontend will be available at `http://localhost:4200`

### Backend Setup (Spring Boot)
```bash
cd springapp
mvn clean install
mvn spring:boot run
```
The backend will start at `http://localhost:8080`

### Database Configuration
The application uses MySQL. Update the database configuration in `springapp/src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost/appdb?createDatabaseIfNotExist=true
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Project Structure

### Frontend Components
- **Home Page**: Landing page for the application
- **Authentication**: Login and Registration components
- **User Dashboard**: Property viewing and inquiry management
- **Admin Panel**: Property and user management interface
- **Feedback System**: User feedback submission and admin review

### Backend Structure
- RESTful APIs for property management
- User authentication and authorization
- Database integration
- File handling for property images
- Security configurations

## Security

- JWT based authentication
- Role-based access control (User/Admin)
- Password encryption using BCrypt
- Protected API endpoints

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
