package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        int [] myArray = new int[10];

        myArray [0] = 34;
        myArray [1] = 66;
        myArray [2] = 56;

        System.out.println(myArray[0]);

        int [] listOfInt =  {55,33,11,77,89};

        System.out.println(listOfInt[1]);


        String [] listOfStrings = new String[4];
        listOfStrings [0]= "John Curley";
        listOfStrings [1] = "Fred Haslam";
        listOfStrings [2] = "Roy Rodgers";
        listOfStrings [3] = "Gregg Gornan";
       // listOfStrings [4] = "Weslely Snipes";

        System.out.println(listOfStrings[2]);

        listOfStrings = new String []{"Gereard", "Harry", "Aaron"};
        System.out.println(listOfStrings[1]);
        System.out.println(listOfStrings.length);

        for(int i =0; i < listOfStrings.length; i++){
            System.out.println(listOfStrings[i]);
        }

        //This code searches for searchCity Moscow in the arrayOfCities.

        //declaring an String array and initializing with city names
        String [] arrayOfCities = {"London", "Dublin", "Bagdad", "Cardiff"};

        //declaring a string searchCity
        String searchCity = "Moscow";

        //declaring a boolean and initializing it as false
        Boolean found = false;

        //creating an enhanced for loop
        for (String element:arrayOfCities){//enhanced loop goes through elements
            if (element.equals(searchCity)){//if moscow is equal to any of the elements then stateent is true
               found = true;
            }
        }
        if(found){//as found is true then implement
            System.out.println("This array contain the string "+searchCity);
        }
        else {//if found is not true then implement
            System.out.println("This array does not contain the string "+searchCity);
        }


        String [] arrayOfNames = new String [5];
        arrayOfNames [0]= "Fredrick";
        arrayOfNames [1]= "Patrick";
        arrayOfNames [2]= "Chadwick";
        arrayOfNames [3]= "Freda";
        arrayOfNames [4]= "Richard";

        System.out.println(arrayOfNames[4]);

        //array of politicians
        String [] arrayOfPoliticians = {"Boris Johnston", "Donald Trump", "Tereasa May","Andrea Letson" };
        System.out.println(arrayOfPoliticians[1]);
        for(int i=0; i<arrayOfPoliticians.length;i++){
            System.out.println(arrayOfPoliticians[i]);
        }


        //
        String [] arrayOfFruits;
        Boolean fruits = false;

        if(fruits){
            arrayOfFruits = new String[]{"Orange","Banana", "Pear","Berry"};

        }
        else {
            arrayOfFruits = new String[]{"Pineapple", "Strawberries"};
        }
        //System.out.println(arrayOfFruits.length);

        //printing all elements in the array by using a loop
        for (int i =0; i < arrayOfFruits.length; i++){
            System.out.println(arrayOfFruits[i]);
        }


        //this reinitializes the above string array

        arrayOfFruits = new String[]{"Plums", "Mango"};
//enhanced loop
//        for (int i=0; i<arrayOfFruits.length; i++) {
//            System.out.println(arrayOfFruits[i]);
//        }


        //this enhanced loop is different no int need or arrayOfFruits.length
        //and String element is used instead of arrayOfFruits[i];
        for (String element:arrayOfFruits){//
            System.out.println("Element: "+ element);
        }


        //te




    }
}
