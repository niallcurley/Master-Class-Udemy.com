public class calFeetAndInchesCms {
    public static void main(String[] args) {

        double centimetres = calculateFeetAndIncesToCentimetres(6, 0);
        if (centimetres <= 0.0) {//validation for method,
            System.out.println("Invalid Parameters");
        }

        calculateFeetAndIncesToCentimetres(157);
    }

    public static double calculateFeetAndIncesToCentimetres(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {//validation for parameters - making valid parameters
            System.out.println("Invalid inches and feet parametres");//this output lets you know that invalid values have been entered
            return -1;
        }
        //when parameters are valid then they come down here to be used in our calculations
        double centimetres = (feet * 12) * 2.54; //converting feet to inches and then multiplying it by centimeters
        centimetres += inches * 2.54;//taking the calculation above and adding the inches which have been converted to centimetres (+=)
        System.out.println(feet + " feet " + inches + " inches = " + centimetres + " Cms ");
        return centimetres;//sending return centimetres back to method call to use for something else

    }


    public static double calculateFeetAndIncesToCentimetres(double inches) {
        if (inches < 0) {
            return -1;
        }
         double feet =  (int) inches / 12;//this calculation converts the inches entered into the parameter and changes them to feet
        double remainingInches = (int) inches % 12;//this calculation find the remaining inches after the feet have been calculated
        System.out.println(inches + " inches is equal to " + feet + " feet " + remainingInches + " inches ");
        return calculateFeetAndIncesToCentimetres(feet, remainingInches);//this return the feet & inches that have been converted to the first method to be changed to cms.
    }


}
