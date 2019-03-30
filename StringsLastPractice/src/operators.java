public class operators {
    public static void main(String[] args) {
        int result = 2 + 2;
        System.out.println("2 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        result = result * 10;
        previousResult = previousResult - 1;
        System.out.println(previousResult + " X 10 = " + result);

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result = result + 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isMale;
        isMale = false;
        if (isMale == true)
            System.out.println("Congratulations you are female!!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("yee haa");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("New Value = " + newValue);

        boolean isBlack = true;
        if (isBlack)  //speedier version than if (isBlack == true)
            System.out.println("I am from african american ethnicity");

        //practice
        double firstDouble = 20;
        double secondDouble = 80;

        double total = (firstDouble + secondDouble) * 25;
        System.out.println("Total = " + total);
        total = total % 40;
        System.out.println("Remainder after divided by 40 = " + total);

        if (total <= 20)
            System.out.println("Total was over the limit");

        //2nd practice
        double newResult = (20 + 80) * 25;
        newResult = newResult % 40;
        System.out.println("Remainder after division by 40 = " + newResult);

        if (newResult <= 20)
            System.out.println("Total was over the limit!!!");

    }
}
