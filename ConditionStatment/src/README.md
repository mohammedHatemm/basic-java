# Conditional Statements in Java

Conditional statements in Java are used to control the flow of execution based on certain conditions. They allow a program to make decisions and execute different blocks of code depending on whether a condition is `true` or `false`.

There are several types of conditional statements in Java:

1.  **`if` Statement**
2.  **`if-else` Statement**
3.  **`if-else-if` Ladder**
4.  **Nested `if` Statement**
5.  **`switch` Statement**

---

## 1. `if` Statement

The `if` statement is the most basic decision-making statement. It executes a block of code only if a specified condition is `true`.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

**Example:**
If a variable `age` is greater than or equal to 18, a message is printed.
```java
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

---

## 2. `if-else` Statement

The `if-else` statement provides an alternative block of code to be executed if the condition is `false`.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

**Example:**
Checks if a number is even or odd.
```java
int number = 7;
if (number % 2 == 0) {
    System.out.println("The number is even.");
} else {
    System.out.println("The number is odd.");
}
```

---

## 3. `if-else-if` Ladder

The `if-else-if` ladder is used to test a series of conditions. It executes the block of code corresponding to the first `true` condition it encounters. If none of the conditions are true, the final `else` block is executed.

**Syntax:**
```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else if (condition3) {
    // Code for condition3
} else {
    // Code if all conditions are false
}
```

**Example:**
Assigns a grade based on a student's score.
```java
int score = 85;
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

---

## 4. Nested `if` Statement

A nested `if` statement is an `if` statement inside another `if` statement. This is used to test for more complex conditions.

**Syntax:**
```java
if (outer_condition) {
    // Code for outer condition
    if (inner_condition) {
        // Code for inner condition
    }
}
```

**Example:**
Checks if a person is eligible for a specific job based on age and qualifications.
```java
int age = 25;
boolean hasDegree = true;
if (age >= 21) {
    if (hasDegree) {
        System.out.println("You are eligible for the job.");
    } else {
        System.out.println("You need a degree to be eligible.");
    }
} else {
    System.out.println("You must be at least 21 years old.");
}
```

---

## 5. `switch` Statement

The `switch` statement is used to select one of many code blocks to be executed. It evaluates an expression and matches its value to a series of `case` labels.

**Key Points:**
*   The `switch` expression must be of type `byte`, `short`, `char`, `int`, `String`, or an `enum`.
*   The `break` keyword is used to exit the `switch` block. If omitted, execution "falls through" to the next case.
*   The `default` case is optional and is executed if no other case matches.

**Syntax:**
```java
switch (expression) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    // ... more cases
    default:
        // Code if no case matches
}
```

**Example:**
Prints the name of the day based on a number from 1 to 7.
```java
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
        System.out.println("Another day");
}
```
