public class Transaction {

    private static int cont=0;
    private int ID;
    private int origin;
    private int target;
    private double amount;

    public Transaction(int ID, int origin, int target, double amount) {
        this.ID = cont;
        this.origin = origin;
        this.target = target;
        this.amount = amount;
        cont++;
    }
}
