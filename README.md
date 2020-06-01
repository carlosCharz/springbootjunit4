# JUnit 4 Tests in Spring Boot project

Demo Spring Boot project with JUnit 4 Tests. It includes integration test (for controller) and unit tests (for service and simple class).

## Technologies

1. Spring Boot (spring-boot-starter-web, spring-boot-starter-tomcat, spring-boot-starter-test)
2. Java 8
3. Tomcat 8.5.x
5. Maven
6. JUnit 4

## Architecture
 
 1. **Controller:** is the presentation layer where the end points are located
 2. **Service:** is the service layer where the business logic resides
 3. **Repository:** is the persistence layer where the CRUD repository is located

## Tests

 1. **Integration Test (for the Controller):** it uses mockMvc and Hamcrest matchers
 2. **Unit Test (for the Service):** it uses the Mockito framework
 3. **Unit Test (for a simple class)** it uses pure JUnit

_**UPGRADE**_

* [JUnit 5](https://github.com/carlosCharz/springbootjunit5): This GitHub project is the upgraded version using JUnit 5.

## Exposed methods

**1. Get user by id. HTTP Method: GET**

```
http://localhost:8080/springbootjunit4/users/1
```

**2. Create a user. HTTP Method: POST**

```
http://localhost:8080/springbootjunit4/users
```
```
{
  "name": "Carlos",
  "age": 29,
  "email": "carlos1@yopmail.com"
}
```


## Documentation and Examples
 
* [Spring Initializr](https://start.spring.io): To generate the structure of a Spring Boot Project
* [JUnit 4 Get Started](https://github.com/junit-team/junit4/wiki/Getting-started)

## About me
I am Carlos Becerra - MSc. Softwware & Systems.  But to tell you the truth, I'd prefer to be a passionate developer. You can contact me via:

* [Google+](https://plus.google.com/+CarlosBecerraRodr%C3%ADguez)
* [Twitter](https://twitter.com/CarlosBecerraRo)

_**Any improvement or comment about the project is always welcome! As well as others shared their code publicly I want to share mine! Thanks!**_

## License
```javas
Copyright 2020 Carlos Becerra

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
