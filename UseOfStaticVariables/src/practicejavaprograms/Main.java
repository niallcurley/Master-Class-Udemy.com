package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        StaticMembers m1 = new StaticMembers("Niall", "Curley");
        StaticMembers m2 = new StaticMembers("Bob", "Turley");
        StaticMembers m3 = new StaticMembers("Rob", "Furley");
        StaticMembers m4 = new StaticMembers("Fred", "Surley");

        System.out.println(m2.getFirstName());
        System.out.println(m2.getLastName());
        System.out.println(m2.getNoOfMembers());




    }
}
