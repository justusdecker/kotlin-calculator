# Simple Command Line Calculator (Kotlin)

This is a basic console application written in Kotlin that performs simple arithmetic calculations based on user input.

## ⌨️ Usage

Once the program is running, it will prompt you sequentially for three inputs:

The first number (A)

The operator (OP)

The second number (B)

Example Session

A:
10
OP:
+
B:
5
15

### Supported Operators

The calculator supports the following four basic arithmetic operators:

`+` (Addition)

`-` (Subtraction)

`*` (Multiplication)

`/` (Division)

## ⚠️ Functionality and Limitations

Division by Zero: The application includes a check to prevent division by zero, printing the message "Division by Zero!" instead of crashing.

Unsupported Operators: If an operator other than `+`, `-`, `*`, or `/` is entered, the program will output an error message: "This operator does not exist -1".

Input Handling: The current version assumes all number inputs are valid integers. There is no explicit error checking for non-integer inputs (e.g., typing text where a number is expected).