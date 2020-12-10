package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Pozitív számot várunk");
        }

        if (x == 1) {
            return false;
        }

        if (x == 2) {
            return true;
        }
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
