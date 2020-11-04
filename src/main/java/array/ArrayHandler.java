package array;

public class ArrayHandler {
    public boolean contains(int[] source, int itemToFind) {
        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] finalInt = new int[]{2, 4, 6, 8, 10};

        System.out.println("contains");
        System.out.println(arrayHandler.contains(finalInt, 8));
        System.out.println(arrayHandler.contains(finalInt, 5));

        System.out.println("Find");
        System.out.println(arrayHandler.find(finalInt, 8));
        System.out.println(arrayHandler.find(finalInt, 5));
    }
}
