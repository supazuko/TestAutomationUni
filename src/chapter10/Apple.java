package chapter10;

public class Apple extends Fruit{

    public Apple(){
        setCalories(11);
    }

    public void removeSeeds(){
        System.out.println("remove seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("make apple juice");
    }
}

