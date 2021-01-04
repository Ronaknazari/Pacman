package ir.ac.kntu;

public class VoraciousGhost extends Ghost {
    public VoraciousGhost(int x, int y) {
        super("resources/ghost_voracious.gif", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.VORACIOUSGHOST;
    }

    @Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }
}
