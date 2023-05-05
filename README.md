# Openai-rest

## A Rest API implementation of the Open AI whisper model for voice transcription

### Used Feign Third Party Rest API service for sending voice file over to whisper voice transcript api

## To get Started

* Change API key in application.yml to your own created using your open ai account

```
cd rest
mvn install 
mvn spring-boot:run

```

## Rest Endpoint
* Send a POST request on ***http://localhost:8080/api/v1/transcription***
* Supply voice file and model of voice transcript you want to use
![image](https://user-images.githubusercontent.com/39771769/236490884-6f016b4f-03f3-4f65-95f4-d76e7febabdd.png)
* Set the example String with which you want to compare in AccuracyMeasure class of utility package
![image](https://user-images.githubusercontent.com/39771769/236491643-c3478047-5575-4ab9-b31c-175c1eabb3ba.png)

