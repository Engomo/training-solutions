package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"Hétfő", "kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "vasárnap"};
        System.out.println(week[1]);
        System.out.println(week.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        for(int i = 1; i < numbers.length; i++){
            numbers[i]= numbers[i-1] * 2;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
boolean six[] = new boolean[6];
        for (int i = 1; i < six.length; i++){
            six[i] = !six[i - 1];
        }
        for (int i = 0; i < six.length; i++){
            System.out.println(six[i] + " ");
        }

    }
}
