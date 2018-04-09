# Elevator Coding Challenge

Create an elevator controller!

This is a skeleton project with two interfaces that you must implement.

You are going to create an Elevator Controller and a number of Elevators that will be managed by the controller. 
There are a few extra classes already added to the project to get you up and running quickly.

## To Do

There are two interfaces to implement.

 * `Elevator` - this is the elevator itself and has a few public methods to take care of. There can be n number of elevators at the same time

 * `ElevatorController` - this is the elevator manager that keeps track of all the elevators running in the elevator shaft. There should be only one ElevatorController

### Bonus files

There are a few classes and files added to get you faster up and running. It is not mandatory to use these classes in 
your solution but you can use them to cut time in boiler plate coding.

 * `ElevatorApiController` for REST features. If you would like to use them in a test or to support a GUI here is a basic skeleton class for you

 * `ElevatorApplication` class for starting the Spring container and there are a few beans you can use as well
 
 * `SwaggerConfig` class for setting up the Swagger UI. That can be found at http://localhost:8080/api/v1/swagger-ui.html
 and the Swagger JSON is found at  http://localhost:8080/api/v1/api-docs.
 
 * The `resources\api.yaml` that is the Swagger/Open API 2.0 specification that was (more or less) used to generate some of the files.
 
 * There are two test classes added to get you up and running faster with tests and simulations

## What We Expect

Implement the elevator system and make it as __real as possible__ when it comes to the logic. Which elevator is best 
suited for a waiting floor, more requests than available elevators and so on.

Write a test or a simulation that runs the system with a number of floors and elevators. The numbers should be flexible 
and the system must work with one to many (limited to the language or operating system MAX_INT) elevators.

Document how we start, simulate and monitor your solution. If there is a GUI or logging for monitoring does not matter 
as long as you describe how it is supposed to be done.

Have fun! This is not a trap. It is a code challenge to check coding style etc. If there are features you don't have 
time to add or if you have future changes in mind, write comments or document them.

### Deliver Your Solution

Send a Pull Request from your fork to our upstream repository.

__We would like to see your solution within 7 days.__
 
## Build And Run (as is)

As the project is, the Spring app can be started as seen below.

build and run the code with Maven

    mvn package
    mvn spring-boot:run

or start the target JAR file 

    mvn package
    java -jar target\elevator-2017.12-SNAPSHOT.jar



