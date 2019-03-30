package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


        StaticMethodsVariables s = new StaticMethodsVariables("harry");
        s.getName();
        System.out.println(s.getName());

        System.out.println(StaticMethodsVariables.getInterestRate());

        //TryingStatic.a = 10;//access because of key word static
        //TryingStatic.b = 3; cant access this to initialize object needs created


    }
}
