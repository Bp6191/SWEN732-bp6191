# SWEN732-bp6191

# University Information System 

## Introduction
The University Information System is a small-scale project designed to demonstrate the implementation of the Visitor Design pattern within a university context. The system facilitates various operations on university entities such as students, professors, and courses.

## Project Overview
The project consists of several classes representing different entities and follows the Visitor Design pattern to enable extensible and flexible operations on these entities.

### Classes

#### 1. Student
- **Description:** Represents a student entity within the university system.
- **Attributes:**
    - `name`: String - The name of the student.
- **Methods:**
    - `getName(): String` - Returns the name of the student.
    - `accept(UniversityVisitor visitor): void` - Accepts a visitor for performing operations on the student entity.

#### 2. Professor
- **Description:** Represents a professor entity within the university system.
- **Attributes:**
    - `name`: String - The name of the professor.
- **Methods:**
    - `getName(): String` - Returns the name of the professor.
    - `accept(UniversityVisitor visitor): void` - Accepts a visitor for performing operations on the professor entity.

#### 3. Course
- **Description:** Represents a course entity within the university system.
- **Attributes:**
    - `courseCode`: String - The code identifying the course.
- **Methods:**
    - `getCourseCode(): String` - Returns the code of the course.
    - `accept(UniversityVisitor visitor): void` - Accepts a visitor for performing operations on the course entity.

#### 4. UniversityEntity (Interface)
- **Description:** An interface defining the `accept` method, which allows entities to accept visitors for performing operations.
- **Methods:**
    - `accept(UniversityVisitor visitor): void` - Accepts a visitor for performing operations on the implementing entity.

#### 5. UniversityVisitor (Interface)
- **Description:** An interface defining the `visit` methods for different types of entities.
- **Methods:**
    - `visit(Student student): void` - Performs operations on a student entity.
    - `visit(Professor professor): void` - Performs operations on a professor entity.
    - `visit(Course course): void` - Performs operations on a course entity.

#### 6. ReportGeneratorVisitor
- **Description:** A concrete visitor implementing specific visit methods to generate reports and details for students, professors, and courses.
- **Methods:**
    - `visit(Student student): void` - Generates a report for a student.
    - `visit(Professor professor): void` - Calculates the workload for a professor.
    - `visit(Course course): void` - Displays details for a course.

#### 7. UniversityInfoSystem
- **Description:** The main class of the project that demonstrates the usage of the Visitor Design pattern. It creates instances of students, professors, and courses, applies the `ReportGeneratorVisitor`, and showcases the result.
