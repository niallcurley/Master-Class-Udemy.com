public class newScores {
    public static void main (String [] args){
        int newScore = calculateScore("Johnny Cash", 500);//calling first method with two parameters
        System.out.println("New Score " + newScore);
        calculateScore(75);// calling second method with one parameter
        calculateScore();//calling third method with no parameters

    }
    //the methods below each have a unique method signature i.e method name and number of parameters or no parameteres



    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    //overloaded method with only one parameter
    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    //overloaded method with no parameters
    public static int calculateScore (){
        System.out.println("No player name and no player score");
        return 0;
    }

    //
}
