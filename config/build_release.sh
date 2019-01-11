echo "> Tag release"
echo "git tag -a v1.0."$CIRCLE_BUILD_NUM "-m \"Release v1.0."$CIRCLE_BUILD_NUM \"> gitrelease.sh
echo "git push origin v1.0."$CIRCLE_BUILD_NUM
sudo chmod 775 gitrelease.sh
./gitrelease.sh