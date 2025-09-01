# Java Basics - Complete Guide

## Table of Contents
1. [Output and Input](#output-and-input)
2. [Data Types](#data-types)
3. [Arithmetic Operators](#arithmetic-operators)
4. [Assignment Operators](#assignment-operators)
5. [Increment and Decrement Operators](#increment-and-decrement-operators)
6. [Compound Assignment Operators](#compound-assignment-operators)
7. [Final Keyword](#final-keyword)
8. [Type Casting](#type-casting)

---

## Output and Input

### Output
To print anything in Java, you can use:
```java
System.out.println("Hello World"); // Prints with new line
System.out.print("Hello ");        // Prints without new line
System.out.printf("Number: %d", 5); // Formatted output
```

### Input
To take data from user, you must use:
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Taking different types of input
        int number1 = input.nextInt();        // Integer input
        double decimal = input.nextDouble();   // Double input
        String text = input.nextLine();       // String input
        
        input.close(); // Good practice to close Scanner
    }
}
```

### Data Sources
The program can take data from different sources:
1. **External file**
2. **User input** (as shown above)

---

## Data Types

### Primitive Data Types
Java has 8 primitive data types:

| Data Type | Size    | Range                                    | Example |
|-----------|---------|------------------------------------------|---------|
| `byte`    | 1 byte  | -128 to 127                             | `byte b = 100;` |
| `short`   | 2 bytes | -32,768 to 32,767                       | `short s = 1000;` |
| `int`     | 4 bytes | -2,147,483,648 to 2,147,483,647         | `int i = 50000;` |
| `long`    | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long l = 100000L;` |
| `float`   | 4 bytes | ~6-7 decimal digits                      | `float f = 3.14f;` |
| `double`  | 8 bytes | ~15 decimal digits                       | `double d = 3.14159;` |
| `char`    | 2 bytes | Single character (Unicode)               | `char c = 'A';` |
| `boolean` | 1 bit   | true or false                           | `boolean flag = true;` |

### Non-Primitive Data Types
- **String**: `String name = "Java";`
- **Arrays**: `int[] numbers = {1, 2, 3};`
- **Classes**: User-defined classes
- **Interfaces**: Contract for classes

---

## Arithmetic Operators

Java provides several arithmetic operators:

| Operator | Description    | Example     | Result |
|----------|----------------|-------------|--------|
| `+`      | Addition       | `5 + 3`     | `8`    |
| `-`      | Subtraction    | `5 - 3`     | `2`    |
| `*`      | Multiplication | `5 * 3`     | `15`   |
| `/`      | Division       | `10 / 3`    | `3` (integer division) |
| `%`      | Modulus        | `10 % 3`    | `1`    |

### Example:
```java
int a = 10, b = 3;
System.out.println("Addition: " + (a + b));        // 13
System.out.println("Subtraction: " + (a - b));     // 7
System.out.println("Multiplication: " + (a * b));  // 30
System.out.println("Division: " + (a / b));        // 3
System.out.println("Modulus: " + (a % b));         // 1
```

---

## Assignment Operators

### Basic Assignment
```java
int x = 10;        // Assigns 10 to x
String name = "Java"; // Assigns "Java" to name
```

### Special Assignment Operators
These are covered in the compound assignment section below.

---

## Increment and Decrement Operators

### Pre-increment and Pre-decrement
- **Pre-increment (`++variable`)**: Increments first, then uses the value
- **Pre-decrement (`--variable`)**: Decrements first, then uses the value

```java
int x = 5;
int y = ++x; // x becomes 6, then y gets 6
System.out.println("x = " + x + ", y = " + y); // x = 6, y = 6
```

### Post-increment and Post-decrement
- **Post-increment (`variable++`)**: Uses the value first, then increments
- **Post-decrement (`variable--`)**: Uses the value first, then decrements

```java
int a = 5;
int b = a++; // b gets 5, then a becomes 6
System.out.println("a = " + a + ", b = " + b); // a = 6, b = 5
```

### Example Comparison:
```java
int num1 = 10;
int num2 = 10;

int result1 = ++num1; // Pre-increment: num1 = 11, result1 = 11
int result2 = num2++; // Post-increment: result2 = 10, num2 = 11

System.out.println("Pre-increment result: " + result1);  // 11
System.out.println("Post-increment result: " + result2); // 10
```

---

## Compound Assignment Operators

These operators perform an operation and assign the result back to the variable:

| Operator | Equivalent | Description |
|----------|------------|-------------|
| `+=`     | `x = x + y`  | Addition assignment |
| `-=`     | `x = x - y`  | Subtraction assignment |
| `*=`     | `x = x * y`  | Multiplication assignment |
| `/=`     | `x = x / y`  | Division assignment |
| `%=`     | `x = x % y`  | Modulus assignment |

### Examples:
```java
int x = 10;
x += 5;  // x = x + 5, so x becomes 15
x -= 3;  // x = x - 3, so x becomes 12
x *= 2;  // x = x * 2, so x becomes 24
x /= 4;  // x = x / 4, so x becomes 6
x %= 4;  // x = x % 4, so x becomes 2
```

---

## Final Keyword

The `final` keyword in Java has different meanings depending on context:

### Final Variables
- Cannot be reassigned once initialized
- Must be initialized either at declaration or in constructor

```java
final int MAX_SIZE = 100;        // Constant
final List<String> list = new ArrayList<>(); // Reference is final, but content can change

// MAX_SIZE = 200; // Error! Cannot reassign
list.add("item"); // OK! Content can be modified
```

### Final Methods
- Cannot be overridden by subclasses

```java
class Parent {
    final void display() {
        System.out.println("Cannot be overridden");
    }
}
```

### Final Classes
- Cannot be extended (no subclasses allowed)

```java
final class UtilityClass {
    // This class cannot be extended
}
```

---

## Type Casting

Type casting is converting one data type to another.

### Implicit Casting (Widening)
Automatic conversion from smaller to larger data type:
```java
int intValue = 100;
long longValue = intValue;     // int to long (automatic)
double doubleValue = longValue; // long to double (automatic)
```

### Explicit Casting (Narrowing)
Manual conversion from larger to smaller data type:
```java
double doubleValue = 100.99;
int intValue = (int) doubleValue;  // Result: 100 (decimal part lost)
long longValue = 100L;
int intFromLong = (int) longValue; // long to int
```

### Casting Hierarchy
```
byte → short → int → long → float → double
       char → int
```

### Examples:
```java
// Widening (Implicit)
byte b = 10;
int i = b;        // byte to int
double d = i;     // int to double

// Narrowing (Explicit)
double price = 19.99;
int dollars = (int) price;  // Result: 19

// Character casting
char letter = 'A';
int ascii = letter;         // Result: 65
char newChar = (char) 66;   // Result: 'B'
```

### Casting with Scanner Input
```java
Scanner input = new Scanner(System.in);

// Reading and casting
String stringNumber = input.nextLine();
int number = Integer.parseInt(stringNumber);  // String to int

double decimal = Double.parseDouble(stringNumber); // String to double
```

---

## String Built-in Functions

Java String class provides many useful methods for string manipulation:

### String Creation and Basic Properties
```java
String str = "Hello World";
String str2 = new String("Hello World");

// Basic properties
int length = str.length();              // Returns 11
boolean isEmpty = str.isEmpty();        // Returns false
boolean isBlank = str.isBlank();        // Returns false (Java 11+)
```

### Character Access and Search
```java
String text = "Java Programming";

// Character access
char firstChar = text.charAt(0);        // Returns 'J'
char lastChar = text.charAt(text.length() - 1); // Returns 'g'

// Search methods
int index = text.indexOf('a');          // Returns 1 (first occurrence)
int lastIndex = text.lastIndexOf('a');  // Returns 3 (last occurrence)
int wordIndex = text.indexOf("Program"); // Returns 5
boolean contains = text.contains("Java"); // Returns true
boolean startsWith = text.startsWith("Ja"); // Returns true
boolean endsWith = text.endsWith("ing");   // Returns true
```

### String Comparison
```java
String str1 = "Hello";
String str2 = "hello";
String str3 = "Hello";

// Comparison methods
boolean isEqual = str1.equals(str3);           // Returns true
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Returns true
int comparison = str1.compareTo(str3);         // Returns 0 (equal)
int comparisonIgnoreCase = str1.compareToIgnoreCase(str2); // Returns 0
```

### String Modification (Returns New String)
```java
String original = "  Java Programming  ";

// Case conversion
String upper = original.toUpperCase();     // "  JAVA PROGRAMMING  "
String lower = original.toLowerCase();     // "  java programming  "

// Trimming and replacing
String trimmed = original.trim();          // "Java Programming"
String replaced = original.replace("Java", "Python"); // "  Python Programming  "
String replacedAll = original.replaceAll("\\s+", "-"); // "--Java-Programming--"
String replacedFirst = original.replaceFirst("a", "X"); // "  JXva Programming  "

// Substring
String sub1 = original.substring(2);       // "Java Programming  "
String sub2 = original.substring(2, 6);   // "Java"
```

### String Splitting and Joining
```java
String sentence = "Java,Python,C++,JavaScript";

// Splitting
String[] languages = sentence.split(",");  // ["Java", "Python", "C++", "JavaScript"]
String[] words = "Hello World".split(" "); // ["Hello", "World"]

// Joining (Java 8+)
String joined = String.join(" | ", languages); // "Java | Python | C++ | JavaScript"
```

### String Conversion
```java
// Converting other types to String
int number = 123;
double decimal = 45.67;
boolean flag = true;

String numStr = String.valueOf(number);    // "123"
String decStr = String.valueOf(decimal);   // "45.67"
String boolStr = String.valueOf(flag);     // "true"

// Alternative conversion
String numStr2 = Integer.toString(number); // "123"
String numStr3 = "" + number;              // "123" (concatenation)
```

### String Validation
```java
String text = "Hello123";
String number = "12345";
String email = "user@example.com";

// Check content type
boolean hasDigits = text.matches(".*\\d.*");     // true (contains digits)
boolean isNumeric = number.matches("\\d+");      // true (only digits)
boolean isValidEmail = email.matches(".*@.*\\..*"); // Simple email check

// Character checking
boolean isLetter = Character.isLetter('A');       // true
boolean isDigit = Character.isDigit('5');         // true
boolean isWhitespace = Character.isWhitespace(' '); // true
```

### StringBuilder for Efficient String Building
When you need to build strings efficiently (especially in loops):

```java
StringBuilder sb = new StringBuilder();

// Building string efficiently
sb.append("Hello");
sb.append(" ");
sb.append("World");
sb.insert(5, " Beautiful"); // Insert at position 5
sb.delete(5, 15);           // Delete from position 5 to 15
sb.reverse();               // Reverse the string

String result = sb.toString(); // Convert to String
```

### String Formatting
```java
String name = "Ahmed";
int age = 25;
double salary = 5000.50;

// Using String.format()
String formatted1 = String.format("Name: %s, Age: %d", name, age);
String formatted2 = String.format("Salary: %.2f", salary); // "Salary: 5000.50"

// Using printf() directly
System.out.printf("Hello %s, you are %d years old%n", name, age);
```

### Common String Operations Example
```java
import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        
        // String operations
        System.out.println("Original: " + fullName);
        System.out.println("Length: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
        System.out.println("Trimmed: '" + fullName.trim() + "'");
        
        // Check if name contains specific text
        if (fullName.toLowerCase().contains("ahmed")) {
            System.out.println("Name contains 'Ahmed'");
        }
        
        // Split name
        String[] nameParts = fullName.trim().split(" ");
        System.out.println("First name: " + nameParts[0]);
        if (nameParts.length > 1) {
            System.out.println("Last name: " + nameParts[nameParts.length - 1]);
        }
        
        input.close();
    }
}
```

---

## Complete Example Program

```java
import java.util.Scanner;

public class JavaBasicsDemo {
    public static void main(String[] args) {
        // Final constant
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Arithmetic operations
        int doubled = number * 2;
        int squared = number * number;
        
        // Increment/Decrement
        int preInc = ++number;    // Pre-increment
        int postInc = number++;   // Post-increment
        
        // Compound assignment
        number += 10;
        
        // Type casting
        double decimal = (double) number;
        
        // Output
        System.out.println("Original number: " + (number - 11)); // Accounting for increments
        System.out.println("Doubled: " + doubled);
        System.out.println("Squared: " + squared);
        System.out.println("After operations: " + number);
        System.out.println("As decimal: " + decimal);
        System.out.println("PI constant: " + PI);
        
        input.close();
    }
}
```

---

## Key Points to Remember

1. **Always import Scanner** when taking user input
2. **Close Scanner** after use to prevent resource leaks
3. **Use appropriate data types** based on the range of values needed
4. **Understand the difference** between pre and post increment/decrement
5. **Be careful with type casting** to avoid data loss
6. **Use final keyword** for constants and when you want to prevent modification
7. **Integer division** truncates decimal parts (use double for precise division)

---

## Common Mistakes to Avoid

- Forgetting to import `java.util.Scanner`
- Not closing Scanner objects
- Mixing up pre and post increment in expressions
- Losing precision when casting from larger to smaller types
- Trying to modify final variables after initialization
- Using `=` instead of `==` for comparison