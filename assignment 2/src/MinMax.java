/**
 * Lorenzo 6280924
 */

public class MinMax {
    public static double minMaxAverage(int[] numbers) {
        int myMin;
        int myMax;
        int i;

        // if there are even number of elements, find the biggest/smallest of the first pair
        if (numbers.length % 2 == 0) {
            if (numbers[0] > numbers[1]) {
                myMin = numbers[1];
                myMax = numbers[0];
            } else {
                myMin = numbers[0];
                myMax = numbers[1];
            }
            // the loop will start from the 3rd element since the first 2 are already compared
            i = 2;
            // if there are odd number of elements, min and max will be the first element
        } else {
            myMin = numbers[0];
            myMax = numbers[0];
            i = 1;
        }

        // find both min and max simultaneously. this reduces the amount of loops needed.
        // search in pairs
        for (i = i; i < numbers.length - 1; i += 2) {
            // if the current number is larger than the next, check current with max and check next with min.
            if (numbers[i] > numbers[i + 1]) {
                if (numbers[i] > myMax) {
                    myMax = numbers[i];
                }
                if (numbers[i + 1] < myMin) {
                    myMin = numbers[i + 1];
                }
                // otherwise, check next with max and current with min.
            } else {
                if (numbers[i + 1] > myMax) {
                    myMax = numbers[i + 1];
                }
                if (numbers[i] < myMin) {
                    myMin = numbers[i];
                }
            }
        }

        return (myMin + myMax) / 2.0;
    }
}
