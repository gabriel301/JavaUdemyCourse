/**
 * Created by g.ferreira.oliveira on 14/11/2016.
 */
public class Main {
    public static void main (String[] args){
        //Account account = new Account(12345,1000d,"Mike","Mike@mike.com","111-111-111");
          Account account = new Account();
//        account.setBalance(1000d);
//        account.setCustomerName("Mike");
//        account.setCustomerPhone("111-111-111");
//        account.setNumberAccount(12345);
//        account.setCustomerEmail("Mike@mike.com");
        System.out.println("Hello " + account.getCustomerName() +"! Your current balance is $"+account.getBalance());
        account.deposit(500d);
        System.out.println("Hello " + account.getCustomerName() +"! After deposit, Your current balance is $"+account.deposit(500d));
        account.withdraw(1500d);
        System.out.println("Hello " + account.getCustomerName() +"! After withdraw, Your current balance is $"+account.getBalance());
        account.withdraw(1500d);
        System.out.println("Hello " + account.getCustomerName() +"! After withdraw, Your current balance is $"+account.getBalance());

        VipCustomer customer = new VipCustomer();
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Limit: "+ customer.getCreditLimit());
    }
}
