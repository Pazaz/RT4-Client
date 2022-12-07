#!/bin/sh
./mvnw package
java -jar ./client/target/runescape-1.0.jar 1 live english game0
