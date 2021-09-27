@echo off

CD H:\

DEL "H:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\softclinicstore-1.0.0-BUILD-SNAPSHOT.war" 
ping localhost -n 6 >nul 
COPY "H:\EclipseProyect\workspace\SoftClinicStore\target\softclinicstore-1.0.0-BUILD-SNAPSHOT.war" "softclinicstore-1.0.0-BUILD-SNAPSHOT.war"
MOVE "softclinicstore-1.0.0-BUILD-SNAPSHOT.war" "H:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\softclinicstore-1.0.0-BUILD-SNAPSHOT.war"
ping localhost -n 10 >nul 

