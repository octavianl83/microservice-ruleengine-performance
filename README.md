# microservice-ruleengine-performance

The application is intended to test the performance of microservice vs monolit arhitecture using drool as rule engine.

##Configuration

There is no special configuration to be done. Just download the repo and start the app.

The following spring boot services are present:
* monolit app that is sending 4 request to drool
* microservices app:
  - service processor 1
  - service processor 2
  - service processor 3
  - service processor 4
* eureka naming server
* drool microservice app

##Starting the app

* first start the eureka naming server
* then start all the other apps in random order

# Sending the first request
* monolit arhitecture: HTTP POST -> localhost:7000/service-process
* microservice arhitecture: HTTP POST -> localhost:7100/service-process1
