package practicejavaprograms;

/*
The User class defines the properties for the Users to be stored in
the Databasd. Each User has a valid Username verified by te UserCheck
 method and a valid Password verified by the PassCheck method.
 */

public class User {

    private String username = " ";
    private String password = " ";

    public User(){}

    public User (String newUsername, String newPassword){
        setUsername (newUsername);
        setUsername (newPassword);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return (username + "     " + password);
    }
}//ends user class
