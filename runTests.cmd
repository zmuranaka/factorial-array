:: File: runTests.cmd
:: Zachary Muranaka
:: Runs the TestFactorialArray class without compiling

:: prevents the commands from being echoed to the screen
@echo off
cd bin
:: runs the TestFactorialArray class file
java TestFactorialArray
cd ../
:: prevents the window from automatically closing
pause
