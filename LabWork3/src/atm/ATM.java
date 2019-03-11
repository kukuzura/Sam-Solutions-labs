package atm;

public class ATM {
    private int twentiesAmount;
    private int fiftiesAmount;
    private int hundredsAmount;

    public ATM(int twentiesAmount, int fiftiesAmount, int hundredsAmount) {
        this.twentiesAmount = twentiesAmount;
        this.fiftiesAmount = fiftiesAmount;
        this.hundredsAmount = hundredsAmount;
    }

    public void addMoney(int extraTwenties, int extraFifties, int extraHundreds) {
        twentiesAmount += extraTwenties;
        fiftiesAmount += extraFifties;
        hundredsAmount += extraHundreds;
    }

    public boolean getMoney(int moneyAmount) {
        int twenties = 0, fifties = 0, hundreds = 0;

        if (moneyAmount / 100.0 > 1) {
            hundreds = (int) (moneyAmount / 100.0);
        }
        moneyAmount -= hundreds * 100;

        if (moneyAmount / 50.0 > 1) {
            fifties = (int) (moneyAmount / 50.0);
        }
        moneyAmount -= fifties * 50;

        if (moneyAmount / 20.0 > 1) {
            twenties = (int) (moneyAmount / 20.0);
        }
        moneyAmount -= twenties * 20;

        if (moneyAmount == 0) {
            System.out.println("100:" + hundreds + " 50:" + fifties + " 20:" + twenties);
            return true;
        } else return false;
    }

}
