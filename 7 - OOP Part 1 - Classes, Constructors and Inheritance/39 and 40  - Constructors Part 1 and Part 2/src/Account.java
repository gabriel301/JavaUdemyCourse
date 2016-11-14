/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
public class Account {
    private long numberAccount;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //Code->Generate->Constructors
    public Account(){
        //Call the other constructor. In this case, this line must be the first line of the calling constructor
        this(12345,1000d,"Mike","Mike@mike.com","111-111-111");
        System.out.println("Empty Constructor called");

    }

    public Account(long numberAccount,double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Constructor with parameters called");
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
    //Code->Generate->getters and setters (IntelliJ IDEA)
    public double getBalance() {
        return balance;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public double deposit (double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if(amount <= 0)
        {
            System.out.println("Invalid Amount!");
            return this.balance;
        }
        if (this.balance < amount)
        {
            System.out.println("Insufficient funds!");
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }
}
