package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.startUp();
        camera1.startUp();
        camera1.snap();


        //Upcasting  is making a lower child class refer to a parent or superclass object.
        //so in the case below 'machine2.startUp' calls the method in the child class
        //because camera1 is made to refer to machine2. There you are able to use lower child class methods in the parent class.

        Machine machine2 = camera1;//machine2 made to refer to camera1.
        machine2.startUp(); //because machine2 refers to camera then machine2.startUp refers to the startUp method in camera.
        System.out.println("******************");

        //Downcasting is the opposite  --THIS IS AN UNSAFE -- YOU NEED TO KNOW WHAT YOU ARE DOING
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.startUp();
        camera2.snap();


    }
}
