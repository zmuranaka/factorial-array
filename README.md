# Java Factorial Array

## What is this Project?

This project is a console-based program that can solve a factorial of an essentially limitless size. Normally in Java, the largest whole number that can be stored is the maximum value of a long, which is 2^63 - 1, or about 9.22 * 10^18. This max value may seem large, but when calculating factorials, it is quickly reached. In fact, the factorial of 21 exceeds the long max value, as it is about 5.1 * 10^19. This program helps solve this problem by allowing the factorial result to be up to 100000 digits long.

## How is this Implemented in Java?

I created a FactorialArray class that contains an array of numbers. Each index in the array serves as one digit of the factorial. Each time a number is multiplied to the factorial, it is multiplied as if you were multiplying it by hand - each digit is multiplied by the multiplier, and any digit that exceeds 10 has to be "carried" - subtracted by 10 *n* number of times, until it is less than 10, and then *n* is added to the next digit.

## Directories:

bin  
&nbsp;&nbsp;&nbsp;&nbsp;This folder contains all of the compiled classes.    
src  
&nbsp;&nbsp;&nbsp;&nbsp;This folder contains all of the source code.

## Files:

Driver.java  
&nbsp;&nbsp;&nbsp;&nbsp;This is the Driver class that actually runs the program. It contains some error handling to ensure the user enters a valid integer and that the factorial does not exceed 100000 digits.  
FactorialArray.java  
&nbsp;&nbsp;&nbsp;&nbsp;This class contains the actual array, a few methods the object uses to construct itself, and a void to print out its information. The Driver constructs an object of this class.    
compileAndRun.cmd  
&nbsp;&nbsp;&nbsp;&nbsp;This is a simple command prompt script I wrote because I was compiling and running the project from the command prompt, and I was often reusing the same commands. Running this script recompiles the project and then runs the Driver class. Note: the Driver src file must be named Driver.java in order for this script to work properly. Similarly, the .class files must be in the bin directory, and the the .java files must be in the src directory.  
runDriver.cmd  
&nbsp;&nbsp;&nbsp;&nbsp;This is a simple command prompt script I wrote that is similar to compileAndRun.cmd, except it does not recompile the program. Running this script simply runs the Driver class. Note: the Driver.class file must be in the bin directory for this script to work properly.

## Sources:

I wrote all of the code myself. I got the idea from [GeeksforGeeks]https://www.geeksforgeeks.org/factorial-of-an-array-of-integers/.

## Author:

Zachary Muranaka  
&nbsp;&nbsp;&nbsp;&nbsp;zacharymuranaka@mail.weber.edu  
&nbsp;&nbsp;&nbsp;&nbsp;http://icarus.cs.weber.edu/~zm83483/
