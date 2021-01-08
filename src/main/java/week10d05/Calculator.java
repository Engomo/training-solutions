package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {


    public int findMindSum(int[] arr) {
       if (arr.length < 4) {
           throw new IllegalArgumentException("Small Array!");
       }
       Arrays.sort(arr);
       int sum = 0;

       for (int i = 0; i < 4; i++) {
           sum += arr[i];
       }
       return sum;
    }
}
