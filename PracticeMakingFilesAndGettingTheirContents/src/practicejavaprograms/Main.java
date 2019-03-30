package practicejavaprograms;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DataBaseCreated d = new DataBaseCreated();

//        d.newFile();
//        d.addContentToDataBase();
//        d.shutDown();

        ShowContentsOfFile showContentsOfFile = new ShowContentsOfFile();
        showContentsOfFile.openFile();
        showContentsOfFile.readFile();
        showContentsOfFile.closeFile();
    }
}
