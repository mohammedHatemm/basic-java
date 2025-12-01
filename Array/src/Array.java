import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // 1. Declaration and Initialization
        // Declare an array of integers
        int[] numbers;

        // Initialize the array to hold 5 integers.
        // The array is created with default values (0 for int).
        numbers = new int[5];

        // 2. Accessing and Modifying Elements
        // Array elements are accessed via their index (0-based).
        numbers[0] = 10; // Assign 10 to the first element
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60; // This would cause an ArrayIndexOutOfBoundsException

        System.out.println("The element at index 2 is: " + numbers[2]); // Outputs 30

        // 3. Array Literals
        // You can declare and initialize an array in one line.
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("The second fruit is: " + fruits[1]); // Outputs "Banana"

        // 4. Iterating Over an Array
        // Using a standard for loop (useful when you need the index)
        System.out.println("\nIterating with a standard for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using an enhanced for-each loop (simpler syntax)
        System.out.println("\nIterating with a for-each loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 5. The `java.util.Arrays` Utility Class
        // A helpful class for common array operations.
        // To print an array in a readable format:
        System.out.println("\nUsing Arrays.toString(): " + Arrays.toString(numbers));

        // To sort an array:
        String[] names = {"Charlie", "Alice", "Bob"};
        Arrays.sort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));

        // 6. Multidimensional Arrays (2D Array Example)
        // A 2D array is an array of arrays.
        // Here we create a 3x3 matrix.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing an element in a 2D array
        System.out.println("\nElement at row 1, column 2 of the matrix is: " + matrix[1][2]); // Outputs 6

        // Iterating over a 2D array
        System.out.println("Iterating over the 2D matrix:");
        for (int i = 0; i < matrix.length; i++) { // Iterate over rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate over columns in the current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}