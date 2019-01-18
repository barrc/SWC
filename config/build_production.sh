rm -rf /tmp/artifacts
mkdir /tmp/artifacts
echo "> Build StormWaterCalculator server and ui .war"
echo "> Change directory to swcalculator-server , generate server .war file"
cd ../swcalculator-server 
mvn clean install -DskipTests
cp target/swcalculator-server.war /tmp/artifacts
echo "> Change directory to FrontEnd and create UI .war file"
cd ../FrontEnd 
mvn clean install 
cp target/stormwatercalculator.war /tmp/artifacts
