package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        while (number <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(number * multiplyByAndToInclusive);
            number++; // Increment the number for the next iteration
        }
        if (multiplyByAndToInclusive < 0) {
            number = 0;
            while (number >= multiplyByAndToInclusive) {
                System.out.println(number * multiplyByAndToInclusive);
                number--; // Decrement the number for the next iteration
            }
        }
    }
}
