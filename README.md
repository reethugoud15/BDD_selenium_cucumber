# BDD_selenium_cucumber
A simple software testing project implementing BDD framework using cucumber, selinium, java 

# Selenium Cucumber Project

## Overview
This project demonstrates automated testing using Selenium and Cucumber. It includes a test for validating the search functionality of Google.

## Prerequisites
- Java JDK (version 8 or higher)
- Maven
- Chrome Browser
- ChromeDriver
## Running Tests

1. **Using Maven:**
    ```sh
    mvn test
    ```
2. **Using the TestRunner class directly:**
   - Open your IDE (e.g., IntelliJ IDEA, Eclipse).
   - Navigate to the `seleniumprac.StepDefinitions` package.
   - Right-click on the `TestRunner` class and select `Run 'TestRunner'`.

## Project Structure 
selenium-cucumber-project/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── seleniumprac/
│ │ ├── StepDefinitions/
│ │ │ ├── GoogleSearch.java
│ │ │ └── TestRunner.java
│ │ └── pages/
│ │ └── GoogleSearchPOM.java
│ └── test/
│ └── resources/
│ └── features/
│ └── GoogleSearch.feature
│
├
├── pom.xml
└── README.md
