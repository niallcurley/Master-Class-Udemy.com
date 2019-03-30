package practicejavaprograms;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {


        for(Enumerator myKids : Enumerator.values())
            System.out.printf("%s\t%s\t%s\n", myKids, myKids.getCarType(),myKids.getYear());


        System.out.println("This is the range of values chosen\n");

        //this uses the Enumerator range to select specific objects and values
        for (Enumerator myKids : EnumSet.range(Enumerator.Citreon, Enumerator.Toyota))
            System.out.printf("%s\t%s\t%s\n", myKids, myKids.getCarType(),myKids.getYear());

    }


}
