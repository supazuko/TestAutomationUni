package chapter10;

public class Banana extends Fruit{

    public Banana(){
        setCalories(20);
    }

    public void peel(){
        System.out.println("peel banana");
    }

    @Override
    public void makeJuice() {
        System.out.println("make banana juice");
    }
}
