

<h1>How to build and run </h1>

1. Create application.properties file in src/main/resources and insert this content in it:

api.key=your_api_key


2. Type in command line

                ./gradlew build


3. Enter  directory build/libs
4. Run LOTR API service
   
                java -jar faina-SDK.jar

5. Open in browser http:/localhost:8080/v2/book
6. For authenticated requests use a REST client (Postman, Chrome REST Client add-on). 
   Create GET request with desired URL and add header Authorization=your_api_key

<h1>How to test</h1>

1. Create application.properties file in src/test/resources and insert this content in it:

api.key=your_api_key


2. Type in command line

                ./gradlew test
