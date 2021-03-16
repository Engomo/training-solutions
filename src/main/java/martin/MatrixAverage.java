package martin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MatrixAverage implements TestData {

    @Override
    public Double matrixMaxAverageByRow(String[][] matrix) {
        List<Double> row = new ArrayList<>();
        List<Double> averageList = new ArrayList<>();

        for (String[] strings : matrix) {

            for (String string : strings) {
                row.add(Double.parseDouble(string));
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
