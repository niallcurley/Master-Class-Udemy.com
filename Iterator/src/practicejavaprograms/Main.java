package practicejavaprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Peter Jones");
        names.add("Joseph Holmes");
        names.add("Urma Thurman");

//        names.add("Chaitanya");
//        names.add("Steve");
//        names.add("Jack");

        Iterator it = names.iterator();

        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
        }


    }
}
