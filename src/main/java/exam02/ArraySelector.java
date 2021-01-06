package exam02;

public class ArraySelector {

public StringBuilder selectEvens(int[] numbers) {
    StringBuilder evens = new StringBuilder();
    evens.append("[");
    for (int i = 0; i < numbers.length; i += 2) {
        evens.append(Integer.toString(numbers[i]));
        evens.append(", ");
    }
    evens.append("]");

    return evens;
}
}
