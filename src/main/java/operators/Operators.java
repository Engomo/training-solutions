package operators;

public class Operators {

    public boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public int multiplyByPowerOfTwo(int number, int power){
        return number << power;
    }
}
