# Stormwater Calculator (SWC)

## Continuous Build Status (by branch)

* Develop branch: [![CircleCI](https://circleci.com/gh/Eastern-Research-Group/SWC/tree/develop.svg?style=svg&circle-token=5ca173edab2cffa9b665ec20cfeb7ae9b91e760f)](https://circleci.com/gh/Eastern-Research-Group/SWC/tree/develop)
* Master branch: [![CircleCI](https://circleci.com/gh/Eastern-Research-Group/SWC/tree/master.svg?style=svg&circle-token=5ca173edab2cffa9b665ec20cfeb7ae9b91e760f)](https://circleci.com/gh/Eastern-Research-Group/SWC/tree/master)

## Requirements

- Java JDK 1.8
- Maven 3.5.4+
- Tomcat 8+

## Installation

### Prerequisites (MS Windows based)

- Download and unzip https://projects.erg.com/water/cooper/swcalculator/swcalculator_home.zip locally to C:\swcalculator_home

- Install Java JDK 1.8
	- set Environment variable JAVA_HOME="Java JDK installed directory"
	- append %JAVA_HOME%\bin to PATH
	- set Environment variable JAVA_OPTS=-Djava.library.path="C:\Apps\apache-tomcat-9.0.12\webapps\swcalculator-server\WEB-INF\classes" -DSWCALCULATOR_HOME="c:\swcalculator_home"
	  *  Note: update the java.library.path value with your local tomcat installation/application deployment location.

- Install Maven
	- set Environment variable MVN_HOME="Maven installed directory"
	- append %MVN_HOME%\bin to PATH

- Install Tomcat8

# Contribute

We currently use two Git based branches to support development.

- develop = we use a feature branch strategy to submit code changes to this branch. Merges will be auto deployed to the Development environment.
- master = Only a designated gatekeeper for the project should issue pull requests from develop against master. Once the merge to master completes, the automated build process will build, test and then place the files that should be provided to the data center (i.e. NCC) staff for deployment to the staging and production environments.

**Instructions for contributing via Git:**

- Make sure you are on the Develop branch.

```
git checkout develop
```

- Make a new feature branch. Name it relative to the topic.

```
git checkout -b feature/your-branch-name
```

- You will now be in your new branch where you are free to make changes.

- After developing and testing locally, you can push the changes backup; you'll need to add, commit, and push with the following commands:

```
git add .
git commit -m "describe your changes in these quotation marks"
git push origin feature/your-branch-name
```

- Then you can make a pull request by finding your branch on the
  [Github repository](https://github.com/Eastern-Research-Group/SWC/branches)


## Local Development and Testing Workflow (Manual process for MS Windows)
	- Install Eclipse, IntelliJ, any other Java IDE or a command line runner
	- Clone this repository to your computer: git clone https://github.com/Eastern-Research-Group/SWC_NT.git
	- Navigate to  swcalculator-server
	- Run mvn clean compile install
	- copy .war file from swcalculator-server\target folder to {Tomcat8}\webapps folder
	- Navigate to FrontEnd folder
	- Run jar -cf stormwatercalculater.war -C stormwatercalculater .
	- copy stormwatercalculater.war to {Tomcat8}\webapps folder
