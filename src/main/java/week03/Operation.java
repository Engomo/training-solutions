package week03;

import java.util.Scanner;

public class Operation {

    Scanner scanner = new Scanner(System.in);

    private int leftOperand;
    private int rightOperand;

    public Operation(String sum){

        int plusindex = sum.indexOf("+");
        leftOperand = Integer.parseInt(sum.substring(0, plusindex));
        rightOperand = Integer.parseInt(sum.substring(plusindex + 1));

    }


    public int getResult(){
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operation operation = new Operation(scanner.nextLine());
        System.out.println(operation.getResult());
    }
}
