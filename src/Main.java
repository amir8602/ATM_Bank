import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Customer> customers= new LinkedList<Customer>();

        Customer customer=new Customer("a","b","22222","aa",12,"2030",200,200);
        customers.add(customer);
        Customer customer2=new Customer("a","b","22222","aa",12,"2030",200,200);
        customers.add(customer2);
        for (Customer customer1 : customers) {
            System.out.println(customer1.toString());
        }

    }
System.out.println("hhh");
}
