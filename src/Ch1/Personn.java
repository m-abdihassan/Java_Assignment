package Ch1;

public class Personn {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    public Personn(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person: " + name;
    }
}
