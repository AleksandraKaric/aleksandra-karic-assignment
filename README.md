# Automated Registration and Activation Test for Halo Oglasi

## Description
This project is a Selenium WebDriver automation script developed as part of a training assignment. The main goal is to automate the user registration process on the Halo Oglasi website, as well as the activation of the user account via an iframe in the received activation email. This project demonstrates various Selenium functionalities, including handling iframes, form inputs, waits, actions, and implicit waits.


## Features
The script automates the following steps for the user registration and activation process:

Filling Out the Registration Form: Methods handle form inputs, including username, password, email, and other required fields.

Handling iframes:Switches to the iframe in the activation email to complete the account activation process after receiving a confirmation link.

Implicit Waits: Configures implicit waits to ensure that elements are available before interactions, enhancing test stability.

Actions: Uses Selenium’s Actions class for complex interactions, such as moving to elements, clicking, and handling dynamic content.

## Technologies Used

Java: The primary programming language used for scripting the tests.

Selenium WebDriver: Used to automate browser actions.

JUnit: Framework for organizing and running tests.

Maven: For dependency management and build automation.

