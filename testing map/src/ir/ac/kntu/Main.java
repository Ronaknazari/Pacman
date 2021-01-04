package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application{
    //private Coordinate[][] coordinates = new Coordinate[20][12];
    Pane layout;

    @Override
    public void start(Stage primaryStage){
        layout = new Pane();
        layout.setStyle("-fx-background-color: BLACK");
        Map map = new Map(layout);

        Button reset = new Button("Reset");
        Button show = new Button("Show");
        show.setOnAction(e -> {
            map.printCurrent();
            layout.requestFocus();
        });
        show.setLayoutX(100);
        reset.setOnAction(e -> {
            map.resetPoints();
            layout.requestFocus();
        });
        layout.getChildren().addAll(reset, show);

        //Add pacman to the layout
        Pacman pacman = new Pacman();
        layout.getChildren().add(pacman);
        map.getCoordinates()[1][1].makePacman();

        BFS bfs = new BFS(12,4);

        VoraciousGhost voracious= new VoraciousGhost(9,5);

        VerticalGhost vertical= new VerticalGhost(5,7);

        HorizentolGhost horizentol = new HorizentolGhost("resources/ghost_horizental.gif" , 2 , 9 );

        RandomGhost random = new RandomGhost("resources/ghost_random.gif" , 18 , 17);

        layout.getChildren().add(bfs);
        layout.getChildren().add(voracious);
        layout.getChildren().add(vertical);
        layout.getChildren().add( horizentol);
        layout.getChildren().add(random);

        new Timer().schedule(new TimerTask()
        {
            public void run()
            {
                bfs.move(pacman.getPosition());
                voracious.move(pacman.getPosition());
                vertical.move(pacman.getPosition());
                horizentol.move(pacman.getPosition());
                random.move(pacman.getPosition());

            }

        },0,1000);


        //Handle keyboard inputs(events)
        layout.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() - 1].isBox()) {
                    if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() -1].getHoldedObject()
                        );
                        //bakhtan
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isRuh()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );
                        }*/
                        //jayeze
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            map.points = map.points+5;
                            map.updatePointer();
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                        }*/
                        //Mulct
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()-1].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() -1));
                }
                pacman.rotateUp();
            }
            if (e.getCode() == KeyCode.DOWN) {
                if (!map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isBox()) {
                    if (map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                        );;

                        //bakhtan
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isRuh()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );
                        }*/
                        //jayeze
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            map.points = map.points+5;
                            map.updatePointer();
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                        }*/
                        //Mulct
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/

                    }
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()+1].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX(), pacman.getPosition().getY() + 1));
                }
                pacman.rotateDown();
            }
            if (e.getCode() == KeyCode.RIGHT) {
                if (!map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].isBox()) {
                    if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                        );
                        //bakhtan
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isRuh()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );
                        }*/
                        //jayeze
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            map.points = map.points+5;
                            map.updatePointer();
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                        }*/

                        //Mulct
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }

                    map.getCoordinates()[pacman.getPosition().getX()+1][pacman.getPosition().getY()].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX()+1, pacman.getPosition().getY()));
                }
                pacman.rotateRight();
            }
            if (e.getCode() == KeyCode.LEFT) {
                if (!map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].isBox()) {
                    if (map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].isPoint()) {
                        map.points++;
                        map.updatePointer();
                        layout.getChildren().remove(
                                map.getCoordinates()[pacman.getPosition().getX() - 1][pacman.getPosition().getY()].getHoldedObject()
                        );;
                        //bakhtan
                        /*if(map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].isRuh()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY() + 1].getHoldedObject()
                            );
                        }*/
                        //jayeze
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            map.points = map.points+5;
                            map.updatePointer();
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                        }*/
                        //Mulct
                        /*if (map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].isPrizeCoin()){
                            layout.getChildren().remove(
                                    map.getCoordinates()[pacman.getPosition().getX() + 1][pacman.getPosition().getY()].getHoldedObject()
                            );
                            //adding 5 normal coin
                        }*/
                    }
                    map.getCoordinates()[pacman.getPosition().getX()-1][pacman.getPosition().getY()].makePacman();
                    map.getCoordinates()[pacman.getPosition().getX()][pacman.getPosition().getY()].makeEmpty();
                    pacman.setPosition(new Coordinate(pacman.getPosition().getX()-1, pacman.getPosition().getY()));
                }
                pacman.rotateLeft();
            }
        });


        primaryStage.setScene(new Scene(layout, 20*50, 20*50));
        primaryStage.setResizable(false);
        primaryStage.setTitle("PacMan Game");
        primaryStage.show();
        layout.requestFocus();
    }



}