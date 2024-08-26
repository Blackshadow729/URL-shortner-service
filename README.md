A Spring Boot-based application that simplifies URL sharing by converting lengthy URLs into concise, memorable aliases. Ideal for sharing links across various platforms like social media, messaging apps, and presentations. When a user clicks on a shortened URL, they are automatically redirected to the original destination.

How to use
With Docker and docker-compose:
$ git clone https://github.com/AnteMarin/UrlShortener-API.git
$ cd UrlShortener-API 
$ docker-compose up 
- Open localhost:8080/swagger-ui.html to see endpoints. 

Without Docker:
$ git clone https://github.com/AnteMarin/UrlShortener-API.git
- Make sure you have access to local or any MySQL server.
- Open project in your favorite editor and change application.properties file to point to your MySQL database
- Build Spring project 
- Open localhost:8080/swagger-ui.html to see endpoints.
