# Selenium Test Suite for Sauce Labs Website

This repository contains a Selenium test suite for testing the Sauce Labs website. The suite includes 10 tests written in Java using Selenium, TestNG, and WebDriver.


## Page Object Model (POM) Design

The project is structured based on the Page Object Model (POM) design pattern. In POM, each web page is represented by a Java class, and the interactions with elements 
on the page are encapsulated within methods of that class. This design promotes code reusability, maintainability, and reduces code duplication.

- `PageObject` Package: Contains classes representing web pages.
- `StepObject` Package: Contains classes representing the steps or actions performed on the pages.
- ...


## Prerequisites

Make sure you have the following software installed on your machine:

- Selenium 4.16.1
- TestNG 7.8.0
- WebDriver 5.6.3


## Running Tests

**Clone the Repository:**
   bash
   git clone https://github.com/your-username/sauce-labs-tests.git
   cd sauce-labs-tests


## Run Tests:
Execute the Selenium tests using Maven:
  bash
  mvn clean test


## Test Descriptions

LogIn test:
  Validates login with correct username and password.
  Elements located using By.name and By.xpath.
  Utilizes browser actions in the utils package.
  Asserts that the entered username and password are correct.

IncorrectLogIn test:
  Validates login with incorrect username and password.
  Elements located using By.name and By.xpath.
  Utilizes browser actions in the utils package.
  Asserts that an error message is displayed for incorrect login.

LogOut test:
  Validates the logout process.
  Elements located using By.id, By.xpath, and By.cssSelector.
  Utilizes browser actions in the utils package.
  Asserts that after logout, the login button is present.

Cart test:
  Validates adding a product to the cart.
  Add to cart buttons located using By.xpath.
  Asserts that adding a product to the cart is successful.

Dropdownmenu:
  Validates dropdown menu functionality.
  Utilizes a for loop to select options from the dropdown.
  Asserts that the selected option matches the expected value.

ShoppingCart:
  Validates the functionality of the shopping cart button.
  Shopping cart button located using By.className.
  Asserts that the link leads to the shopping cart.

Userisrequired:
  Validates the login form's behavior when username and password are missing.
  Utilizes browser actions in the utils package.
  Asserts the error message displayed when attempting to login without credentials.

Removeitem:
  Validates the removal of an item from the cart.
  Asserts that the removal of an item is successful.

BurgerButton:
  Validates the functionality of the burger button and dropdown menu.
  Asserts that after clicking the burger button, the 'about' link in the dropdown menu works.

FacebookIcon:
  Validates the presence and functionality of social media icons.
  Asserts that clicking the Facebook icon leads to the correct page.
