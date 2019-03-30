package practicejavaprograms;

public class Main {

    public static boolean contains(String [] stringArray, String search) {
        boolean result = false;
        for (String element : stringArray) {
            if (element.equals(search)) {
                result = true;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        String [] stringArray = {"Apple", "Banana","Orange"};
        System.out.println("The array contains the string Apple: "+contains(stringArray, "Apple"));
        System.out.println("The array contains the string Carrots: "+contains(stringArray, "Carrots"));

    }
}
