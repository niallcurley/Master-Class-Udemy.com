package practicejavaprograms;

public class MichellesClass extends NiallsGroup{

    private int yearsOfService;

    public MichellesClass(String name, int age, String address, int yearsOfService) {
        super(name, age, address);
        this.yearsOfService = yearsOfService;
    }

    public void singSongs(){
        System.out.println("sing along");
    }

    public void printStuff(){
        System.out.println("Print kids stuff");
    }
}
