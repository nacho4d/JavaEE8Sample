# Sample Java web app that uses JavaEE 8 (JAXRS/CDI/EBJ) with OpenLiberty

Based on:
1. First lessons of O'Reillys'["LEARNING PATH: Create and Deploy Java EE 8 Apps on Docker and Kubernetes"](https://www.safaribooksonline.com/learning-paths/learning-path-create/9781789615425/9781788831130-video2_2)
3. OpenLiberty's [Getting started Guide](ttps://openliberty.io/guides/getting-started.html)
3. Pavel Pscheidl's [OpenLiberty.io: Simple guide](https://www.pavel.cool/javaee/ee4j/openliberty-jaxrs/)

Running:

Compile + run tests on localhost liberty liberty instance.
```bash
mvn install
```

Do changes and check in localhost liberty instance
```bash
mvn package
```

Call JAXRS endpoint with your favorite client:
```bash
$ curl -i http://localhost:9080/learning-javaee/resources/cars
HTTP/1.1 200 OK
X-Powered-By: Servlet/4.0
Content-Type: application/json
Date: Wed, 12 Sep 2018 06:58:28 GMT
Content-Language: en-JP
Content-Length: 4

[{}]
```