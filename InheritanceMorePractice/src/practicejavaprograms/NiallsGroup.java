package practicejavaprograms;

public class NiallsGroup extends NormansGroup{

    private String address;


    public NiallsGroup(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public void printStuff(){
        System.out.println("Print youth stuff");
    }

    public void bibleStudy(){
        System.out.println("Study the scriptures");
    }

    public String getAddress() {
        return address;
    }


}
