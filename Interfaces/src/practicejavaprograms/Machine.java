package practicejavaprograms;

public class Machine implements Information{//

    private int id = 7;

    public void start (){
        System.out.println("Machine started");
    }


    public void showInfo() {//showInfo accessed from interface, interfaces can allow access to many objects which inheritance allows only one
        System.out.println("Machine ID is " + id);
    }
}
