:: File: compileAndRunTests.cmd
:: Zachary Muranaka
:: Compiles the project and runs the TestFactorialArray class

:: prevents the commands from being echoed to the screen
@echo off
cd bin
:: deletes all of the previous class files if there are any
if exist *.class del *.class
cd ../src
:: compiles all of the src files
javac *.java
:: moves all of the newly created class files into the bin folder
:: the > nul is needed so the output is not displayed
move *.class ../bin > nul
cd ../bin
:: runs the TestFactorialArray class file
java TestFactorialArray
cd ../
:: prevents the window from automatically closing
pause
