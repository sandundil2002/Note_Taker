<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=50&pause=1000&center=true&vCenter=true&width=835&height=70&lines=Note+Taker" alt="Typing SVG" /></a>

<p id="description">The Note Taker API is a comprehensive RESTful service designed to manage user notes efficiently. Built with Spring framework, JPA and Hibernate this API leverages a MySQL database to provide robust CRUD operations for notes and user management. It supports functionalities such as creating retrieving updating and deleting notes along with user profile management including profile picture uploads.</p>

  
  
<h2>🧐 Features</h2>

Here're some of the project's best features:

*   Create new notes
*   View all notes
*   View a specific note by ID
*   Update existing notes
*   Delete notes
*   User management (create update delete users)
*   File upload for user profile pictures

<h2>🛠️ Installation Steps:</h2>

<p>1. Clone the repository:</p>

```
git clone https://github.com/sandundil2002/Note_Taker.git
```

<p>2. Navigate to the project directory:</p>

```
cd Note_Taker
```

<p>3. Install the required dependencies:</p>

```
mvn install
```

<p>4. Update the `application.properties` file with your MySQL database credentials:</p>

```
spring.datasource.url=jdbc:mysql://localhost:3306/note_taker?createDatabaseIfNotExist=true     spring.datasource.username=yourUsername     spring.datasource.password=yourPassword
```

<h2>Postman API Documentation</h2>

<a href="https://documenter.getpostman.com/view/35384990/2sAXjM5CRM" >View API Documentation</a>

  
  
<h2>💻 Built with</h2>

Technologies used in the project:

*   Spring: For building the RESTful API and managing the application configuration.
*   Spring MVC: For handling web requests and responses.
*   Spring Data JPA: For data persistence and interaction with the MySQL database.
*   Hibernate: As the ORM framework to map Java objects to database tables.
*   MySQL: As the relational database to store user and note data.
*   Maven: For project management and dependency management.
