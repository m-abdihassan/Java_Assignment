package AbstractandInterface;

public class Mystudent implements Jobs{
    String name;
   public Mystudent(String name){
        this.name=name;
    }
    @Override
    public void worker() {
        System.out.println("waan ku salaame "+name);
    }
}
