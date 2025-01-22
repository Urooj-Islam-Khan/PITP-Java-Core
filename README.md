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

# Java Data Types
 Data types are divided into two groups:
- Primitive data types - includes byte, short, int, long, float, double, boolean and char
-Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
---
