package chapter10;

public class Fruit {
    private int calories;

    public void makeJuice(){
        System.out.println("juice is made");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}