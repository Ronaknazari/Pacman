package ir.ac.kntu;

import javafx.scene.Node;

public class Coordinate {
    private int x;
    private int y;
    private int type;
    private Node holdedObject;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
        this.type = 0;
    }

    public void setHoldedObject(Node holdedObject) {
        this.holdedObject = holdedObject;
    }

    public Node getHoldedObject(){
        if (holdedObject == null) {

        }
        return holdedObject;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //empty
    public boolean isEmpty() {
        return type == 0;
    }
    //divar
    public boolean isBox() {
        return type == 1;
    }
    //pacman
    public boolean isPacman() {
        return type == 3;
    }
    //coins
    public boolean isPoint() {
        return type == 2;
    }
    public boolean isMulctCoin() {
        return type == 4;
    }
    public boolean isPrizeCoin() {
        return type == 5;
    }

    //ruh
    public boolean isRuh() {
        return type == 6;
    }


    public void makeEmpty() {
        type = 0;
    }

    public void makeBox() {
        type = 1;
    }

    public void makePoint() {
        type = 2;
    }
    public void makePacman() {
        type = 3;
    }


    public void makeMulctCoin() {
        type = 4;
    }

    public void makePrizeCoin() {
        type = 5;
    }
    public void makeRuh() {
        type = 6;
    }


    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", type=" + type +
                ", holdedObject=" + holdedObject +
                '}';
    }
}
