package parteII.Aula05.interfaces;

public class Dog implements Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " está comendo.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Au Au!");
    }
}

