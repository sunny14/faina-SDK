

<h1>How to build and run </h1>

1. Create application.properties file in src/main/resources and insert this content in it:

api.key=your_api_key


2. Type in command line

                ./gradlew build


3. Enter  directory build/libs
4. Run LOTR API service
   
                java -jar faina-SDK.jar

<h1>How to test</h1>

1. Create application.properties file in src/test/resources and insert this content in it:

api.key=your_api_key


2. Type in command line

                ./gradlew test
