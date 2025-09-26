#!/bin/bash

title="Crypto trading bot"
echo -e '\033]2;'$title'\007'

java -Xms1g -Xmx2g --add-opens java.base/java.math=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED -jar -Djava.net.preferIPv4Stack=true -Dspring.profiles.active=default target/feedback-service.jar
