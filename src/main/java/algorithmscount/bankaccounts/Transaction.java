package algorithmscount.bankaccounts;

public class Transaction {
    private String accountNumber;
    private TransactionType transactionType;
    int amount;

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isCredit(){
        return transactionType == transactionType.CREDIT;
    }
    public boolean isDebit(){
        return transactionType == transactionType.DEBIT;
    }
}
