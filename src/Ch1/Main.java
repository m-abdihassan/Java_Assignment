package Ch1;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account myacc=new Account("232",1000.0,"Ali");
        System.out.println(myacc.checkBalance());
        myacc.deposit(500);
        myacc.withdraw(200);
        System.out.println("the account balance: "+myacc.checkBalance());

        SavingAccount sv=new SavingAccount("4444",2000,"Ali Abdi");
        sv.deposit(2000);
        sv.withdraw(1000);
        System.out.println("Saving Account balace: "+sv.checkBalance());


///.........Assinmnet two......
//        GeometricObject[] objects = new GeometricObject[5];
//        objects[0] = new Square(5);
//        objects[1] = new Square(3);
//        objects[2] = new GeometricObject();
//        objects[3] = new Square(7);
//        objects[4] = new GeometricObject("red");
//
//        for (GeometricObject obj : objects) {
//            System.out.println("Area: " + obj.getArea());
//            if (obj instanceof Colorable) {
//                ((Colorable) obj).howToColor();



///.........Assinmnet three......


//                Personn person = new Personn("mohamed abdi", "123 hodan", "553871234", "moha@gmail.com");
//                Studentt student = new Studentt("asad ali", "65 kpp St", "5556678", "asad@gmail.com", Studentt.JUNIOR);
//                Employee employee = new Employee("jmac asad", "789 deyniile St", "555101", "jamac@gmail.com", "Office 100", 50000, new Date());
//                Faculty faculty = new Faculty("computer", "101 banadir St", "55512", "kkk@example.com", "Office 200", 75000, new Date(),"9am-5pm", "Professor");
//                Staff staff = new Staff("saaacid sad", "222 makaSt", "55514", "saacid@gmail.com", "Office 883", 400, new Date(), "Manager");
//
//                System.out.println(person);
//                System.out.println(student);
//                System.out.println(employee);
//                System.out.println(faculty);
//                System.out.println(staff);
//            }

//













//Student s1=new Student("Hassan",20,6555l,"C3223");
//s1.display();
//        new Decition1();

    }

    }
//}}