package practicejavaprograms;

public class NormansGroup {
    private String name;
    private int age;

    public NormansGroup(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printStuff(){
        System.out.println("Print tots stuff");
    }

    public void football (){
        System.out.println("Kick the ball to me");
    }

    public void readBooks (){
        System.out.println("Pick the best novel");
    }

    public void playGames (){
        System.out.println("Play board games");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
