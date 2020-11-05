package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public String numbersOfDaysAsString(){
        int[] numbersOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numbersOfDays);
    }
public List<String> daysOfWeek(){
        return Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
}

public String multiplicationTableAsString(int size){
        int[][] table = new int[size][size];
        for( int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                table[i][j] = (i + 1) * ( j + 1);
            }
        }
        return Arrays.deepToString(table);
}

public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
}

public boolean wonLottery(int[] ownNumbers, int[] winner){
        int[] copyOfOwnNumbers = Arrays.copyOf(ownNumbers, ownNumbers.length);
        int[] copyOfWinner = Arrays.copyOf(winner, winner.length);
        Arrays.sort(copyOfOwnNumbers);
        Arrays.sort(copyOfWinner);
        return Arrays.equals(copyOfOwnNumbers, copyOfWinner);
}

    public static void main(String[] args) {
ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numbersOfDaysAsString());

        System.out.println(arraysMain.daysOfWeek());

        System.out.println(arraysMain.multiplicationTableAsString(10));

        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3}, new double[]{2, 2, 3}));

        int[] winner = new int[]{1, 2, 3, 4, 5};
        int[] ownNumber = new int[]{5, 4, 3, 2, 1};

        System.out.println(arraysMain.wonLottery(winner, ownNumber));
        System.out.println(Arrays.toString(ownNumber));

        System.out.println(arraysMain.wonLottery(new int[]{1, 2, 3}, new int[]{1, 2, 2}));
    }
}
