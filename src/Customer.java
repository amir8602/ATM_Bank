import java.util.LinkedList;
public class Customer extends Person{
    private int AccountNumber;
    private double balance;
    private int NumberOfTransaction=0;

    LinkedList <Transaction> transactions = new LinkedList<Transaction>();


    public Customer(){}
//-----------------------------------------------------------------


    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


//-------------------------------------------------------------------


    public Customer(String name, String family, String phoneNumber, String address, int age, String n_ID, int accountNumber, double balance) {
        super(name, family, phoneNumber, address, age, n_ID);
        AccountNumber = accountNumber;
        this.balance = balance;
    }

//--------------------------------------------------------------------


    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "AccountNumber=" + AccountNumber +
                ", balance=" + balance +
                '}';
    }
}
