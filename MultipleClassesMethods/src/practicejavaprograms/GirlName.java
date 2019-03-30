package practicejavaprograms;

public class GirlName {

    private String girlsName;

    public GirlName(String name){
        girlsName = name;
    }

//    public void setName(String name){
//        girlsName = name;
//
//    }//end of method girlsName


    public String getGirlsName(){
        return girlsName;
    }

    public void saying (){
        System.out.printf("Your mothers name is %s\n ", getGirlsName());//printf is string formatting  --
    }
}
