cd ..
echo "> Deploy to swcweb.erg.com"
curl -u $username:$password --upload-file swcalculator-server/target/swcalculator-server.war "http://swcweb.erg.com/manager/text/deploy?path=/swcalculator-server&update=true"
echo "> Deploy stormwatercalculator.war"
curl -u $username:$password --upload-file FrontEnd/target/stormwatercalculator.war "http://swcweb.erg.com/manager/text/deploy?path=/stormwatercalculator&update=true" 