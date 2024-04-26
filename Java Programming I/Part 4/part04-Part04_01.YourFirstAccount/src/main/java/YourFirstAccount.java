public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account account = new Account("Hugo's account", 100);
        
        account.deposit(20.0);
        System.out.println(account);
    }
}
