package Ch1;

public class Person {
    private String name;
    private Integer age;
    private Long phone;



    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public Person(String name,Integer age,Long phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public Person(){};
    public void  display(){
        System.out.println("name is :"+this.getName());
        System.out.println("age: "+this.getAge());
        System.out.println("phone is :"+this.getPhone());
    }
}
