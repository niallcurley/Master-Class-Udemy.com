package practicejavaprograms;

public class Main {

    static class Test{
        int i;
    }


    static void doSomething(int i){
        i = i + 5;
    }

     static void doSomething (Test test){
        test.i = test.i + 5;
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.i = 10;
        doSomething(test);//the reference to the object is passed and changes 15.
        System.out.println(test.i);

        int i = 10;
        doSomething(i);//when i is passed into the method doSomething the answer is 10.
        System.out.println(i);


    }
}
