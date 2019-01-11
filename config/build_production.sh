rm -rf /tmp/artifacts
mkdir /tmp/artifacts
echo "> Build StormWaterCalculator server and ui .war"
echo "> Change directory to swcalculator-server , generate server .war file"
cd ../swcalculator-server 
mvn clean compile install -DskipTests 
cp target/swcalculator-server.war /tmp/artifacts
echo "> Change directory to FrontEnd and create UI .war file"
cd ../FrontEnd 
echo  "Implementation-Version:" $CIRCLE_BUILD_NUM >> Manifest.txt
jar cfm stormwatercalculator.war Manifest.txt -C stormwatercalculator .
cp stormwatercalculator.war /tmp/artifacts