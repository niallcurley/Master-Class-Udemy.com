public class ifstatements {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 but greater than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score is less than 1000");
//        } else if(score > 5000){
//            System.out.println("Your score is greater than 5000");
//        }

        if(gameOver == true){  //also can code if(gameOver) without == true
            int finalScore = score + (levelCompleted * bonus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.
             System.out.println("Your final score " +finalScore);
         }
//
//        if(gameOver == true){  //also can code if(gameOver) without == true
//            int secondScore = 10000;
//            int secondLevelCompleted = 8;
//            int secondBunus = 200;
//            int finalScore = secondScore + (secondLevelCompleted * secondBunus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.
//            System.out.println("Your final score " +finalScore);
//        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver == true){  //also can code if(gameOver) without == true
            int finalScore = score + (levelCompleted * bonus); //variables created inside the code block cant be accessed outside it 'int finalScore' - this is called 'scope'.
            finalScore += 1000;
            System.out.println("Your final score " +finalScore);
         }
    }

}
