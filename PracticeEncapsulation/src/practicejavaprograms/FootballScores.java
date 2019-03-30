package practicejavaprograms;

public class FootballScores {

    private int pointsForDraw = 1;
    private int pointsForWin = 3;
    private int totalPoints = 0;

    public int getPointsForDraw() {
        return pointsForDraw;
    }

    public void setPointsForDraw(int pointsForDraw) {
        this.pointsForDraw = pointsForDraw;
    }

    public int getPointsForWin() {
        return pointsForWin;
    }

    public void setPointsForWin(int pointsForWin) {
        this.pointsForWin = pointsForWin;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int calculateDraw(){
        totalPoints += pointsForDraw;
        return totalPoints;
    }

    public int calculateWin(){
        totalPoints += pointsForWin;
        return totalPoints;
    }
}
