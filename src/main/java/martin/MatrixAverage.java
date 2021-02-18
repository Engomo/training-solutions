package martin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixAverage implements  TestData{

    public Double matrixMaxAverageByRow(String[][] matrix) {
        List<Double> row = new ArrayList<>();
        List<Double> averageList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                row.add(Double.parseDouble(matrix[i][j]));
            }
            averageList.add(rowAverage(row));
            row.clear();
        }
        return Collections.max(averageList);
    }


    private Double rowAverage(List<Double> row) {
        Double sum = 0.0;
        for (Double item : row) {
            sum += item;
        }
        return sum / row.size();
    }

    public static void main(String[] args) {
        MatrixAverage matrixAverage = new MatrixAverage();
        System.out.println(matrixAverage.matrixMaxAverageByRow(MATRIX));
    }
}
