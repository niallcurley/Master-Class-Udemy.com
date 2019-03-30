package practicejavaprograms;

public class Overload {

    private String name;
    private String address;



    public void descriptionOfPerson (int a){
        System.out.println(a);
    }

    public void descriptionOfPerson (int a, int b){
        System.out.println(a+b);
    }

    public void descriptionOfPerson (int a, int b, int c){
        System.out.println(a+b+c);
    }


}
