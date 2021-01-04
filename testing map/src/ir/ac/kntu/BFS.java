package ir.ac.kntu;


//Blinky
public class BFS extends Ghost {
    int minDistance= 15; // FASELE BEYNE RUHO PACMAN (GHOTRE AKSA (FASELE MARKAZA 15 E AZ BIRUN B HAM MIKHORAN)
    public BFS(int x, int y) {

        super("resources/ghost_BFS.gif", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }
    public GhostType getGhostType() {
        return GhostType.BFS;
    }

    public double getDistanceToPacman(int pacCurX, int pacCurY, int ghostCurX, int ghostCurY){
        double curDistanceDiff = Math.sqrt(Math.pow((pacCurX-ghostCurX),2)+ Math.pow((pacCurY-ghostCurY),2));
        return curDistanceDiff;}
    public boolean checkDistance(double curDistanceDiff) {
        return minDistance < curDistanceDiff;}
}
