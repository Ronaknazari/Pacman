package ir.ac.kntu;


public class HorizentolGhost extends Ghost{

    public HorizentolGhost(String imgPath, int x, int y) {
        super("resources/ghost_horizental.gif", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.HORIZENTOLGHOST;
    }

    @Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }
}
