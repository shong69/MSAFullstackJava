@echo off 

cls
set /p fname= input File name : 

mkdir dist
javac -d dist -encoding utf8 %fname%.java

cd dist
java %fname%

cd ..
rmdir /s /q dist 

pause