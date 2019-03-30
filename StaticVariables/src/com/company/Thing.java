package com.company;

public class Thing {

    public final static int LUCKYNUMBER = 8;//constant
    public String name;
    public static String description;//static variable

   public static void showInfo(){//static - attached to class and not to the object
       System.out.println(description);

   }

   public  void secondShowTime () {
       System.out.println(name);
       System.out.println(description);//example of static variable being called in a instance method.
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
