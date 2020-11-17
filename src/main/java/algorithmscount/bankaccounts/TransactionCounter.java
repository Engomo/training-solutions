package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int minAmount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.amount < minAmount) {
                count ++;
            }
        }
        return count;
    }
}
