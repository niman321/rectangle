package Class19;

public class AccountTester {
    public static void main(String[] args) {
        Account account=new Account();
        account.money=100000;
        account.accountNumber=165165416;
        account.deposit();

        System.out.println(account.accountNumber);
        System.out.println(account.money);


      checking check = new checking();
      check.accountNumber=1254;
      check.money=5000000;
      check.interest=243;
      check.deposit();
      check.transfer();

    }
}
