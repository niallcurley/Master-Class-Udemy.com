package practicejavaprograms;

import java.util.Scanner;

public class ReadingFile {

    private Scanner f;

    public void seeFileContents (){

        try {

            f = new Scanner(new file ("Niall Family Data Base"));
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
