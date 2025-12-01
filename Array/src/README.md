# Arrays in Java

An array is a fundamental data structure in Java that stores a fixed-size, sequential collection of elements of the same data type. This document explains how to declare, initialize, and work with arrays, with examples from the `Array.java` file.

## 1. What is an Array?

-   **Fixed-Size:** Once an array is created, its size cannot be changed.
-   **Homogeneous:** All elements in the array must be of the same data type (e.g., `int`, `String`, `Object`).
-   **Indexed:** Elements are stored in a contiguous block of memory and are accessed using a zero-based index (the first element is at index 0).

## 2. Declaring and Initializing Arrays

There are two primary ways to create an array.

### a. Using the `new` Keyword

You first declare the array variable and then initialize it by specifying its size. If you don't provide initial values, Java assigns default values (e.g., `0` for `int`, `null` for `String`).

```java
// 1. Declaration
int[] numbers;

// 2. Initialization (allocating memory for 5 integers)
numbers = new int[5];
```

### b. Using Array Literals

This is a shorthand method to declare and initialize an array at the same time. The size of the array is automatically determined by the number of elements you provide.

```java
// Declare and initialize in one line
String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
```

## 3. Accessing and Modifying Elements

You can access or change the value of an array element using its index inside square brackets `[]`.

```java
// Assign a value to the first element (index 0)
numbers[0] = 10;

// Retrieve the value of the third element (index 2)
System.out.println(numbers[2]); // Assuming it has been assigned a value
```

**Important:** Accessing an index outside the valid range (e.g., a negative index or an index greater than or equal to the array's size) will result in an `ArrayIndexOutOfBoundsException`.

## 4. Iterating Over Arrays

There are two common ways to loop through all the elements of an array.

### a. Standard `for` Loop

This method gives you access to the index, which is useful if you need to know the position of the element. The `length` property gives the total number of elements in the array.

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}
```

### b. Enhanced `for-each` Loop

This loop provides a simpler, more readable syntax when you only need the value of each element and not its index.

```java
for (String fruit : fruits) {
    System.out.println("Fruit: " + fruit);
}
```

## 5. Multidimensional Arrays

Java supports multidimensional arrays, which are essentially "arrays of arrays." A 2D array is the most common and can be visualized as a grid or matrix with rows and columns.

```java
// A 2D array (matrix) with 3 rows and 3 columns
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access the element at row 1, column 2 (value is 6)
int element = matrix[1][2];
```

## 6. The `java.util.Arrays` Utility Class

Java provides a helper class named `java.util.Arrays` with many static methods for common array manipulations.

-   `Arrays.toString(array)`: Returns a string representation of a 1D array, which is very useful for printing.
-   `Arrays.sort(array)`: Sorts the array in ascending order.
-   `Arrays.fill(array, value)`: Fills the entire array with a specified value.
-   `Arrays.equals(array1, array2)`: Checks if two arrays are equal (same elements in the same order).

```java
// Example of printing an array
System.out.println(Arrays.toString(numbers));

// Example of sorting an array
String[] names = {"Charlie", "Alice", "Bob"};
Arrays.sort(names); // names is now {"Alice", "Bob", "Charlie"}
```
