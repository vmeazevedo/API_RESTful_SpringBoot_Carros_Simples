# API_RESTful_SpringBoot_Carros
API RESTful com SpringBoot.

## Requirements
You will need to install the library below:
- mysql-connector
- Spring Tool Suite 4: 
https://www.youtube.com/watch?v=FFedk11F838&ab_channel=WilliamJ%C3%BAnior

You will need to instal MySQL and XAMPP also:
- MySQL installation tutorial:
https://www.youtube.com/watch?v=5JbAOWJbgIA&list=PLHz_AreHm4dkBs-795Dsgvau_ekxg8g1r&index=2&ab_channel=CursoemV%C3%ADdeo

- XAMPP installation tutorial:
https://www.youtube.com/watch?v=R2HrwSQ6EPM&list=PLHz_AreHm4dkBs-795Dsgvau_ekxg8g1r&index=3&ab_channel=CursoemV%C3%ADdeo


## Goals:
- Create a project with SpringBoot
- Create a web service that connects to the MySQL database
- Return data in JSON format
- Create a complete CRUD web service to create, search, edit and delete data
- Learn to use the JPA (Java Persistence Api) persistence framework

## Useful information
- In the "images" folder you will find the test of each request made.
- In the folder "mysql_dados" you will find all the information used to create the database used.
- In the "postman" folder you will find an explanation of the use of requests.

## Operation
- url: http://localhost:8080/api/v1/carros/

Accessing the main url, the entire database of our bank will be presented:

![0_get](https://user-images.githubusercontent.com/40063504/113340024-c0925d00-9301-11eb-9576-4c560bf40156.PNG)

- url: http://localhost:8080/api/v1/carros/id

Informing an "Id" at the end of our url will show the information of the chosen car filtered by the Id:

![1_get_id](https://user-images.githubusercontent.com/40063504/113340034-c38d4d80-9301-11eb-88f2-736dde366e4c.PNG)

- url: http://localhost:8080/api/v1/carros/tipo/{tipo}

Informing the "Type" at the end of our url will show all the cars contained in our database filtered by type:

![2_get_tipo](https://user-images.githubusercontent.com/40063504/113340040-c5571100-9301-11eb-97b9-a74284d59fac.PNG)

## POST
- url: http://localhost:8080/api/v1/carros/

Passing the example json we can add new data in our database:

![3_post](https://user-images.githubusercontent.com/40063504/113340047-c720d480-9301-11eb-95bb-504e2b9e0326.PNG)

![3_post_1](https://user-images.githubusercontent.com/40063504/113340056-c9832e80-9301-11eb-8bab-2d46de27f3f1.PNG)

## PUT
- url: http://localhost:8080/api/v1/carros/id

Passing an "Id" in our url, we can update the requested Id by informing the new parameters in it:

![4_put](https://user-images.githubusercontent.com/40063504/113340059-cb4cf200-9301-11eb-8681-23559a6f79e2.PNG)

![4_put_1](https://user-images.githubusercontent.com/40063504/113340071-ce47e280-9301-11eb-99af-7394dc4807c9.PNG)

## DELETE
- url: http://localhost:8080/api/v1/carros/id

By passing an "Id" in our url, we can perform the deletion of the requested Id:
![5_delete](https://user-images.githubusercontent.com/40063504/113340078-d011a600-9301-11eb-9904-67d9c1ec7d21.PNG)
