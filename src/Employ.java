public class Employ extends Person {
    private String username;
    private String password;


//--------------------------------------------------------------------

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//----------------------------------------------------------------------


    public Employ(String name, String family, String phoneNumber, String address, int age, String n_ID, String username, String password) {
        super(name, family, phoneNumber, address, age, n_ID);
        this.username = username;
        this.password = password;
    }

//----------------------------------------------------------------------


    @Override
    public String toString() {
        return
                "Employ{" +
                super.toString() +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
