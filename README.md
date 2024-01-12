# SpringBoot Web Management Console

Welcome to the SpringBoot Web Management Console project! This web application provides a user-friendly interface for managing various services using the SpringBoot framework. Whether you're a developer, system administrator, or just someone interested in exploring the capabilities of SpringBoot, this console offers an intuitive experience for managing services.

## Table of Contents
1. [About](#about)
2. [Contact](#contact)
3. [To Run](#ToRun)
4. [Sql Table Defination](#DataBaseFormat)
## About

The SpringBoot Web Management Console is designed with two distinct roles: 
<li>Admin</li>
<ul>Admins enjoy comprehensive control, wielding the power to create, update, delete, and view detailed information about employees. </ul>
<li>User</li>
<ul>On the other hand, users experience a more focused interface, where they can exclusively access and review their individual details.</ul>
This role-based access ensures a secure and streamlined experience, catering to the unique needs and responsibilities of both administrators and regular users. With this approach, the 
project promotes efficient management for administrators while providing a user-centric experience, enhancing overall usability and accessibility.

## Contact

If you have any questions, suggestions, or issues, feel free to reach out to us. Your feedback is valuable.

- Email: shwetankchoudhary2@gmail.com
- [GitHub Issues](https://github.com/Shwetank-Chaudhary/EmployeeManagement-/issues)

## ToRun

<ul>Run <b>HomePage</b>. It is running on Localhost 8080</ul>
<ul>Run all the services before hand in springboot.</ul>
<ul>Change Name of the database used, in the application Property.</ul>


## DataBaseFormat


### SQL Table Definition: employees

<b>CREATE TABLE employees </b>(<br>
  &ensp;id INT PRIMARY KEY,<br>
  &ensp;username VARCHAR(50) UNIQUE,<br>
  &ensp;first_name VARCHAR(50),<br>
  &ensp;last_name VARCHAR(50),<br>
  &ensp;phonenumber VARCHAR(11),<br>
  &ensp;DOB VARCHAR(100),<br>
  &ensp;position VARCHAR(50),<br>
  &ensp;department VARCHAR(50),<br>
  &ensp;hire_date VARCHAR(50),<br>
  &ensp;salary FLOAT NOT NULL,<br>
  &ensp;password VARCHAR(255),<br>
  &ensp;role VARCHAR(20)<br>
);


   
