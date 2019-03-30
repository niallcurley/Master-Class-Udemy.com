package practicejavaprograms;

public class MyChildrensBirthday {

    private int year;
    private int month;
    private int day;

    public MyChildrensBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        System.out.printf("The constructor for this %s\n", this);
    }

    public String toString (){
        return String.format("%d/%d/%d", day,month, year);
    }
}
