package week11d01;

public class DivisonFinder2 {
    public int findDivisors(int n) {
        int result = 0;
        String number = Integer.toString(n);
//        for (int i = 0; i < number.length(); i++) {
//            int digit = Integer.parseInt(Character.toString(number.charAt(i)));
//            if (n % digit == 0) {
//                result++;
//            }
//        }
        for (char c :number.toCharArray()) {
            int digit = Integer.parseInt(Character.toString(c));
            if (n % digit == 0) {
                result++;
            }
        }
        return result;
    }
}
