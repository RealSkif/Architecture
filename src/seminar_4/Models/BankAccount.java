package seminar_4.Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {


    private Long card;
    private int balance;
    private long oldCard;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getOldCard() {
        return oldCard;
    }

    public void setOldCard(long oldCard) {
        this.oldCard = oldCard;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
