package Ch1;
import java.util.Date;
public class Employee extends Personn{
    private String office;
    private double salary;
    private Date dateHired;
    public Employee(String name, String address, String phoneNumber, String email,String office,double salary,Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

}
