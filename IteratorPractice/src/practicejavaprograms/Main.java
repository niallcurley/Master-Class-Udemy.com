package practicejavaprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        ArrayList listTest1 = new ArrayList();

        listTest1.add("Freddie Flintstone");
        listTest1.add("George");
        listTest1.add("Ned");
        listTest1.add(88);

        System.out.println(listTest1.size());

        //System.out.println(listTest1.get(1));
        //System.out.println(listTest1.get(6));

        Iterator it = listTest1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(listTest1);



    }
}
