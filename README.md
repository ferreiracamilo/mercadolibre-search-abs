# mercadolibre-search-abs
 Project for abs technical test

## Application Objective
Access mercadolibre to search for a specific item to then navigate first 3 pages and collect item results into a txt file.

## Video demo
[<img src="https://i.imgur.com/hpIXVFe.png" width="50%">](https://www.youtube.com/watch?v=LCo2aUeQY50 "mercadolibre search abs Demo")

## Brief Explanation to execute
Any of the executions below has a parameter called 'browser' to specify the browser to launch

-It is required to install Java 11 -preferred one- or greather for execution.
-Any browser intended to be launch must be installed previously to execution

Throughout maven command line execute command below.
```
clean test -Dtest=SearchItemsValidations#searchRemeras -Dbrowser=chrome
```

Througout TestNG
Set VM Options as and specify the actual test to execute
```
-Dbrowser=chrome
```

## Applied
- TestNG
- Page Object Model
- PageFactory
- WebDriver Manager -it is not needed to download any webdriver-
- Selenium
- Maven

## Author
Designed and developed by Camilo Ferreira

[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/camiloferreirafosalba/?locale=en_US)](https://www.linkedin.com/in/camiloferreirafosalba/?locale=en_US)
