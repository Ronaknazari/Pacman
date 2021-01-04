package ir.ac.kntu;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class Map {
    int points = 0;
    Text finalScore;
    Text lives;

    public static Coordinate[][] getCoordinates() {
        return coordinates;
    }

    private static Coordinate[][] coordinates = new Coordinate[20][19];
    private Pane layout;

    public Map(Pane _layout) {
        layout = _layout;
        setCoordinates();
        createMap();
        createPoints();
        finalScore = new Text(20, 980, "Points : " + points);
        finalScore.setFont(new Font(30));
        finalScore.setStroke(Color.ORANGE);
        layout.getChildren().add(finalScore);

        lives = new Text(600 , 980 , "Lives : 3");
        lives.setFont(new Font(30));
        lives.setStroke(Color.GREEN);
        layout.getChildren().add(lives);
    }

    private void createMap() {
        for (int i = 0; i < 20; i++) {
            coordinates[i][0].makeBox();
            coordinates[i][0].setHoldedObject(new Box(coordinates[i][0]));
            layout.getChildren().add(coordinates[i][0].getHoldedObject());

            coordinates[i][18].makeBox();
            coordinates[i][18].setHoldedObject(new Box(coordinates[i][18]));
            layout.getChildren().add(coordinates[i][18].getHoldedObject());
            if(i >1 && i<18){
                coordinates[i][16].makeBox();
                coordinates[i][16].setHoldedObject(new Box(coordinates[i][16]));
                layout.getChildren().add(coordinates[i][16].getHoldedObject());
            }
            if (i > 2 && i < 7 || i > 8 && i < 12 || i > 13 && i < 18) {
                coordinates[i][2].makeBox();
                coordinates[i][2].setHoldedObject(new Box(coordinates[i][2]));
                layout.getChildren().add(coordinates[i][2].getHoldedObject());

                coordinates[i][9].makeBox();
                coordinates[i][9].setHoldedObject(new Box(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }

           for(int j = 0 ; j < 19 ; j++){
                coordinates[0][j].makeBox();
                coordinates[0][j].setHoldedObject(new Box(coordinates[0][j]));
                layout.getChildren().add(coordinates[0][j].getHoldedObject());

                coordinates[19][j].makeBox();
                coordinates[19][j].setHoldedObject(new Box(coordinates[19][j]));
                layout.getChildren().add(coordinates[19][j].getHoldedObject());
            }
        }
        coordinates[8][5].makeBox();
        coordinates[8][5].setHoldedObject(new Box(coordinates[8][5]));
        layout.getChildren().add(coordinates[8][5].getHoldedObject());

        coordinates[8][6].makeBox();
        coordinates[8][6].setHoldedObject(new Box(coordinates[8][6]));
        layout.getChildren().add(coordinates[8][6].getHoldedObject());

        coordinates[4][5].makeBox();
        coordinates[4][5].setHoldedObject(new Box(coordinates[4][5]));
        layout.getChildren().add(coordinates[4][5].getHoldedObject());

        coordinates[5][5].makeBox();
        coordinates[5][5].setHoldedObject(new Box(coordinates[5][5]));
        layout.getChildren().add(coordinates[5][5].getHoldedObject());

        coordinates[4][6].makeBox();
        coordinates[4][6].setHoldedObject(new Box(coordinates[4][6]));
        layout.getChildren().add(coordinates[4][6].getHoldedObject());

        coordinates[5][6].makeBox();
        coordinates[5][6].setHoldedObject(new Box(coordinates[5][6]));
        layout.getChildren().add(coordinates[5][6].getHoldedObject());

        coordinates[12][5].makeBox();
        coordinates[12][5].setHoldedObject(new Box(coordinates[12][5]));
        layout.getChildren().add(coordinates[12][5].getHoldedObject());

        coordinates[12][6].makeBox();
        coordinates[12][6].setHoldedObject(new Box(coordinates[12][6]));
        layout.getChildren().add(coordinates[12][6].getHoldedObject());

        coordinates[13][5].makeBox();
        coordinates[13][5].setHoldedObject(new Box(coordinates[13][5]));
        layout.getChildren().add(coordinates[13][5].getHoldedObject());

        coordinates[13][6].makeBox();
        coordinates[13][6].setHoldedObject(new Box(coordinates[13][6]));
        layout.getChildren().add(coordinates[13][6].getHoldedObject());

        coordinates[14][5].makeBox();
        coordinates[14][5].setHoldedObject(new Box(coordinates[14][5]));
        layout.getChildren().add(coordinates[14][5].getHoldedObject());

        coordinates[14][6].makeBox();
        coordinates[14][6].setHoldedObject(new Box(coordinates[14][6]));
        layout.getChildren().add(coordinates[14][6].getHoldedObject());

        coordinates[15][5].makeBox();
        coordinates[15][5].setHoldedObject(new Box(coordinates[15][5]));
        layout.getChildren().add(coordinates[15][5].getHoldedObject());

        coordinates[15][6].makeBox();
        coordinates[15][6].setHoldedObject(new Box(coordinates[15][6]));
        layout.getChildren().add(coordinates[15][6].getHoldedObject());

        coordinates[3][12].makeBox();
        coordinates[3][12].setHoldedObject(new Box(coordinates[3][12]));
        layout.getChildren().add(coordinates[3][12].getHoldedObject());

        coordinates[3][13].makeBox();
        coordinates[3][13].setHoldedObject(new Box(coordinates[3][13]));
        layout.getChildren().add(coordinates[3][13].getHoldedObject());

        coordinates[6][12].makeBox();
        coordinates[6][12].setHoldedObject(new Box(coordinates[6][12]));
        layout.getChildren().add(coordinates[6][12].getHoldedObject());

        coordinates[6][13].makeBox();
        coordinates[6][13].setHoldedObject(new Box(coordinates[6][13]));
        layout.getChildren().add(coordinates[6][13].getHoldedObject());

        coordinates[7][12].makeBox();
        coordinates[7][12].setHoldedObject(new Box(coordinates[7][12]));
        layout.getChildren().add(coordinates[7][12].getHoldedObject());

        coordinates[7][13].makeBox();
        coordinates[7][13].setHoldedObject(new Box(coordinates[7][13]));
        layout.getChildren().add(coordinates[7][13].getHoldedObject());

        coordinates[8][12].makeBox();
        coordinates[8][12].setHoldedObject(new Box(coordinates[8][12]));
        layout.getChildren().add(coordinates[8][12].getHoldedObject());

        coordinates[8][13].makeBox();
        coordinates[8][13].setHoldedObject(new Box(coordinates[8][13]));
        layout.getChildren().add(coordinates[8][13].getHoldedObject());


        coordinates[9][12].makeBox();
        coordinates[9][12].setHoldedObject(new Box(coordinates[9][12]));
        layout.getChildren().add(coordinates[9][12].getHoldedObject());

        coordinates[9][13].makeBox();
        coordinates[9][13].setHoldedObject(new Box(coordinates[9][13]));
        layout.getChildren().add(coordinates[9][13].getHoldedObject());


        coordinates[12][12].makeBox();
        coordinates[12][12].setHoldedObject(new Box(coordinates[12][12]));
        layout.getChildren().add(coordinates[12][12].getHoldedObject());

        coordinates[12][13].makeBox();
        coordinates[12][13].setHoldedObject(new Box(coordinates[12][13]));
        layout.getChildren().add(coordinates[12][13].getHoldedObject());

        coordinates[15][12].makeBox();
        coordinates[15][12].setHoldedObject(new Box(coordinates[15][12]));
        layout.getChildren().add(coordinates[15][12].getHoldedObject());

        coordinates[15][13].makeBox();
        coordinates[15][13].setHoldedObject(new Box(coordinates[15][13]));
        layout.getChildren().add(coordinates[15][13].getHoldedObject());

        coordinates[16][12].makeBox();
        coordinates[16][12].setHoldedObject(new Box(coordinates[16][12]));
        layout.getChildren().add(coordinates[16][12].getHoldedObject());

        coordinates[16][13].makeBox();
        coordinates[16][13].setHoldedObject(new Box(coordinates[16][13]));
        layout.getChildren().add(coordinates[16][13].getHoldedObject());
    }

    private void setCoordinates() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                coordinates[i][j] = new Coordinate(i, j);
                coordinates[i][j].makeEmpty();
//                layout.getChildren().add(new Box(coordinates[i][j]));
            }
        }
    }

    public void resetPoints() {
        points = 0;
        updatePointer();
        for(int i = 0; i< 20; i++) {
            for (int j = 0; j < 19; j++) {
                if (coordinates[j][i].isEmpty()) {
                    if (coordinates[j][i].getHoldedObject() != null) {
                        if (coordinates[j][i].getHoldedObject() instanceof Coin ||
                                coordinates[j][i].getHoldedObject() instanceof MulctCoin ||
                                coordinates[j][i].getHoldedObject() instanceof PrizeCoin ) {
                            layout.getChildren().add(coordinates[j][i].getHoldedObject());
                            coordinates[j][i].makePoint();
                        }
                    }
                }
            }
        }
    }
    public void updatePointer() {
        if(points == 227) {
            Text result;
            //esult = new Text(17*50 , 580 ,"you" +result);
            finalScore.setText("congratulation !!! YOU WON :)");
        }else {
            finalScore.setText("Points: " + points);
        }
    }
    public void printCurrent() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19 ; j++) {
                System.out.printf("%s ",coordinates[j][i].isEmpty()?"1":"0");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void createPoints() {
        for (int i = 2; i < 19; i++) {
            coordinates[i][1].makePoint();
            coordinates[i][1].setHoldedObject(new Coin(coordinates[i][1]));
            layout.getChildren().add(coordinates[i][1].getHoldedObject());

            coordinates[i][17].makePoint();
            coordinates[i][17].setHoldedObject(new Coin(coordinates[i][17]));
            layout.getChildren().add(coordinates[i][17].getHoldedObject());
        }
        for(int j = 12 ; j < 15 ; j++){
            coordinates[1][j].makePoint();
            coordinates[1][j].setHoldedObject(new Coin(coordinates[1][j]));
            layout.getChildren().add(coordinates[1][j].getHoldedObject());

            coordinates[2][j].makePoint();
            coordinates[2][j].setHoldedObject(new Coin(coordinates[2][j]));
            layout.getChildren().add(coordinates[2][j].getHoldedObject());
        }
//        coordinates[7][16].makePoint();
//        coordinates[7][16].setHoldedObject(new PrizeCoin(coordinates[7][16]));
//        layout.getChildren().add(coordinates[7][16].getHoldedObject());
//
//        coordinates[8][16].makePoint();
//        coordinates[8][16].setHoldedObject(new MulctCoin(coordinates[8][16]));
//        layout.getChildren().add(coordinates[8][16].getHoldedObject());
//
//        coordinates[12][16].makePoint();
//        coordinates[12][16].setHoldedObject(new Coin(coordinates[12][16]));
//        layout.getChildren().add(coordinates[12][16].getHoldedObject());
//
//        coordinates[13][16].makePoint();
//        coordinates[13][16].setHoldedObject(new PrizeCoin(coordinates[13][16]));
//        layout.getChildren().add(coordinates[13][16].getHoldedObject());

        coordinates[18][16].makePoint();
        coordinates[18][16].setHoldedObject(new Coin(coordinates[18][16]));
        layout.getChildren().add(coordinates[18][16].getHoldedObject());

        for(int i =1 ; i<19 ; i++){
            coordinates[i][10].makePoint();
            coordinates[i][10].setHoldedObject(new Coin(coordinates[i][10]));
            layout.getChildren().add(coordinates[i][10].getHoldedObject());
            if(i > 0 && i < 7) {
                coordinates[i][11].makePoint();
                coordinates[i][11].setHoldedObject(new PrizeCoin(coordinates[i][11]));
                layout.getChildren().add(coordinates[i][11].getHoldedObject());

                coordinates[i][8].makePoint();
                coordinates[i][8].setHoldedObject(new Coin(coordinates[i][8]));
                layout.getChildren().add(coordinates[i][8].getHoldedObject());

                coordinates[i][7].makePoint();
                coordinates[i][7].setHoldedObject(new MulctCoin(coordinates[i][7]));
                layout.getChildren().add(coordinates[i][7].getHoldedObject());

                coordinates[i][4].makePoint();
                coordinates[i][4].setHoldedObject(new Coin(coordinates[i][4]));
                layout.getChildren().add(coordinates[i][4].getHoldedObject());

                coordinates[i][3].makePoint();
                coordinates[i][3].setHoldedObject(new PrizeCoin(coordinates[i][3]));
                layout.getChildren().add(coordinates[i][3].getHoldedObject());
            }
            if(i > 6 && i < 11 || i > 15 && i < 20){

                coordinates[i][11].makePoint();
                coordinates[i][11].setHoldedObject(new Coin(coordinates[i][11]));
                layout.getChildren().add(coordinates[i][11].getHoldedObject());

                coordinates[i][8].makePoint();
                coordinates[i][8].setHoldedObject(new Coin(coordinates[i][8]));
                layout.getChildren().add(coordinates[i][8].getHoldedObject());

                coordinates[i][7].makePoint();
                coordinates[i][7].setHoldedObject(new Coin(coordinates[i][7]));
                layout.getChildren().add(coordinates[i][7].getHoldedObject());

                coordinates[i][4].makePoint();
                coordinates[i][4].setHoldedObject(new Coin(coordinates[i][4]));
                layout.getChildren().add(coordinates[i][4].getHoldedObject());

                coordinates[i][3].makePoint();
                coordinates[i][3].setHoldedObject(new Coin(coordinates[i][3]));
                layout.getChildren().add(coordinates[i][3].getHoldedObject());
            }
            if(i > 10 && i < 16){
                coordinates[i][11].makePoint();
                coordinates[i][11].setHoldedObject(new MulctCoin(coordinates[i][11]));
                layout.getChildren().add(coordinates[i][11].getHoldedObject());

                coordinates[i][8].makePoint();
                coordinates[i][8].setHoldedObject(new PrizeCoin(coordinates[i][8]));
                layout.getChildren().add(coordinates[i][8].getHoldedObject());

                coordinates[i][7].makePoint();
                coordinates[i][7].setHoldedObject(new PrizeCoin(coordinates[i][7]));
                layout.getChildren().add(coordinates[i][7].getHoldedObject());

                coordinates[i][4].makePoint();
                coordinates[i][4].setHoldedObject(new MulctCoin(coordinates[i][4]));
                layout.getChildren().add(coordinates[i][4].getHoldedObject());

                coordinates[i][3].makePoint();
                coordinates[i][3].setHoldedObject(new PrizeCoin(coordinates[i][3]));
                layout.getChildren().add(coordinates[i][3].getHoldedObject());
            }
            if(i > 15 && i < 20){
                coordinates[i][5].makePoint();
                coordinates[i][5].setHoldedObject(new Coin(coordinates[i][5]));
                layout.getChildren().add(coordinates[i][5].getHoldedObject());

                coordinates[i][6].makePoint();
                coordinates[i][6].setHoldedObject(new MulctCoin(coordinates[i][6]));
                layout.getChildren().add(coordinates[i][6].getHoldedObject());

//                coordinates[i][14].makePoint();
//                coordinates[i][14].setHoldedObject(new PrizeCoin(coordinates[i][14]));
//                layout.getChildren().add(coordinates[i][14].getHoldedObject());
//
//                coordinates[i][15].makePoint();
//                coordinates[i][15].setHoldedObject(new MulctCoin(coordinates[i][15]));
//                layout.getChildren().add(coordinates[i][15].getHoldedObject());
            }
            if( i > 0 && i < 3){
                coordinates[i][9].makePoint();
                coordinates[i][9].setHoldedObject(new MulctCoin(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());

                coordinates[i][2].makePoint();
                coordinates[i][2].setHoldedObject(new MulctCoin(coordinates[i][2]));
                layout.getChildren().add(coordinates[i][2].getHoldedObject());
            }
            if( i > 2 && i < 17){
                coordinates[i][14].makePoint();
                coordinates[i][14].setHoldedObject(new Coin(coordinates[i][14]));
                layout.getChildren().add(coordinates[i][14].getHoldedObject());

                coordinates[i][15].makePoint();
                coordinates[i][15].setHoldedObject(new PrizeCoin(coordinates[i][15]));
                layout.getChildren().add(coordinates[i][15].getHoldedObject());
            }
            if( i > 3 && i < 6 ){
                coordinates[i][12].makePoint();
                coordinates[i][12].setHoldedObject(new MulctCoin(coordinates[i][12]));
                layout.getChildren().add(coordinates[i][12].getHoldedObject());

                coordinates[i][13].makePoint();
                coordinates[i][13].setHoldedObject(new MulctCoin(coordinates[i][13]));
                layout.getChildren().add(coordinates[i][13].getHoldedObject());
            }
            if( i > 9 && i < 12){
                coordinates[i][12].makePoint();
                coordinates[i][12].setHoldedObject(new PrizeCoin(coordinates[i][12]));
                layout.getChildren().add(coordinates[i][12].getHoldedObject());

                coordinates[i][13].makePoint();
                coordinates[i][13].setHoldedObject(new Coin(coordinates[i][13]));
                layout.getChildren().add(coordinates[i][13].getHoldedObject());
            }
            if( i > 12 && i < 15){
                coordinates[i][12].makePoint();
                coordinates[i][12].setHoldedObject(new PrizeCoin(coordinates[i][12]));
                layout.getChildren().add(coordinates[i][12].getHoldedObject());

                coordinates[i][13].makePoint();
                coordinates[i][13].setHoldedObject(new MulctCoin(coordinates[i][13]));
                layout.getChildren().add(coordinates[i][13].getHoldedObject());
            }
            if( i > 16 && i < 19){
                coordinates[i][12].makePoint();
                coordinates[i][12].setHoldedObject(new Coin(coordinates[i][12]));
                layout.getChildren().add(coordinates[i][12].getHoldedObject());

                coordinates[i][13].makePoint();
                coordinates[i][13].setHoldedObject(new Coin(coordinates[i][13]));
                layout.getChildren().add(coordinates[i][13].getHoldedObject());
            }
            if( i > 6 && i < 9){
                coordinates[i][2].makePoint();
                coordinates[i][2].setHoldedObject(new PrizeCoin(coordinates[i][2]));
                layout.getChildren().add(coordinates[i][2].getHoldedObject());

                coordinates[i][9].makePoint();
                coordinates[i][9].setHoldedObject(new Coin(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }
            if( i > 0 && i < 4){
                coordinates[i][5].makePoint();
                coordinates[i][5].setHoldedObject(new Coin(coordinates[i][5]));
                layout.getChildren().add(coordinates[i][5].getHoldedObject());

                coordinates[i][6].makePoint();
                coordinates[i][6].setHoldedObject(new PrizeCoin(coordinates[i][6]));
                layout.getChildren().add(coordinates[i][6].getHoldedObject());
            }
            if( i >5 && i < 8){
                coordinates[i][5].makePoint();
                coordinates[i][5].setHoldedObject(new MulctCoin(coordinates[i][5]));
                layout.getChildren().add(coordinates[i][5].getHoldedObject());

                coordinates[i][6].makePoint();
                coordinates[i][6].setHoldedObject(new Coin(coordinates[i][6]));
                layout.getChildren().add(coordinates[i][6].getHoldedObject());
            }
            if( i > 8 && i < 12){
                coordinates[i][5].makePoint();
                coordinates[i][5].setHoldedObject(new PrizeCoin(coordinates[i][5]));
                layout.getChildren().add(coordinates[i][5].getHoldedObject());

                coordinates[i][6].makePoint();
                coordinates[i][6].setHoldedObject(new MulctCoin(coordinates[i][6]));
                layout.getChildren().add(coordinates[i][6].getHoldedObject());
            }
            if( i > 11 && i < 14){
                coordinates[i][2].makePoint();
                coordinates[i][2].setHoldedObject(new Coin(coordinates[i][2]));
                layout.getChildren().add(coordinates[i][2].getHoldedObject());

                coordinates[i][9].makePoint();
                coordinates[i][9].setHoldedObject(new Coin(coordinates[i][9]));
                layout.getChildren().add(coordinates[i][9].getHoldedObject());
            }
//            coordinates[18][2].makePoint();
//            coordinates[18][2].setHoldedObject(new Coin(coordinates[18][2]));
//            layout.getChildren().add(coordinates[18][2].getHoldedObject());
//
//            coordinates[18][9].makePoint();
//            coordinates[18][9].setHoldedObject(new Coin(coordinates[18][9]));
//            layout.getChildren().add(coordinates[18][9].getHoldedObject());
        }
    }
}
