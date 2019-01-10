# SWC

## Requirements

- Java JDK 1.8 
- Maven 3.5.4+
- Tomcat 8+

## Installation

### Pre-requistes (Windows)

- Unzip k:\swc\swcalculator_home.zip to local C:\swcalculator_home

- Install Java JDK 1.8
	- set Enviroment variable JAVA_HOME="Java JDK installed directory"
	- append %JAVA_HOME%\bin to PATH
	- set Enviroment variable JAVA_OPTS=-Djava.library.path="C:\Apps\apache-tomcat-9.0.12\webapps\swcalculator-server\WEB-INF\classes" -DSWCALCULATOR_HOME="c:\swcalculator_home"

- Install Maven
	- set Enviroment variable MVN_HOME="Maven installed directory"
	- append %MVN_HOME%\bin to PATH

- Install Tomcat8

- ### Local Development Environment Setup (Windows)

	- Install Eclipse or IntelliJ or any other Java IDE
	- Clone this repository to your computer: git clone https://github.com/Eastern-Research-Group/SWC_NT.git
	- Navigate to  swcalculator-server
	- Run mvn clean compile install
	- copy .war file from swcalculator-server\target folder to {Tomcat8}\webapps folder
	- Navigate to FrontEnd folder
	- Run jar -cf stormwatercalculater.war -C stormwatercalculater .
	- copy stormwatercalculater.war to {Tomcat8}\webapps folder

