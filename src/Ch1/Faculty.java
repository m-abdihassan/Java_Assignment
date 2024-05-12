package Ch1;

import java.util.Date;

public class Faculty extends  Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired,String officeHours,String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
    }


    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }

}
