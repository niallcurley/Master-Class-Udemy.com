package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        //in this code you can access the variable directly
        // by creating an object it belongs to the object
        //and can be used for each object
        //every instance of that object has its own copy of the variable
        //and any changes made to the variable wont be the same in other
        //instances of the object

//                Product prod1 = new Product();
//                prod1.Barcode = 123456;
//
//                Product prod2 = new Product();
//                prod2.Barcode = 987654;
//
//                System.out.println(prod1.Barcode);
//                System.out.println(prod2.Barcode);
//            }
//        }
//
//        class Product {
//            public int Barcode;//instance variable - means you can access this variable
//
//        }

        //CLASS VARIABLE
//I used non-static methods to get and set the value
// of Barcode to be able to call it from the object and not from the class.

// these are also known as static member variables and there's only one copy
// of that variable that is shared with all instances of that class.
// If changes are made to that variable, all other instances will see
// the effect of the changes.


                Product prod1 = new Product();
                prod1.setBarcode(123456);
                Product prod2 = new Product();
                prod2.setBarcode(987654);

                System.out.println(prod1.getBarcode());
                System.out.println(prod2.getBarcode());
            }
        }

        class Product {

            public static int Barcode;//static or class variables

            public int getBarcode() {
                return Barcode;
            }

            public void setBarcode(int value) {
                Barcode = value;
            }


        }

