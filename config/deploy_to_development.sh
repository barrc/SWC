echo "> Build and Deploy to swcweb.erg.com"
echo "> Change directory to swcalculator-server , generate server .war file"
cd ../swcalculator-server && mvn clean compile install -DskipTests 
echo "> Change directory to FrontEnd and create UI .war file"
cd ../FrontEnd && jar -cf stormwatercalculator.war -C stormwatercalculator .
echo "> Deploy swcalculator-server artifact"
cd ..
curl -u $username:$password --upload-file swcalculator-server/target/swcalculator-server.war "http://swcweb.erg.com/manager/text/deploy?path=/swcalculator-server&update=true"
echo "> Deploy stormwatercalculator.war"
curl -u $username:$password --upload-file FrontEnd/stormwatercalculator.war "http://swcweb.erg.com/manager/text/deploy?path=/stormwatercalculator&update=true" 