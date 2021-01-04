package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Box extends Rectangle{

    public Box(Coordinate coordinate) {
        super(coordinate.getX()*50, coordinate.getY()*50 , 40 , 40);


        setFill(Color.AQUAMARINE);
        setStroke(Color.BLUE);
        setArcHeight(20);
        setArcWidth(20);
    }

}

