package practicejavaprograms;

import java.io.File;
import java.util.Scanner;

public class ShowContentsOfFile {
    private Scanner x;//scanner can read from keyboard AND ALSO READ FILES

    public void openFile(){
        try {
            x = new Scanner(new File("E:\\PracticeMakingFilesAndGettingTheirContents\\Niall Family Data Base"));
        }
        catch (Exception e){
            System.out.println("Could not find file");
        }
    }

    public void readFile(){
        while (x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();//3 strings for each string in data base
            String d = x.next();

            System.out.printf("%s %s %s\n", a,b,c,d);

        }

    }

    public void closeFile(){
        x.close();

    }

}
