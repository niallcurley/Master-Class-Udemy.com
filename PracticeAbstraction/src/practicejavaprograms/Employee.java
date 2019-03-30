package practicejavaprograms;

public abstract class Employee {

    //abstract class - this is a better way to present less information in the constructors making it easier with less parameters that are only relevant to a unique subclass
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();//We define a method called calculateSalary() as an abstract method. This way you leave the implementation of this method to the inheritors of the Employee class.


    //this is one way of presenting information about employees fulltime and contractors that gives too much detail in the object that is created. Smaller
    //subclasses would be better with less parametres in the constructors, so that subclass could be instanciated.
//    private String contractorName;
//    private String fullTimeEmployeeName;
//    private int contractorPaymentPerHour;
//    private int fullTimePaymentPerHour;
//    private final int fullTimeNoOfHours = 39;
//    private int fullTimeOverTimeHours;
//    private int contractorHoursWorked;
//
//    public Employee(String contractorName, String fullTimeEmployeeName, int contractorPaymentPerHour, int fullTimePaymentPerHour, int fullTimeOverTimeHours, int contractorHoursWorked) {
//        this.contractorName = contractorName;
//        this.fullTimeEmployeeName = fullTimeEmployeeName;
//        this.contractorPaymentPerHour = contractorPaymentPerHour;
//        this.fullTimePaymentPerHour = fullTimePaymentPerHour;
//        this.fullTimeOverTimeHours = fullTimeOverTimeHours;
//        this.contractorHoursWorked = contractorHoursWorked;
//    }



//    public String getContractorName() {
//        return contractorName;
//    }
//
//    public void setContractorName(String contractorName) {
//        this.contractorName = contractorName;
//    }
//
//    public String getFullTimeEmployeeName() {
//        return fullTimeEmployeeName;
//    }
//
//    public void setFullTimeEmployeeName(String fullTimeEmployeeName) {
//        this.fullTimeEmployeeName = fullTimeEmployeeName;
//    }
//
//    public int getContractorPaymentPerHour() {
//        return contractorPaymentPerHour;
//    }
//
//    public void setContractorPaymentPerHour(int contractorPaymentPerHour) {
//        this.contractorPaymentPerHour = contractorPaymentPerHour;
//    }
//
//    public int getFullTimePaymentPerHour() {
//        return fullTimePaymentPerHour;
//    }
//
//    public void setFullTimePaymentPerHour(int fullTimePaymentPerHour) {
//        this.fullTimePaymentPerHour = fullTimePaymentPerHour;
//    }
//
//    public int getFullTimeNoOfHours() {
//        return fullTimeNoOfHours;
//    }
//
//    public int getFullTimeOverTimeHours() {
//        return fullTimeOverTimeHours;
//    }
//
//    public void setFullTimeOverTimeHours(int fullTimeOverTimeHours) {
//        this.fullTimeOverTimeHours = fullTimeOverTimeHours;
//    }
//
//    public int getContractorHoursWorked() {
//        return contractorHoursWorked;
//    }
//
//    public void setContractorHoursWorked(int contractorHoursWorked) {
//        this.contractorHoursWorked = contractorHoursWorked;
//    }
//
//    //methods for calculating full time wage
//    private int calFullTimeWage(){
//        return getFullTimeNoOfHours()*getFullTimePaymentPerHour();
//    }
//
//    private int calFullTimeOverTimeWage(){
//        return getFullTimeOverTimeHours()*getFullTimePaymentPerHour();
//    }
//
//    public int calTotalFullTimeWage(){
//        return calFullTimeWage()+calFullTimeOverTimeWage();
//    }
//
//    //methods for calculating contractor wage
//    public int calContractorWage(){
//        return getContractorHoursWorked()*getContractorPaymentPerHour();
//    }
}
