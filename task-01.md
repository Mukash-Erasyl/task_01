# Task 01: Configure and run service + Micrometer

Create service with one REST Controller to return greeting message from application properties.

Use dependencies:
- latest [spring boot](https://docs.spring.io/spring-boot/index.html)
- [micrometer](https://micrometer.io/) 
- [prometheus](https://prometheus.io/)


you can find example how to start your application here: 
- https://spring.io/quickstart

## Expected behaviour
Must work the following requests:

```
GET /greeting
Response: greeting message from application.properties
```

```
GET /metrics
Response: collected JVM metrics by micrometer 
```

```
GET /status
Response: ok
```
