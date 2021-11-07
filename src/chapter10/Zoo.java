package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog bingo = new Dog();
        bingo.makeSound();
        bingo.fetch();
        feed(bingo);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }

        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
