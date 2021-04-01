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


## Objetivos:
- Criar um projeto com SpringBoot
- Criar um web service que se conecta no banco de dados MySQL
- Retornar os dados no formato JSON
- Criar um web service CRUD completo para criar, buscar, editar e excluir os dados
- Aprender a utilizar o framework de persistência JPA (Java Persistence Api)

## Informações úteis
- Na pasta "imagens" você encontrará o teste de cada requisição realizado.
- Na pasta "mysql_dados" você encontrará todas as informações utilizadas para criar a base de dados utilizada.
- Na pasta "postman" você encontrará a explicação da utilização das requisições.

## Operation
- url: http://localhost:8080/api/v1/carros/

Acessando a url principal será apresentado toda a base de dados de nosso banco:

![0_get](https://user-images.githubusercontent.com/40063504/113340024-c0925d00-9301-11eb-9576-4c560bf40156.PNG)

- url: http://localhost:8080/api/v1/carros/id

Informando um "Id" no final de nossa url será apresentado as informações do carro escolhido filtrado pelo Id.

![1_get_id](https://user-images.githubusercontent.com/40063504/113340034-c38d4d80-9301-11eb-88f2-736dde366e4c.PNG)

- url: http://localhost:8080/api/v1/carros/tipo/{tipo}

Informando o "Tipo" no final de nossa url será apresentado todos os carros contidos em nossa base filtrados pelo tipo.

![2_get_tipo](https://user-images.githubusercontent.com/40063504/113340040-c5571100-9301-11eb-97b9-a74284d59fac.PNG)

## POST
- url: http://localhost:8080/api/v1/carros/

Passando o json exemplo podemos adicionar novos dados em nossa base de dados

![3_post](https://user-images.githubusercontent.com/40063504/113340047-c720d480-9301-11eb-95bb-504e2b9e0326.PNG)

![3_post_1](https://user-images.githubusercontent.com/40063504/113340056-c9832e80-9301-11eb-8bab-2d46de27f3f1.PNG)

## PUT
- url: http://localhost:8080/api/v1/carros/id

Passando um "Id" em nossa url, podemos realizar o update do Id requisitado informando os novos parâmetros nele.

![4_put](https://user-images.githubusercontent.com/40063504/113340059-cb4cf200-9301-11eb-8681-23559a6f79e2.PNG)

![4_put_1](https://user-images.githubusercontent.com/40063504/113340071-ce47e280-9301-11eb-99af-7394dc4807c9.PNG)

## DELETE
- url: http://localhost:8080/api/v1/carros/id

Passando um "Id" em nossa url, podemos realizar a deleção do Id requisitado.
![5_delete](https://user-images.githubusercontent.com/40063504/113340078-d011a600-9301-11eb-9904-67d9c1ec7d21.PNG)
