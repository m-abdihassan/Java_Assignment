package AbstractandInterface;

public abstract class Person {
    public String name;
   public long phone;
   public Integer age;
    public abstract void display();
     public Person(){}
    public Person(String name, long phone, int age) {
        this.name=name;
        this.phone=phone;
        this.age=age;
    }


}
