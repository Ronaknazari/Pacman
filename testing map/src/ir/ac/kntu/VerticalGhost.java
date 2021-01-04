package ir.ac.kntu;


public class VerticalGhost extends Ghost {
    public VerticalGhost( int x, int y) {
        super("resources/ghost_vertical.gif", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.VERTICALGHOST;
    }

    @Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }
}

