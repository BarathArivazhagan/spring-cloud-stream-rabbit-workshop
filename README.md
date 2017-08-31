# spring-cloud-stream-rabbit-workshop

This repo contains applications demonstrating the use case of spring cloud streaming applications 


## Projects : 

<table>
 <tr>
   <th>Name</th>
   <th>Port</th>
   <th>Description</th>
 </tr>
 <tr>
   <td>rabbit-stream-source</td>
   <td>12000</td>
    <td> Source application </td>
 </tr>
 <tr>
   <td>rabbit-stream-processor</td>
   <td>12001</td>
    <td> Processor application </td>
 </tr>
  <tr>
   <td>rabbit-stream-sink</td>
   <td>12002</td>
    <td> Sink application </td>
 </tr>
  <tr>
   <td>rabbit-mq</td>
   <td>5672</td>
    <td> RabbitMQ running as a service(required) </td>
 </tr>



</table>

## How to build and run the project ?

* Clone/Download the repository 

* Navigate to directory and Run maven build: 
```
./mvnw clean install
```

## Run as Docker containers: 

* To run as docker containers: 

```
docker-compose up
```
