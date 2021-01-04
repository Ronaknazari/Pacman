package ir.ac.kntu;
import java.util.Random;

public class RandomGhost extends Ghost{
    public RandomGhost(String imgPath, int x, int y) {
        super("resources/ghost_random.gif", x, y);
    }

    @Override
    protected Directions getAIMove() {
        return null;
    }

    @Override
    public GhostType getGhostType() {
        return GhostType.RANDOMGHOST;
    }

    @Override
    public boolean checkDistance(double curDistanceDiff) {
        return false;
    }

    /*@Override
    public void move(Coordinate pacPosition) {
        super.move(pacPosition);
        Random rand=new Random();
        int moveSelector=rand.nextInt(999999999%2);
        if (moveSelector==1){
            if (this.getCoordinate().isInSizeX())
                if (!(map[getCoordinate().getX()+1][getCoordinate().getY()].getFull()))
                    this.getCoordinate().moveX();
                else
                    this.getCoordinate().moveBackX();

            else
                this.getCoordinate().moveBackX();
        }
        else{
            if (this.getCoordinate().isInSizeX0())
                if (!(map[getCoordinate().getX()-1][getCoordinate().getY()].getFull()))
                    this.getCoordinate().moveBackX();
                else
                    this.getCoordinate().moveX();
            else
                this.getCoordinate().moveX();
        }
    }*/
}

