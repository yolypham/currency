# currency
Java back end REST API with Spring Boot 2

Steps to start up server (in Mac):
1. Load up Terminal
2. cd /currency folder
3. type: ./mvnw
4. Ready... will startup in port 8080

To Test in Postman:  
1. POST to http://localhost:8080/api/currency
2. add JSON body: 
  {
	"amount" : 76.9,
	"currency" : "EUR"
  }
  
3.Ready... you should get response back USD conversion 
