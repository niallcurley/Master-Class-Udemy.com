package practicejavaprograms;

public class Contractor extends Employee {

    private int hoursWorked;

    public Contractor(String name, int paymentPerHour, int hoursWorked) {
        super(name, paymentPerHour);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override//method with specific calculation for specific calculation
    public int calculateSalary() {
        return getPaymentPerHour()*hoursWorked;
    }
}
