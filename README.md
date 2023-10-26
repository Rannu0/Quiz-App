# Quiz Application💯

## Introduction

The Quiz Application is a Java-based project following MVC architecture that allows users to create, manage, and take quizzes. The Quiz Application is built using Spring Boot, JPA, and PostgreSQL to create a back-end API for managing quizzes and questions.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Functionality](#functionality)

## Technologies Used

- **Java**: The project is written in Java, making use of the Spring Boot framework for building RESTful APIs.
- **Spring Boot**: Spring Boot is used for rapid application development and to create stand-alone, production-grade Spring-based applications.
- **Spring Data JPA**: Spring Data JPA simplifies data access layer implementation, making it easier to interact with the database.
- **PostgreSQL**: PostgreSQL is used as the relational database for storing quiz questions and quiz data.
- **Maven**: Maven is the build automation tool used for managing project dependencies and building the application.
- **RESTful API**: The project exposes RESTful endpoints for creating, managing, and taking quizzes.

## Project Structure
This project applied MVC architecture
### 1. Model
   - Entity:
     - `Question`: A question class with attributes like category, difficulty level, question title, options, and the correct answer.
     - `QuestionWrapper`: A question class with fewer attributes to represent a question for a quiz.
     - `Quiz`: Represents a quiz with a title and a list of associated questions.
     - `Response`: Represents user responses to quiz questions.
   - Service:
     - `QuestionService`: Manages the business logic related to questions, including retrieving all questions, questions by category, adding questions, and deleting questions.
     - `QuizService`: Handles the business logic for quizzes, such as creating quizzes based on category and the number of questions, retrieving questions for a quiz, and calculating quiz results based on user responses.
   - DAO:
     -`QuestionDao`: Manages database operations related to questions, providing methods to fetch, add, and delete questions, as well as retrieve questions by category.
     -`QuizDao`: Handles database operations for quizzes, offering methods to create, retrieve, update, and delete quizzes.
### 2. Controller
   - `QuestionController`: Handles endpoints related to questions, including retrieving all questions, questions by category, adding questions, and deleting questions.
   - `QuizController`: Manages quiz-related endpoints, such as creating quizzes, retrieving quiz questions, and submitting user responses for quiz evaluation.
### 3. View: To be Implemented


## Functionality

The core functionalities of the Quiz Application include:

- Creating, retrieving, and deleting quiz questions.
- Creating quizzes by specifying the category and the number of questions.
- Retrieving quiz questions for a given quiz.
- Submitting user responses and calculating quiz results.
