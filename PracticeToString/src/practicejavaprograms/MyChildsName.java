package practicejavaprograms;

public class MyChildsName {

    private String firstName;
    //private String surname;
    private MyChildrensBirthday birthday;

    public MyChildsName(String firstName, MyChildrensBirthday birthday) {
        this.firstName = firstName;
        //this.surname = surname;
        this.birthday = birthday;
    }

    public String toString (){
        return String.format("My childs firstname is %s,  My Childs Birthday is %s",firstName,birthday );
    }
}
