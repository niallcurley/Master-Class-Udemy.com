package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray  = new int[10];
        myIntArray[0]=27;
        myIntArray[1]=7;
        myIntArray[2]=2;
        myIntArray[3]=77;
        myIntArray[4]=23;
        myIntArray[5]=99;
        myIntArray[6]=132;
        myIntArray[7]=55;
        myIntArray[8]=88;
        myIntArray[9]=258;
        //myIntArray[10]=64;

        System.out.println(myIntArray[5]);

        //int [] moreIntArrays {5,7,4,8,3,9};

        double [] myDoubleArray = new double[6];
        myDoubleArray[0]=66.8;
        myDoubleArray[1]=55.7;
        myDoubleArray[2]=44.3;
        myDoubleArray[3]=77.3;
        myDoubleArray[4]=33;
        myDoubleArray[5]=22;

        System.out.println(myDoubleArray[2]);

        int [] listOfInt = {4,6,8,2,9,};
        System.out.println(listOfInt[1]);


        //this loop is for multiplying the value in the element
        int [] arrayIntForLoop = new int[30];


        //this is one type of for loop with i<10
//        for(int i=0;  i<10; i++ ){  //i<10 is called hard coding
//            arrayIntForLoop[i] = i*10;
//        }

        for (int i=0; i<arrayIntForLoop.length;i++ ){
            arrayIntForLoop[i] = i*10;
        }



//        for(int i=0; i<arrayIntForLoop.length; i++){
//            System.out.println("Element " + i + " has a value of " + arrayIntForLoop[i]);
//        }
        // this loop is for multiplying the element number
//        for (int i=0; i<10; i++ ){//i<10 is called hard coding
//            System.out.println("Elements "+ i + " value of "+ arrayIntForLoop[i]);
//        }
        printArray(arrayIntForLoop);

    }

    public static void printArray (int [] array){
                for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " has a value of " + array[i]);
        }
    }
}
