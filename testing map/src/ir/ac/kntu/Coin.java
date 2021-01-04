package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Coin extends Circle {
    private Coordinate position;
    private int point;

    public Coin(Coordinate position) {
        super(position.getX() * 50 + 25, position.getY() * 50 + 25, 10,Color.YELLOW);
    }

    //Constructor for prize and mulct coin should have COLOR as parameters
    public Coin(Coordinate position,Color color) {
        super(position.getX() * 50 + 25, position.getY() * 50 + 25, 10,color);
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


}
