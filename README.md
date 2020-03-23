# Petstore-smoke-test

Pet module Smoke Test using BDD to build test cases

Designed a Smoke Test Framework for PetStore PET module 

Chosen four end points: Please refer PetEndPoint.java under endpoints package

I have used BDD - Cucumber, RESTAssured and Allure for reporting


# How to install  

install the dependencies Using Maven  

To run the test use this command:

    mvn clean test


Install Allure then use this command to generate the report:

    allure serve target/surefire-reports/


