# Lab4: A Simple Calculator in Java

A basic command-line calculator implementing arithmetic operations and factorial calculation. 

## Highlights
* Performs addition, subtraction, multiplication, division (including handling of division by zero), modulus operation.
* Calculates factorials.
* Offers a user-friendly menu interface driven by `Scanner` input.
* Implements robust error handling for invalid user input.

## Overview

Lab4 is a Java program designed to demonstrate simple arithmetic operations and factorial calculation. It provides a command-line interface where users can select from various options: addition, subtraction, multiplication, division, modulus, or factorial. 

The program utilizes `Scanner` to read user input, ensuring valid numerical data. Based on the selected option, it performs the corresponding calculation and displays the result.  It features specific handling for division by zero and uses a `switch` statement for managing different operation choices. A loop allows users to repeatedly use the calculator until they choose to exit.

## Why This Project
This project serves as a pedagogical tool for beginners learning Java programming concepts such as data types, control flow (loops, switch statements), I/O operations (`Scanner`), and error handling. It provides a practical example of how to implement a basic application in Java.


## Usage
```java
1. Run the "Lab4.java" file; 

2.  Select an option from the menu:

   * 1-5: Perform arithmetic operation (add, subtract, multiply, divide, modulus)
   * 6: Calculate factorial
   * 7: Exit program
```



Here's a sample interaction:


```
Choose an option: 
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
6. Factorial
7. Exit
1 	

Enter the first number
5
Enter the second number
3
The sum is: 8

Choose an option: 
...  



```



## Installation

* **Dependencies:** JDK (Java Development Kit) - Ensure Java is installed on your system.

* **Requirements:** A text editor and compiled Java environment. 
* To compile and run the project:
   1. Save the `Lab4.java` code in a file named "Lab4.java".  

2. Open a terminal or command prompt and navigate to the directory containing the 
   file.


3. Compile the code:

```bash
javac Lab4.java
```

4. Run the compiled program:

 ```bash
 java Lab4
 ```

## Architecture
* `Lab4.java` : Contains the main logic of the calculator program, handling user interaction, performing calculations, and displaying results.



## Future Improvements

* Implement more complex mathematical functions.
* Add a graphical user interface (GUI) for enhanced user experience.
* Incorporate features like memory saving, history operations, or expressions evaluation.




