# Java `printf` Explanation

The `printf` method in Java allows for formatted output using placeholders, flags, and special characters. This document explains the various components used in the `Main.java` example.

## 1. Placeholders (Format Specifiers)

Placeholders begin with a `%` and specify the type of data to be formatted.

-   `%s`: Formats **strings**. (e.g., `String name = "mohamed";`)
-   `%c`: Formats a single **character**. (e.g., `char firstChar = 'm';`)
-   `%d`: Formats **decimal integers** (byte, short, int, long). (e.g., `int age = 27;`)
-   `%f`: Formats **floating-point numbers** (float, double). (e.g., `double height = 1.8;`)
-   `%b`: Formats **boolean** values (`true` or `false`). (e.g., `boolean isEmployed = true;`)

## 2. Precision

Precision is used with floating-point numbers (`%f`) to control the number of digits displayed after the decimal point. It is specified by adding a `.` followed by the number of digits.

-   `%.1f`: Formats the number to **one** decimal place.
    -   *Example:* `printf("%.1f", 100.2222);` outputs `100.2`
-   `%.2f`: Formats the number to **two** decimal places.
    -   *Example:* `printf("%.2f", -102020.021454);` outputs `-102020.02`

## 3. Special Characters and Flags

Flags are special characters that modify the output format.

-   `\n`: A special character representing a **newline**. It moves the output cursor to the next line.
-   `+` (Flag): When used in a format specifier (e.g., `%+d`), it forces the output to include a sign for both positive (`+`) and negative (`-`) numbers.
-   `( ` (Flag): Encloses negative numbers in parentheses.
    -   *Example:* `printf("%(f", -123.45);` outputs `(123.450000)`
-   `,` (Flag): Adds locale-specific grouping separators (e.g., a comma for thousands in the US).
    -   *Example:* `printf("%,.2f", -102020.021454);` outputs `-102,020.02`

### Combining Flags

Flags can be combined. For instance, `%(,.2f` combines three flags:
1.  `(`: Enclose negative numbers in parentheses.
2.  `,`: Add thousand separators.
3.  `.2`: Limit to two decimal places.

*Example:* `printf("%(,.2f", -102020.021454);` would output `(102,020.02)`.

## Mathematical Operations

The `printf` method itself **does not perform mathematical calculations**. It is used to format the *results* of calculations that have already been performed in your code.

*Example:*
```java
double result = 100.0 / 3.0; // Mathematical operation
System.out.printf("Result: %.2f\n", result); // Formatting the output
// Output: Result: 33.33
```
