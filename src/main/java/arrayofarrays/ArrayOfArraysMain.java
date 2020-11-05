package arrayofarrays;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size){
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++){
for(int j = 0; j < size; j++){
    table[i][j] = (i + 1) * (j + 1);
        }
    }
        return table;
}

public void printArrayOfArrays(int [][] a){
        for (int i[] : a){
            for (int j : i){
                if (j < 10){
                    System.out.println("  ");
                }
                else if (j < 100){
                    System.out.println(" ");
                }
                System.out.println(j);
                System.out.println(" ");
            }
            System.out.println();
        }
}

public int[][] triangularMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = new int[i + 1];
            for (int j =0; j < i + 1; j++){
                matrix[i][j] = i;
            }
        }
        return matrix;
}

public int [][] getValues() {
    int[][] values = new int[12][];
    int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < numberOfDays.length; i++) {
        values[i] = new int[numberOfDays[i]];
    }
    return values;
}

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        System.out.println("Multiplicationtable: ");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(10));

        System.out.println("Triangular matrix: ");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(5));

        System.out.println("Values per days: ");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
    }
}

