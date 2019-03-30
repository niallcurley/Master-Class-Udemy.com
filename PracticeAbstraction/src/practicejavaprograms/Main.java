package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        Contractor contractor = new Contractor("John Wayne", 23,50);//smaller constructors that avoid too much detail - abstract means not real - not everyting
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Robert Dunlop", 12);

        contractor.getPaymentPerHour();
        contractor.getHoursWorked();
        contractor.calculateSalary();
        contractor.getName();


        System.out.println(contractor.getName());
        System.out.println(contractor.getHoursWorked());
        System.out.println(contractor.calculateSalary());




//    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Gibson", 15);
//    Contractor contractor = new Contractor("Peter Piper", 20, 50);
//        System.out.println("A full time employee will expect to earn "+fullTimeEmployee.getPaymentPerHour()+" per hour.");
//        System.out.println("A contract will expect to earn "+ contractor.getPaymentPerHour()+" per hour.");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println(fullTimeEmployee.getName()+ " worked a standard 8 hours and was paid "+fullTimeEmployee.calculateHoursWorked()+".");
//        System.out.println(contractor.getName()+ " worked "+contractor.getHoursWorked() + " hours at "+contractor.getPaymentPerHour()+" per hour and earned £" +contractor.calculateHoursWorked()+".");
//


  //by clubbing together all the information required in one constructor it has led to unecessary informaton rather than smaller sub class constructors with unique varibles and methods
  //by using an abstract superclass it means there is less repetition of information and less redundancy

//        Employee employee = new Employee("Stephen Hawkins", "Saul Of Tarsus", 20, 12,6,55);
//
//        System.out.println(employee.getFullTimeEmployeeName()+" worked "+employee.getFullTimeNoOfHours()+" hours and worked "+employee.getFullTimeOverTimeHours()+" hours overtime and in total earned £"+employee.calTotalFullTimeWage());
//
//        System.out.println(employee.getContractorName()+" worked "+employee.getContractorHoursWorked()+ " hours and earned £"+employee.calContractorWage());
//
//        System.out.println();


   }
}

