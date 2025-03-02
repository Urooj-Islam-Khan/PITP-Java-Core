# PITP-Core-Java
---
# 1. Java Introduction:

## What is Java?
Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.

## It is used for:

- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection

## Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market
- It is easy to learn and simple to use
- It is open-source and free
- It is secure, fast and powerful
- It has huge community support (tens of millions of developers)
- Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
- As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa
---

# 2. Java Syntax
In the previous chapter, we created a Java file called Main.java, and we used the following code to print "Hello World" to the screen:



### Example:
```main.java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

# 3. Java Comments
Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

## Single-line Comments
Single-line comments start with two forward slashes (//).
Any text between // and the end of the line is ignored by Java (will not be executed).
This example uses a single-line comment before a line of code:

### Example:
```main.java
// This is a comment
System.out.println("Hello World");
```

## Java Multi-line Comments
Multi-line comments start with /* and ends with */.
Any text between /* and */ will be ignored by Java.
This example uses a multi-line comment (a comment block) to explain the code:

### Example:
```main.java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");
```

# 4. Java Variables
Variables are containers for storing data values.
In Java, there are different types of variables, for example:
- #String - stores text, such as "Hello". String values are surrounded by double quotes
- #int - stores integers (whole numbers), without decimals, such as 123 or -123
- #float - stores floating point numbers, with decimals, such as 19.99 or -19.99
- #char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- #boolean - stores values with two states: true or false

##Declaring (Creating) Variables
To create a variable, you must specify the type and assign it a value:
```main.java
type variableName = value;
```

To create a variable that should store text, look at the following example:
```main.java
String name = "Urooj";
System.out.println(name);
```

other types
```main.java
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```
---

# 5. Java Data Types
 Data types are divided into two groups:
- Primitive data types - includes byte, short, int, long, float, double, boolean and char
-Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
---

# 6. Java Operators
Java provides various operators to perform operations on variables and values.

- Arithmetic Operators: +, -, *, /, %
- Relational Operators: ==, !=, <, >, <=, >=
- Logical Operators: &&, ||, !
- Assignment Operators: =, +=, -=, *=, /=, %=

```main.java
int a = 10, b = 5;
System.out.println("Addition: " + (a + b)); // Output: 15
System.out.println("Comparison: " + (a > b)); // Output: true
```
---

# 7. Java Strings
Strings in Java are objects that represent a sequence of characters.

- Common methods: length(), charAt(), substring(), equals(), toUpperCase(), toLowerCase()

```main.java
String str = "Hello, World!";
System.out.println("Length: " + str.length()); // Output: 13
System.out.println("Uppercase: " + str.toUpperCase()); // Output: HELLO, WORLD!
```
---

# 8. Java If-Else
The if-else statement allows conditional execution of code.

```Syntax:
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

```main.java
int num = 10;
if (num % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```
---

---

# 9. Switch Statement
The switch statement allows a variable to be tested for equality against multiple values.

```Syntax:
switch (variable) {
    case value1:
        // Code for case 1
        break;
    case value2:
        // Code for case 2
        break;
    default:
        // Code if no cases match
}

```

```main.java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

```
---

# 9. Loops in Java
Loops allow you to execute a block of code repeatedly.

- For Loop: Used when the number of iterations is known.
```main.java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
- While Loop: Used when the number of iterations is not known.
```main.java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

```

- Do-While Loop: Executes at least once, even if the condition is false.
```main.java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

```
---

# 10. Java Methods
Methods in Java are blocks of code designed to perform specific tasks. They enhance code reusability and modularity.

## Types of Methods
1. Predefined Methods: Built-in methods provided by Java (e.g., ```System.out.println()```, ```Math.sqrt()```).
2. User-Defined Methods: Custom methods created by the programmer.
```Syntax:
returnType methodName(parameters) {
    // Code to execute
    return value; // Optional for void methods
}
```

```main.java
public class MethodsExample {
    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("The sum is: " + result);
    }
}

```
## Key Points
-Parameters: Methods can take input parameters to perform operations.
-Return Type: Specifies the type of value the method will return (int, String, void, etc.).
-Method Overloading: Multiple methods with the same name but different parameters.




``` main.java
public int multiply(int a, int b) { return a * b; }
public double multiply(double a, double b) { return a * b; }

```
---

# JAVA OOPS
---

## 1️. Abstraction
### Definition: Hiding implementation details and showing only the essential features of an object.

### Real-World Scenario: Banking System (ATM Machine)
  When you use an ATM, you only interact with the screen options like withdrawing money, checking balance, etc.

- You don’t see how the ATM connects to the bank server, how data is verified, how logs are maintained, etc.
- All the complex internal logic is abstracted away.

Java Example:

```
abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        // Logic for deposit
    }
    @Override
    void withdraw(double amount) {
        // Logic for withdrawal
    }
}
```

# 2. Encapsulation
## Definition: Wrapping data (fields) and methods into a single unit (class) and controlling access using access modifiers (private, public).

## Real-World Scenario: Medical Records
A patient's medical records are private, and only authorized personnel (doctors, admin) can view or update them.
- Data is protected.
- External systems can only interact via public methods like getPatientInfo().

### Java Example:
```
class Patient {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

# 3️. Inheritance
## Definition: A child class inherits the properties and behavior (methods) of a parent class.

## Real-World Scenario: Vehicle Types
A Car, Bike, and Truck are all types of Vehicle.
- They all share common properties (speed, capacity).
- They can have their own special features.

### Java Example:

```
class Vehicle {
    int speed;
    int capacity;

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void openSunroof() {
        System.out.println("Sunroof opened");
    }
}
```

# 4. Polymorphism
## Definition: The ability to present the same method in different forms.

## Real-World Scenario: Payment Processing System
A payment system can process payments via Credit Card, PayPal, or Bitcoin, but the user just calls processPayment().

The actual implementation varies based on the payment method.
### Java Example:
```
class PaymentProcessor {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPalPayment extends PaymentProcessor {
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}
```

### Usage:
```
PaymentProcessor payment = new CreditCardPayment();
payment.processPayment();  // "Processing credit card payment"
```

