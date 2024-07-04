package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        long factorial = 1; // Factorial of 0 is 1
        System.out.println(factorial); // Print the factorial of 0

        while (number < printToInclusive) {
            number++; // Increment the number for the next factorial calculation
            factorial *= number; // Calculate the factorial of the current number
            System.out.println(factorial); // Print the factorial of the current number
        }
    }
}
