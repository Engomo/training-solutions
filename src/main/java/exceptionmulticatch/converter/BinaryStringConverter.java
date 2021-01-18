package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null) {
            throw new NullPointerException("binaryString is null");
        }
        boolean[] booleans = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("binaryString not valid");
            }
            booleans[i] = c =='1';
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null) {
            throw new NullPointerException("booleans null");
        }
        if (booleans.length == 0) {
            throw new IllegalArgumentException("booleans size 0");
        }
        StringBuilder sb = new StringBuilder(booleans.length);
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                sb.append('1');
            }else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
