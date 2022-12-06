# microservice-ruleengine-performance

The application is intended to test the performance of microservice vs monolit arhitecture using drool as rule engine.

## Configuration

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

## Microservice flow
* each microservice is sending a http request to drool
* after receiving the response from drool it sends the http request to the next microservice 
* the last one is sending the last response that will be forwarded to the first microservice
* Flow: 
  - HTTP POST -> service-processor1
  - service-processor1 -> HTTP GET on drool 
  - service-processor1 -> HTTP POST service-processor2
  - ....

## Monolit flow
* HTTP POST -> service-processor-monolit
* service-processor-monolit -> HTTP GET on drool
* service-processor-monolit -> HTTP GET on drool
* service-processor-monolit -> HTTP GET on drool
* service-processor-monolit -> HTTP GET on drool

## Starting the app

* first start the eureka naming server
* then start all the other apps in random order

## Sending the first request
* monolit arhitecture: HTTP POST -> localhost:7000/service-process
* microservice arhitecture: HTTP POST -> localhost:7100/service-process1

## Performance numbers
* microservice arhitecture -> 200 requests / second and 40 ms request duration time
* monolit arhitecture -> 3000 requests / second and 2 ms request duration time
