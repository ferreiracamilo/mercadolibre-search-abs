# mercadolibre-search-abs
 Project for abs technical test

# mercadolibre-search-abs

## Application Objective
Access mercadolibre to search for a specific item to then navigate first 3 pages and collect item results into a txt file.

## Brief Explanation to execute
With any of executions below is possible to update value for -Dbrowser variable to launch a different browser

It is required to install Java 11 -preferred one- or greather for execution.

Throughout maven command line execute command below.
```
clean test -Dtest=SearchItemsValidations#searchRemeras -Dbrowser=chrome
```

Througout TestNG
Set VM Options as "-Dbrowser=chrome"
```
-Dbrowser=chrome
```

## Knowledge applied
- TestNG
- Page Object Model
- PageFactory
- WebDriver Manager -it is not needed to download any webdriver-

## Author
Designed and developed by Camilo Ferreira

[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/camiloferreirafosalba/?locale=en_US)](https://www.linkedin.com/in/camiloferreirafosalba/?locale=en_US)
