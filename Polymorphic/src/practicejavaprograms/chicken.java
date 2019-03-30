package practicejavaprograms;

abstract public class chicken {//abstract means that an object cannot be created from this class, classes which can be made into objects are called concrete
    //abstract classes are useless unless they are inherit or polymorphism is used with them.
    public void sup(){
        System.out.println("This is chicken soup");
    }

    public abstract void eat();//this is an abstract method -

    //you can only use abstract methods with abstract classes.
    //abstract classes must be overidden
}
