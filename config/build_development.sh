rm -rf /tmp/artifacts
mkdir /tmp/artifacts
echo "> Build StormWaterCalculator server and ui .war" 
echo "> Change directory to swcalculator-server , generate server .war fi le"
cd ../swcalculator-server 
mvn clean install -DskipTests
mvn sonar:sonar -Dsonar.host.url=$SONARQUBE_URL  -Dsonar.login=$SONARQUBE_TOKEN -Dsonar.projectKey=SWC-Server -Dsonar.projectName=SWC-Server
cp target/swcalculator-server.war /tmp/artifacts
echo "> Change directory to FrontEnd and create UI .war file"
cd ../FrontEnd 
mvn clean install
mvn sonar:sonar -Dsonar.host.url=$SONARQUBE_URL  -Dsonar.login=$SONARQUBE_TOKEN -Dsonar.projectKey=SWC-UI -Dsonar.projectName=SWC-UI -Dsonar.sources=stormwatercalculator
cp target/stormwatercalculator.war /tmp/artifacts