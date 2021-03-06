package com.kodilla.chinczyk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.concurrent.Flow;

public class Chinczyk extends Application {
    private Image imageback = new Image("file:src/main/resources/PlanszaChinczyk.png");
    private Image imageDice = new Image("file:src/main/resources/kosci3.png");
    private Pane dices = new Pane();
    private Pane throwButton = new Pane();
    private Pane labels = new Pane();
    Dice dice = new Dice();
    public int diceNo = 0;
    boolean isFirstMove = true;
    boolean notHomeButtRed1 = false;
    int homePositionXForRed1 = 503;
    int homePositionYForRed1 = 686;
    int startPositionXForRed1 = 604;
    int startPositionYForRed1 = 786;
    double actualPositionXForRed1;
    double actualPositionYForRed1;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Pane grid = new Pane();
        //grid.setAlignment(Pos.BASELINE_LEFT);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        //grid.setHgap(1);
        //grid.setVgap(1);
        grid.setBackground(background);

        Button rzut = new Button("Throw a dice");
            rzut.setPrefSize(200, 50);
            rzut.setStyle("-fx-font-size:18");
        Button pawnButton = new Button("1");
            pawnButton.setStyle("-fx-background-radius: 55em; " + "-fx-min-width: 55px; " + "-fx-min-height: 55px; " + "-fx-max-width: 55px; " + "-fx-max-height: 55px;" + "-fx-background-color: #ff0000;");
            pawnButton.setLayoutX(homePositionXForRed1);
            pawnButton.setLayoutY(homePositionYForRed1);
        Label label = new Label();
            label.setStyle("-fx-font-size:18");
            label.setPrefSize(200,50);
            label.setMaxWidth(Double.MAX_VALUE);
            label.setAlignment(Pos.CENTER);
            label.autosize();

        ImageView img = new ImageView(imageDice);
            img.setFitHeight(250);
            img.setFitWidth(200);

        EventHandler<ActionEvent> event = e -> {
            diceNo = dice.returnDiceNo();
            label.setText("Rzucono: " + diceNo);
            if (diceNo == 1) {
                img.setImage(new Image("file:src/main/resources/dice1.png"));
            } else if(diceNo == 2) {
                img.setImage(new Image("file:src/main/resources/dice2.png"));
            } else if (diceNo == 3) {
                img.setImage(new Image("file:src/main/resources/dice3.png"));
            } else if (diceNo == 4) {
                img.setImage(new Image("file:src/main/resources/dice4.png"));
            } else if (diceNo == 5) {
                img.setImage(new Image("file:src/main/resources/dice5.png"));
            } else if (diceNo == 6) {
                img.setImage(new Image("file:src/main/resources/dice6.png"));
            } else {
                img.setImage(new Image("file:src/main/resources/kosci3.png"));
            }
        };

        EventHandler<ActionEvent> makeMoveAction = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                if (diceNo == 6 && isFirstMove)  {
                    pawnButton.setLayoutX(604);
                    pawnButton.setLayoutY(786);
                    actualPositionXForRed1 = 604;
                    actualPositionYForRed1 = 786;
                    notHomeButtRed1 = true;


                }
                if (isFirstMove && notHomeButtRed1 && actualPositionXForRed1 != homePositionXForRed1 && actualPositionYForRed1 != homePositionYForRed1 ){
                    isFirstMove = false;
                } else {
                    double tempNextPositionX = actualPositionXForRed1;
                    double tempNextPositionY = actualPositionYForRed1;

                    //if ((tempNextPositionX - diceNo * 67.5) < 604 && (tempNextPositionX - diceNo * 67.5) > 604)


                    for (int n = 1; n <= diceNo; n++ ) {
                        tempNextPositionX = tempNextPositionX;
                        if (tempNextPositionY != 516){
                            tempNextPositionY = tempNextPositionY - 67.5;
                        }

                        if (tempNextPositionX <= 604 && (tempNextPositionY == 516) ){
                            tempNextPositionX = tempNextPositionX - 67.5;
                            tempNextPositionY = 516;
                        }
//                        if (tempNextPositionX - (diceNo * 67.5) == 604 && tempNextPositionY == 516) {
//                            tempNextPositionX = tempNextPositionX - (diceNo * 67.5);
//                            tempNextPositionY = 516;
//                        }

                    }
                    pawnButton.setLayoutX(tempNextPositionX);
                    pawnButton.setLayoutY(tempNextPositionY);
                    actualPositionXForRed1 = tempNextPositionX;
                    actualPositionYForRed1 = tempNextPositionY;
                    rzut.fire();

                }


            }
        };

        rzut.setOnAction(event);
        pawnButton.setOnAction(makeMoveAction);

        rzut.setLayoutX(25);
        rzut.setLayoutY(290);
        img.setLayoutX(25);
        img.setLayoutY(30);
        label.setLayoutX(25);
        label.setLayoutY(330);

        grid.getChildren().add(img);
        grid.getChildren().add(rzut);
        grid.getChildren().add(label);
        grid.getChildren().add(pawnButton);
        Scene scene = new Scene(grid, 1400, 950, Color.WHITESMOKE);

        primaryStage.setTitle("Chinczyk");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);

    }
}

