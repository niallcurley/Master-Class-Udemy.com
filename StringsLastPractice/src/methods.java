public class methods {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 2000;
//        int levelCompleted = 5;
//        int bonus = 100;


//        calculateScore(false, 2000, 5, 100);
//        calculateScore(true, 10000, 8, 500);

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score " + highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score " + highScore);


        //calculateHighScorePostion method returns an int value which passes to int highScore
        // highScore is then used instead of an actual value e.g 250
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("John Murray ", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Peter Jenkins ", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Sean Beattie ", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Phillip White ", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Jack White ", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Sam White ", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Paul Toland ", highScore);

    }

//    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
//        if (gameOver == true) {  //also can code if(gameOver) without == true
//            int finalScore = score + (levelCompleted * bonus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.
//            finalScore += 2000;
//
//            return finalScore;
//        }
//        return 1222;
//
//    }


    public static void displayHighScorePosition (String playerName, int playerPosition)  {

      System.out.println (playerName + " managed to get postion " + playerPosition + " on the highscore table.");

    }


    public static int calculateHighScorePosition (int playerScore){
        if (playerScore >=1000){
            return 1;
        } else if(playerScore >=500 && playerScore<1000) {
            return 2;
        } else  if(playerScore >=100 && playerScore <500) {
            return 3;
        } else {
            return 4;
        }
    }

//   public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
//       if (gameOver == true) {  //also can code if(gameOver) without == true
//           int finalScore = score + (levelCompleted * bonus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.     finalScore += 1000;
//           System.out.println("Your final score " + finalScore);



      //this method was void but has now been changed to return a value.
//      public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
//           if (gameOver == true) {  //also can code if(gameOver) without == true
//                int finalScore = score + (levelCompleted * bonus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.
//               finalScore += 1000;
//                System.out.println("Your final score " + finalScore);
//                return finalScore;
//            }
//               return 1222;
//
//
//
//    }


}
