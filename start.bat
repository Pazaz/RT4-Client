@echo off
.\mvnw.cmd package && java -jar .\client\target\runescape-1.0.jar 1 live english game0
