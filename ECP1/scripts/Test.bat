@echo off

set workspace=C:\Users\bg0094\Desktop\workspace\SPAI\ECP1\ECP1
set PATH=%PATH%C:\Users\bg0094\Desktop\apache-maven-3.3.3-bin\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_51
set M2_HOME=C:\Users\bg0094\Desktop\apache-maven-3.3.3-bin\apache-maven-3.3.3

echo -----------------------------------------

echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test -Denvironment.type=develop
pause

