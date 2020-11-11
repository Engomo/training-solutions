package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.isEven(112));
        System.out.println(operators.isEven(111));

        System.out.println(16 >> 1);
        System.out.println(16 << 1);
        System.out.println(13 >> 1);
        System.out.println(13 << 1);

        System.out.println(operators.multiplyByPowerOfTwo(2, 8));
    }
}
