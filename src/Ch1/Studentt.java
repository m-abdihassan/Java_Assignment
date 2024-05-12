package Ch1;

public class Studentt extends Personn {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String classStatus;
    public Studentt(String name, String address, String phoneNumber, String email,String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
