package ParteII.Aula05.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Léia");
        Animal cat = new Cat("Mina");
        Animal jacare = new Jacare("Jack");


        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        jacare.eat();
        jacare.makeSound();
    }
}
