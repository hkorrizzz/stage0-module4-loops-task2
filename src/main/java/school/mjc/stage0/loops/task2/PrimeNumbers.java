package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2; // Start from the first prime number
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++; // Increment the number for the next iteration
        }
    }
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
