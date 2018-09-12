# Sample Java web app that uses JavaEE 8 (JAX-RS/CDI/EBJ) with OpenLiberty

Based on:
1. First lessons Packt Publishing '["Create and Deploy Java EE 8 Apps on Docker and Kubernetes"](https://www.udemy.com/create-and-deploy-java-ee-8-apps-on-docker-and-kubernetes/)
3. OpenLiberty's [Getting started Guide](https://openliberty.io/guides/getting-started.html)
3. Mr. Pavel Pscheidl's explanation [OpenLiberty.io: Simple guide](https://www.pavel.cool/javaee/ee4j/openliberty-jaxrs/)

Running:

Compile + run tests on localhost Liberty instance. Liberty instance will be terminated as soon as all tests are finished.
```bash
mvn install
```
Start/Stop Liberty

```bash
mvn liberty:start-server
mvn liberty:stop-server
```

If Liberty is running, then do changes and check them immediately
```bash
mvn package
```

Call JAX-RS endpoint with your favorite client:
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
