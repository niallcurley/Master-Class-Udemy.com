package practicejavaprograms;

public class StaticMethodsVariables {
//static is used for variables and methods that wont be individual as instances are.
    //useful for things that stay the same
    public static int staticVariable;
    static int interestRate = 2;
    public String name;

    public StaticMethodsVariables(String name) {
        this.name = name;
    }

    public static int getStaticVariable() {
        return staticVariable;
    }

    public static int getInterestRate() {
        return interestRate;
    }

    public String getName() {
        return name;
    }

    public static void moreStaticMethods(){
        System.out.println("This is a static method");
    }
}
