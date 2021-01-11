package week11d01;

public class DivisorFinder {

    public int findDivisors(int n) {
        int result = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
          if(n % Integer.parseInt(String.valueOf(number.charAt(i))) == 0) {
              result++;
          }
        }
        return result;
    }
}
