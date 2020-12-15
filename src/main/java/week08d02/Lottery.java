package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> winners = new ArrayList<>();

        Random random = new Random();

        while (winners.size() < numbers) {
            int next = random.nextInt(interval) + 1;
            if (!winners.contains(next)) {
                winners.add(next);
            }

        }
        return winners;
    }

    public static void main(String[] args) {
        Lottery five = new Lottery();

        System.out.println(five.getNumbers(90,5).toString());
    }
}
