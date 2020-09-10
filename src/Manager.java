public class Manager extends Person {
    private String username;
    private String password;

   public Manager(){
       super("manager","manager","12345678","abcdef",30,"123456789");
       username="manager";
       password="123456";
   }

//    public Manager(String name, String family, String phoneNumber, String address, int age, String n_ID, String username, String password) {
//        super(name, family, phoneNumber, address, age, n_ID);
//        this.username = username;
//        this.password = password;
//    }


    @Override
    public String toString() {
        return
                "Manager{" +
                super.toString() +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
