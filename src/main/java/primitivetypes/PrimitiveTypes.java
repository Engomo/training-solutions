package primitivetypes;

public class PrimitiveTypes {

    public StringBuilder toBinaryString(int n) {
        int binaryNumber;
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            binaryNumber = n % 2;
            n = n / 2;
            result.append(binaryNumber);
        }
//        while (result.length() == 32) {
//            result.append(0);
//        }
        result.reverse();
        return result;
    }

    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        System.out.println(primitiveTypes.toBinaryString(666));
        System.out.println(Integer.toBinaryString(666));
        System.out.println(primitiveTypes.toBinaryString(255).equals(Integer.toBinaryString(255)));
    }
}
