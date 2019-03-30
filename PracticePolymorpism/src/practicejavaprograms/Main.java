package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


        Animal  animal1, animal2, animal3;// 3 animal objects

        animal1 = new Animal();
        animal1.makeSounds();

        animal2 = new Dog();
        animal2.makeSounds();

        animal3 = new Cat();
        animal3.makeSounds();

        //another way to write the code

//        Animal animal = new Animal();
//        animal.makeSounds();
//
//        Dog dog = new Dog();
//        dog.makeSounds();
//
//        //using the superclass to access different behaviors, creating new cat object and new dog object below
//        Animal animal1 = new Cat();
//        animal1.makeSounds();
//
//        Animal animal2 = new Dog();
//        animal2.makeSounds();

        //remember you can only use polymorphism by calling the superclass first
    }
}
