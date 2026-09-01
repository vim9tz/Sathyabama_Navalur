-- 1. Create database if it doesn't already exist
CREATE DATABASE IF NOT EXISTS student_db;

-- 2. Select the database
USE student_db;

-- 3. Create students table if it doesn't already exist
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL
);

-- 4. Insert sample students
INSERT INTO students (id, name, email)
VALUES
    (101, 'Arun', 'arun@gmail.com'),
    (102, 'Priya', 'priya@gmail.com'),
    (103, 'Rahul', 'rahul@gmail.com');
    
-- 5. Display all students
SELECT * FROM students;