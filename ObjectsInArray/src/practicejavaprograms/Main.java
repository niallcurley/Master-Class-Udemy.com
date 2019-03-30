package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


//        DogList dl = new DogList();
//        Dog dog = new Dog();
//        Dog dog1 = new Dog();
//        dl.add(dog);
//        dl.add(dog);
//        dl.add(dog);
//        dl.add(dog);
//        dl.add(dog);
//        dl.add(dog);
//        dl.add(dog);
//
//        dl.add(dog);//it only outputs five elements


//        AnimalList a = new AnimalList();
//        Dog l = new Dog();
//        Fish f = new Fish();
//
//        a.add(l);
//        a.add(f);
//        a.add(f);
//        a.add(f);
//        a.add(f);

//        Animal a = new Animal();
//        a.noise();//only prints noise method in animal.

        Animal[] theList = new Animal[2];//an empty array with nothing in it
        Dog d = new Dog();
        Fish f = new Fish();

        theList[0]=d;//assigning a value to each element
        theList[1]=f;

        for (Animal x: theList){//enhanced loop - Animal x is connecting with each element in the array list allow you access to their methods
            //theList inside the brackets means it will loop through all the elements
            //counting variable x

            x.noise();

        }



    }
}
