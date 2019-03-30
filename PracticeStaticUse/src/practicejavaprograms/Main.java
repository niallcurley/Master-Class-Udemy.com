package practicejavaprograms;

public class Main {

    int i;
    static String name = "EEC";


    static void update(){
        name = "EEC Classes";

    }

    void display(){
        System.out.println(name);
    }

    public static void main(String[] args) {



        update();
        Main main = new Main();
        main.display();

//        TryStatic t1 = new TryStatic();
//        TryStatic t2 = new TryStatic();
//        TryStatic t3 = new TryStatic();
//
//        TryStatic.update();
//        t1.display();
////
////
////       // TryStatic.noOfHouses;
////
////        //whenever you access a static method you are accessing the class not the instance of the class
//////        TryStatic.doSomething();
//////        TryStatic.num = 122;
//////        System.out.println(TryStatic.num);
////
////
    }
}
