package AbstractandInterface;

public class Student extends Person {
    public Student(String name,Long Phone,Integer age){
        super(name,Phone,age);

    }
    @Override
    public void display()
    {

        System.out.println(name);
        System.out.println(phone);
        System.out.println(age);

    }

}
