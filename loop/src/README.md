# Loops in Java

Loops are a fundamental concept in programming used to execute a block of code repeatedly as long as a certain condition is met. Java provides several types of loops to handle different situations.

The primary types of loops in Java are:
1.  **`for` Loop**
2.  **`while` Loop**
3.  **`do-while` Loop**
4.  **Enhanced `for` Loop (or "for-each" loop)**

Additionally, we will cover loop control statements: `break` and `continue`.

---

## 1. `for` Loop

The `for` loop is used when you know in advance how many times you want to execute a block of code. It's a compact loop structure that consists of three parts: initialization, condition, and iteration (increment/decrement).

**Syntax:**
```java
for (initialization; condition; iteration) {
    // Code to be executed
}
```
*   **Initialization:** Executed once when the loop begins. Used to declare and initialize a loop control variable.
*   **Condition:** Evaluated before each iteration. The loop continues as long as this condition is `true`.
*   **Iteration:** Executed at the end of each iteration. Typically used to increment or decrement the loop variable.

**Example:**
Printing numbers from 1 to 5.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count is: " + i);
}
```

---

## 2. `while` Loop

The `while` loop is used to execute a block of code as long as a specified condition is `true`. The condition is checked *before* the loop body is executed. If the condition is initially `false`, the loop body will not be executed at all.

**Syntax:**
```java
while (condition) {
    // Code to be executed
    // (Must include a statement to eventually make the condition false)
}
```

**Example:**
A simple countdown from 5 to 1.
```java
int count = 5;
while (count > 0) {
    System.out.println("Countdown: " + count);
    count--; // Decrement the counter
}
```

---

## 3. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but with one key difference: the condition is checked *after* the loop body is executed. This means the loop body will **always be executed at least once**, even if the condition is initially `false`.

**Syntax:**
```java
do {
    // Code to be executed
} while (condition);
```

**Example:**
A menu that is displayed at least once.
```java
int choice;
do {
    System.out.println("Please enter your choice (0 to exit):");
    // Assume getChoice() gets user input
    choice = getChoice(); 
} while (choice != 0);
```

---

## 4. Enhanced `for` Loop (for-each)

The enhanced `for` loop (or "for-each" loop) was introduced in Java 5. It is used to iterate through the elements of an array or a collection (like `ArrayList`) without having to manage an index variable. It makes the code more readable and less error-prone.

**Syntax:**
```java
for (Type variableName : arrayOrCollection) {
    // Code to be executed for each element
}
```

**Example:**
Iterating over an array of strings.
```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println("Hello, " + name);
}
```

---

## Loop Control Statements

Java provides two statements to control the flow of loops:

### `break`
The `break` statement is used to **terminate the loop immediately**. When `break` is encountered inside a loop, the loop is exited, and the program continues execution at the statement immediately following the loop.

**Example:**
Stop a loop when a specific value is found.
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println(i); // Prints 1, 2, 3, 4
}
```

### `continue`
The `continue` statement is used to **skip the current iteration** of the loop and proceed to the next one. When `continue` is encountered, the rest of the code inside the loop for the current iteration is skipped.

**Example:**
Print only the odd numbers between 1 and 10.
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip this iteration if i is even
    }
    System.out.println(i); // Prints 1, 3, 5, 7, 9
}
```
