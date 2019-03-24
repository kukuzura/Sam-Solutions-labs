package bank;

import java.math.BigDecimal;

public class Account {
    int accountId;
    double sum;

    Account(int accountId, double sum) {
        this.accountId = accountId;
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    /**
     * Снимает деньги со счета
     * @param moneyAmount сумма денег, которую нужно снять
     * @return true, если опреция успешна
     */
    public boolean WithdrawMoney(double moneyAmount) {
        if (moneyAmount > sum) {
            return false;
        } else sum -= moneyAmount;
        return true;
    }
}
