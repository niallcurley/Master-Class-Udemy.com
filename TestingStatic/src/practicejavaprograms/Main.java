package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

//        Test x = new Test();
//        Test y = new Test();
//        x.instanceVariable = 10;
//        y.instanceVariable = 20;
//        System.out.println(x.instanceVariable);
//        System.out.println(y.instanceVariable);

//        Test x = new Test();
//        Test y = new Test();
//        x.staticVariable = 10;
//        y.staticVariable = 20;
//        System.out.println(x.staticVariable); //this prints out the most recent '20' the value of y.staticVariable even though the output was  x.staticVariable

        Test x = new Test();
        Test y = new Test();
        Test.staticVariable = 10;
        Test.staticVariable = 20;
        Test.staticVariable = 50;
        System.out.println(Test.staticVariable);//outputs only one, the most recent value, in this case '50'.



    }
}
