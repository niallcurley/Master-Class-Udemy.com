package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


        FootballScores fs = new FootballScores();

        fs.calculateDraw();
        fs.calculateWin();
        fs.calculateDraw();
        fs.getPointsForDraw();
        System.out.println(fs.getTotalPoints());
    }
}
