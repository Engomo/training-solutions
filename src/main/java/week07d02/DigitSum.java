package week07d02;

import com.sun.jdi.Value;

import java.util.Arrays;

public class DigitSum {

    public int sumOfDigits2(int... numbers) {
        int sum = 0;
        for (int i = 0; i < Arrays.stream(numbers).toArray().length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        String numbers = Integer.toString(number);
        for (int i = 0; i < numbers.length(); i++) {
            sum += numbers.charAt(i) - '0';
        }
        return sum;
    }
}
