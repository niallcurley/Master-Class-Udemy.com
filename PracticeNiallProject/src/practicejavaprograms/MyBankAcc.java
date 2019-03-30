package practicejavaprograms;

public class MyBankAcc {
    int accountNumber;
    String name;
    String address;
    String postCode;
    String phoneNumber;
    int age;
    double balance;

    boolean isMarried = true;
    boolean isMale = true;

    public MyBankAcc(int accountNumber, String name, String address, String postCode, String phoneNumber, int age, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double deposit(double depositBal) {
        balance = balance + depositBal;

        return balance;

    }

    public double withdrawal (double withdrawAmount){
        balance = balance - withdrawAmount;

        return balance;

    }

    public void getMenu (){
        System.out.println("******************Menu*********************");
        System.out.println("Option 1 - Create New Account");
        System.out.println("Option 2 - Get Customer Details");
        System.out.println("Option 3 - Deposit Amount");
        System.out.println("Option 4 - Withdraw Amount");
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("*********Choose an option above************");
    }


}
