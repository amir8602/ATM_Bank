public class Person {
    private String name;
    private String family;
    private String PhoneNumber;
    private String address;
    private int age;
    private String N_ID;

    //--------------------------------------------------------------
    public Person(String name, String family, String phoneNumber, String address, int age, String n_ID) {
        this.name = name;
        this.family = family;
        PhoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        N_ID = n_ID;


    }
    public Person(){

    }
    //---------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getN_ID() {
        return N_ID;
    }

    public void setN_ID(String n_ID) {
        N_ID = n_ID;
    }
//----------------------------------------------------------------------------
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", N_ID='" + N_ID + '\'' +
                '}';
    }
}
