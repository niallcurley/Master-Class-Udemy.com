package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


        HourMinuteSecond time =  new HourMinuteSecond();
        HourMinuteSecond time2 = new HourMinuteSecond(4);
        HourMinuteSecond time3 = new HourMinuteSecond(4,6);
        HourMinuteSecond time4 = new HourMinuteSecond(4, 6, 21);

        System.out.printf("%s\n", time.twentyFourHourClock());
        System.out.printf("%s\n", time2.twentyFourHourClock());
        System.out.printf("%s\n", time3.twentyFourHourClock());
        System.out.printf("%s\n", time4.twentyFourHourClock());

    }
}
