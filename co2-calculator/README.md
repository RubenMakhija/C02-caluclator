Step 1 : Take the commons-cli-1.0-2.0.jar and place in "/Library/Java/Extensions" location.

Step 2 : Unzip and extract the project at any location.

Step 3: Open terminal and navigate till src folder of the project.

Step 4: Compile the project using -  javac calculator/CO2Calculator.java

Step 5: Run the project using  - java -cp . calculator/CO2Calculator --distance 1800.5 --transportation-method large-petrol-car

Change the values for different test cases.

Note: The test cases should be of the format :

 java -cp . calculator/CO2Calculator --distance 1800.5 --transportation-method large-petrol-car
 Named parameters can be put in any order and only use a space ( ) between key and value. equal sign ( = ) between key and value is not supported for this project as of now.
