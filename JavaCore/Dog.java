
class Animal {

    public void makeSound() {
        System.out.println("Makes general animal noises.");
    }
}
public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public static void main(String[] args) {

        Dog d = new Dog();

        d.makeSound();
    }
}
