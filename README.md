# Visitor Management System

This is an assignment project to showcase Microservices Architecture using Spring Boot </br>
</br>

For this project, it has 4 different type of microservices: </br>
1. discovery-server -> used as discovery service to provide pathname for other services. </br>
2. visitor-management-service -> main microservice use to populate all information needed. </br>
3. owner-information-service -> microservice that will handle request related to owner. </br>
4. booking-visit-service -> microservice that will handle request related to booking and visitor. </br>
</br>

Technology used in this project: </br>
1. Java version 13 </br>
2. Spring Boot version 2.25 </br>
3. MySQL version 8.0.19 </br>
4. Eclipse IDE version 2019-12 </br>
</br>

Step to test: </br>
1. In this project, you need to run all services using any supported IDE. In this case I am using Eclipse. </br>
2. You need to create MySQL db and run the script inside 'iris_asgnmt_db_script.sql' for dummy data. </br>
3. To make sure that the microservices is running fine, can use this command to check: </br>
    -> netstat -aon |find /i "listening" |find "8080" </br>
4. Another way to check if all microservices is running is by going to 'http://localhost:8761'. </br>
5. It should show 3 application instance is running.
6. For this assignment, I just create only 1 API that is accessible to user that is 'http://localhost:8081/visitor/103' </br>
7. In this case 103 is booking id. You can use another value existed inside db. </br>
8. This API, will go to 'booking-visit-service' to fetch booking detail and visitor detail. </br>
9. Then it will go to 'owner-information-service' to fetch owner detail. </br>
10. For authentication purpose, you can use username = iris and password = iris or username = test and password = test. </br>
11. For each microservices, they are using their different db. </br></br>
