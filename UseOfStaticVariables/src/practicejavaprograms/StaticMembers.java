package practicejavaprograms;

public class StaticMembers {

    private String firstName;
    private String lastName;
    private static int noOfMembers = 0;//this variable is used when its is shared by all objects and is not unique to each

    public StaticMembers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        noOfMembers++;

        System.out.printf("This is the constructor for %s %s, number of members are: %d\n", firstName, lastName, noOfMembers);
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getNoOfMembers() {
        return noOfMembers;
    }
}
