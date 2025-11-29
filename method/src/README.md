# Methods in Java

A method in Java is a block of code that performs a specific task and runs only when it is called. Methods are used to achieve code reusability, organize code, and make it easier to read and maintain.

A method definition consists of a method header and a method body.

**Syntax:**
```java
accessModifier returnType methodName(parameter1, parameter2, ...) {
    // Method body: code to be executed
    return value; // (if returnType is not void)
}
```
*   **`accessModifier`:** Defines the visibility of the method (e.g., `public`, `private`).
*   **`returnType`:** The data type of the value the method returns. If the method does not return a value, the `returnType` is `void`.
*   **`methodName`:** The name of the method.
*   **`parameter`:** A list of input values (and their types) that the method can accept.

---

## 1. Method Parameters

Parameters are variables that act as placeholders for the values (arguments) that are passed to a method when it is called.

**Example:**
A method that takes two integers as parameters and returns their sum.
```java
public int add(int a, int b) {
    return a + b;
}
// Calling the method:
int result = add(5, 10); // 5 and 10 are arguments
```

**Pass-by-Value:**
Java is strictly **pass-by-value**.
*   When a **primitive type** (like `int`, `double`) is passed to a method, a copy of the value is passed. Changes made to the parameter inside the method do not affect the original variable.
*   When an **object reference** is passed, a copy of the reference (the memory address) is passed. This means the method can modify the *contents* of the object itself, but it cannot change the original reference to point to a new object.

---

## 2. Method Overloading

Method overloading allows a class to have more than one method with the **same name**, as long as their **parameter lists are different**. The difference can be in the number of parameters, the type of parameters, or the order of parameters.

This allows you to define methods that perform similar tasks but with different types of input.

**Example:**
```java
public int add(int a, int b) {
    return a + b;
}

public double add(double a, double b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}
```
The compiler determines which version of the `add` method to call based on the arguments provided.

---

## 3. Method Overriding

Method overriding is a feature of inheritance. It occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.

**Rules for Method Overriding:**
*   The method must have the same name, return type, and parameter list as the method in the superclass.
*   The access level cannot be more restrictive than the overridden method's access level (e.g., you cannot override a `public` method with a `private` one).
*   The `@Override` annotation is used to indicate that a method is intended to override a superclass method. It helps the compiler catch errors if the method doesn't match the superclass method correctly.

**Example:**
```java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
```

---

## 4. Variable Scope

Scope refers to the visibility of a variable—the part of the program where the variable can be accessed.

*   **Local Variables:**
    *   Declared inside a method or a block of code.
    *   Their scope is limited to the method or block in which they are declared. They are created when the method/block is entered and destroyed when it is exited.

*   **Instance Variables (Fields):**
    *   Declared inside a class but outside any method.
    *   Their scope is the entire class. They are tied to an object (an instance of the class).

*   **Class/Static Variables:**
    *   Declared with the `static` keyword inside a class but outside any method.
    *   They are shared among all instances of the class.

**Example:**
```java
public class ScopeExample {
    private String instanceVar = "I am an instance variable"; // Instance scope

    public void myMethod(int methodParam) { // methodParam is a local variable
        String localVar = "I am a local variable"; // Local scope
        // Both instanceVar and localVar are accessible here
    }
    // localVar is NOT accessible here
}
```

---

## 5. Recursion

Recursion is the technique where a method calls itself to solve a problem. A recursive method must have two parts:

1.  **Base Case:** A condition that stops the recursion. Without a base case, the method would call itself indefinitely, leading to a `StackOverflowError`.
2.  **Recursive Step:** The part of the method that calls itself, usually with a modified argument that brings it closer to the base case.

Recursion is often used for problems that can be broken down into smaller, repetitive sub-problems, such as calculating factorials or traversing tree structures.

**Example:**
Calculating the factorial of a number.
```java
public int factorial(int n) {
    // Base case: factorial of 0 or 1 is 1
    if (n <= 1) {
        return 1;
    }
    // Recursive step: n * factorial of (n-1)
    else {
        return n * factorial(n - 1);
    }
}
```
Calling `factorial(4)` would result in: `4 * factorial(3)` -> `4 * 3 * factorial(2)` -> `4 * 3 * 2 * factorial(1)` -> `4 * 3 * 2 * 1` = `24`.
