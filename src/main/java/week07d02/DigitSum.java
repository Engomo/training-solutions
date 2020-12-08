package week07d02;

import java.util.Arrays;

public class DigitSum {

    public int sumOfDigits(int... numbers) {
        int sum = 0;
        for (int i = 0; i < Arrays.stream(numbers).toArray().length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
