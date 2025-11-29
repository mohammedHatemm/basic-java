public class Main {

    // --- 1. Method Definition and Parameters ---
    // A simple method that takes two integers and returns their sum.
    public static int add(int a, int b) {
        return a + b;
    }

    // --- 2. Method Overloading ---
    // Overloaded 'add' method that takes two doubles.
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded 'add' method that takes three integers.
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // --- 5. Recursion ---
    // A recursive method to calculate the factorial of a number.
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive step: n * factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Method Parameters ---");
        int sum1 = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum1);
        System.out.println();

        System.out.println("--- 2. Method Overloading ---");
        double sum2 = add(3.5, 4.5);
        int sum3 = add(5, 10, 15);
        System.out.println("Overloaded double add(3.5, 4.5): " + sum2);
        System.out.println("Overloaded int add(5, 10, 15): " + sum3);
        System.out.println();

        System.out.println("--- 3. Method Overriding ---");
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Dog object in an Animal reference
        myAnimal.makeSound(); // Calls Animal's method
        myDog.makeSound();    // Calls Dog's overridden method
        System.out.println();

        System.out.println("--- 4. Variable Scope ---");
        ScopeExample scopeExample = new ScopeExample();
        scopeExample.myMethod(10);
        System.out.println();

        System.out.println("--- 5. Recursion ---");
        int number = 5;
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        System.out.println();
    }
}

// --- Helper classes for examples ---

// For Method Overriding
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

// For Variable Scope
class ScopeExample {
    // Instance variable (scope is the entire class)
    private String instanceVar = "I am an instance variable";

    public void myMethod(int methodParam) { // methodParam is a local variable
        // Local variable (scope is only within this method)
        String localVar = "I am a local variable";

        System.out.println("Inside myMethod:");
        System.out.println(" - Accessing instance variable: " + instanceVar);
        System.out.println(" - Accessing local parameter: " + methodParam);
        System.out.println(" - Accessing local variable: " + localVar);
    }

    public void anotherMethod() {
        // System.out.println(localVar); // This would cause a compile error
    }
}