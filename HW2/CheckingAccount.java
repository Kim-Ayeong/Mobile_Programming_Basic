
public class CheckingAccount extends Account {

    protected String cardNo;

    public CheckingAccount() {
    }

    public CheckingAccount(String cardNo, Account account) {
        super(account.name, account.account);
        this.balance = account.balance;
        this.cardNo = cardNo;
    }

    public boolean pay(String cardNo, int amount) {
        if (cardNo.equals(this.cardNo)) {
            if (amount < this.balance) {
                balance -= amount;
                return true;
            }
        }
        return false;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("CardNo : " + this.cardNo);
    }
}
