package Seminar4;

import java.text.DecimalFormat;

public class Account {
    private long userAccountId;
    private DecimalFormat balance;

    public Account(long userAccountId, DecimalFormat balance) {
        this.userAccountId = userAccountId;
        this.balance = balance;
    }

    public Account() {
    }

    public long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public DecimalFormat getBalance() {
        return balance;
    }

    public void setBalance(DecimalFormat balance) {
        this.balance = balance;
    }
}
