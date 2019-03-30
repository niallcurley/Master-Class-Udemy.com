package practicejavaprograms;

public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override//method with specific calculation for fulltime employee
    public int calculateSalary() {
        return getPaymentPerHour()*39;
    }
}

