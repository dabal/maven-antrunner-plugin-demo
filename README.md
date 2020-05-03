# maven-antrunner-plugin-demo

Simple demo for managing configuration files with `maven-antrunner-plugin`.

Demo contains `Spring Boot` application with with just one controller available on 

`http://localhost:8080`

This controller display name of the application which is defined in `application.properties`

## Running application
Commonly there, are two ways of running this application:
### Using Spring Boot run configuration from Intelij
This approach will use file `src/main/resources/application.properties` and displayed name will be
```
My demo app - name from application.properties
```
### Using maven
```$bash
mvn spring-boot:run
```
This approach will use file `src/main/resources/MyAppApplication.properties` and displayed name will be
```
maven ant runner demo application - name from myAppApplication.properties - moved by maven-antrunner-plugin
```
Properties file will be changed during compilation phase.

## Why?
Of course in real life file MyAppApplication.properties should be not available in scm:). There should be only `myAppApplication.sample.properties` with dummy data 