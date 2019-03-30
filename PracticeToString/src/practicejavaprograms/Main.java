package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        MyChildrensBirthday b = new MyChildrensBirthday(1990, 10,21);
        MyChildsName n = new MyChildsName("Caoimhe",b);

        System.out.println(n);
    }
}
