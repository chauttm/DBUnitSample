/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 6/14/13
 * Time: 1:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class SavingsAccount {
    private String accountNumber;
    private String description;
    private double balance;

    public SavingsAccount(String accountNumber, String description, double balance) {
        this.accountNumber = accountNumber;
        this.description = description;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
