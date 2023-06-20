# Simple GUI Calculator (Work In Progress) 
## By John Waugh

I wanted to improve on a calculator which I was tasked with making for a lab assignment in college. Features that have been added include buttons for numbers 0-9, for basic mathmatical operations, for raising numbers to the power of 2 and also taking the square root of numbers in the textfield, and a decimal button. I have also added a little color to the calculator, including gradient buttons. 

It works similarly to a calculator application on a phone, except when entering in your expression you would want to format it as an infix expression. You enter in your expression and it prints out the result.

## Usage
I've included a Jar file which I believe can be downloaded and launched with Java Platform SE Binary, I am using JDK 17.0.6 to execute the file. You could also download the Java class files and add them to a project in your preferred IDE to mess around with and run the program.

## Possible Improvements
- Fixing errors surrounding the decimal button, which sometimes crashes the class which evaluates the expression. 
- Fixing certain really long expression that include all of the mathematical operators seem to crash the calculator, so I will probably have to look into improving the expression evaluator to account for more cases.
- Allowing the calculator to have results that are negative numbers, which as of 6/20/2023, it crashes when the result is negative.
