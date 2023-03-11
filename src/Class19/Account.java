package Class19;

public class Account {
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("deposit");
    }
}
class checking extends Account{
    double interest;

    void transfer(){
        System.out.println(" transfer method from checking class");
    }

}
