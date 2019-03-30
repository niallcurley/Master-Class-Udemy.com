package practicejavaprograms;

public class PointCoordinates {
    private int x, y;
    public PointCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // Custom toString() Method.
    public String toString() {
        return "X=" + x + " " + "Y=" + y;
    }
}
