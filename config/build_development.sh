echo "> Build StormWaterCalculator server and ui .war" 
echo "> Change directory to swcalculator-server , generate server .war fi le"
cd ../swcalculator-server 
mvn clean compile install  
echo "> Change directory to FrontEnd and create UI .war file"
cd ../FrontEnd 
echo  "Implementation-Version:" $CIRCLE_BUILD_NUM >> Manifest.txt
jar cfm stormwatercalculator.war Manifest.txt -C stormwatercalculator .
