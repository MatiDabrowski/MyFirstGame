package com.kodilla.kolkokrzyzyk;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.*;


public class KolkoKrzyzykGame extends Application {
    private Image imageback = new Image("file:src/main/resources/ttt.png");
    private Pane dices = new Pane();
    private Pane throwButton = new Pane();
    private Pane labels = new Pane();
    public CheckWhosTurn checkWhosTurn = new CheckWhosTurn();
    String whosTurn = "X";
    Random randomInt = new Random();
    int randInt = 0;
    private String xOrObutt1;
    private String xOrObutt2;
    private String xOrObutt3;
    private String xOrObutt4;
    private String xOrObutt5;
    private String xOrObutt6;
    private String xOrObutt7;
    private String xOrObutt8;
    private String xOrObutt9;
    private HashSet<Button> disableButtons = new HashSet<>();
    private Alert alertBox = new Alert(Alert.AlertType.INFORMATION);
    private CheckWhosWin checkWhosWin = new CheckWhosWin();

    private void checkWhosWin() {
            checkWhosWin.checkWhosWin(xOrObutt1, xOrObutt2, xOrObutt3, xOrObutt4, xOrObutt5, xOrObutt6, xOrObutt7, xOrObutt8, xOrObutt9, disableButtons);
    }
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Pane grid = new Pane();
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setBackground(background);


        Button[] button = new Button[10];
        button[1] = new Button();
        button[1].setPrefSize(150, 150);
        button[1].setStyle("-fx-font-size:30");
        button[1].setLayoutX(100);
        button[1].setLayoutY(100);

        button[2] = new Button();
        button[2].setPrefSize(150, 150);
        button[2].setStyle("-fx-font-size:30");
        button[2].setLayoutX(325);
        button[2].setLayoutY(100);

        button[3] = new Button();
        button[3].setPrefSize(150, 150);
        button[3].setStyle("-fx-font-size:30");
        button[3].setLayoutX(550);
        button[3].setLayoutY(100);

        button[4] = new Button();
        button[4].setPrefSize(150, 150);
        button[4].setStyle("-fx-font-size:30");
        button[4].setLayoutX(100);
        button[4].setLayoutY(325);

        button[5] = new Button();
        button[5].setPrefSize(150, 150);
        button[5].setStyle("-fx-font-size:30");
        button[5].setLayoutX(325);
        button[5].setLayoutY(325);

        button[6] = new Button();
        button[6].setPrefSize(150, 150);
        button[6].setStyle("-fx-font-size:30");
        button[6].setLayoutX(550);
        button[6].setLayoutY(325);

        button[7] = new Button();
        button[7].setPrefSize(150, 150);
        button[7].setStyle("-fx-font-size:30");
        button[7].setLayoutX(100);
        button[7].setLayoutY(550);

        button[8] = new Button();
        button[8].setPrefSize(150, 150);
        button[8].setStyle("-fx-font-size:30");
        button[8].setLayoutX(325);
        button[8].setLayoutY(550);

        button[9] = new Button();
        button[9].setPrefSize(150, 150);
        button[9].setStyle("-fx-font-size:30");
        button[9].setLayoutX(550);
        button[9].setLayoutY(550);

        Label label = new Label();
        label.setStyle("-fx-font-size:30");
        label.setPrefSize(200,50);
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        label.autosize();
        label.setLayoutX(310);
        label.setLayoutY(20);
        label.setText("It is " + whosTurn + " turn.");

        Button compMovebutton = new Button();


        EventHandler<ActionEvent> compMove = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                int randInt = randomInt.nextInt(10);
                if (disableButtons.contains(button[randInt]) || randInt == 0) {
                    compMovebutton.fire();
                } else {
                    button[randInt].fire();
                }
            }
        };

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int randInt = randomInt.nextInt(10);
                if (disableButtons.contains(button[randInt]) || randInt == 0) {
                    compMovebutton.fire();
                } else {
                    button[randInt].fire();
                }
            }
        }));


        EventHandler<ActionEvent> button1Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[1].setText(whosTurn);
                button[1].setDisable(true);
                xOrObutt1 = whosTurn;
                disableButtons.add(button[1]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }

            }
        };

        EventHandler<ActionEvent> button2Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[2].setText(whosTurn);
                button[2].setDisable(true);
                xOrObutt2 = whosTurn;
                disableButtons.add(button[2]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button3Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[3].setText(whosTurn);
                button[3].setDisable(true);
                xOrObutt3 = whosTurn;
                disableButtons.add(button[3]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button4Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[4].setText(whosTurn);
                button[4].setDisable(true);
                xOrObutt4 = whosTurn;
                disableButtons.add(button[4]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button5Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[5].setText(whosTurn);
                button[5].setDisable(true);
                xOrObutt5 = whosTurn;
                disableButtons.add(button[5]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button6Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[6].setText(whosTurn);
                button[6].setDisable(true);
                xOrObutt6 = whosTurn;
                disableButtons.add(button[6]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button7Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[7].setText(whosTurn);
                button[7].setDisable(true);
                xOrObutt7 = whosTurn;
                disableButtons.add(button[7]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button8Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[8].setText(whosTurn);
                button[8].setDisable(true);
                xOrObutt8 = whosTurn;
                disableButtons.add(button[8]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        EventHandler<ActionEvent> button9Event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button[9].setText(whosTurn);
                button[9].setDisable(true);
                xOrObutt9 = whosTurn;
                disableButtons.add(button[9]);
                whosTurn = checkWhosTurn.checkWhosTurn(whosTurn);
                label.setText("It is " + whosTurn + " turn.");
                checkWhosWin();
                if(whosTurn == "O") {
                    timeline.play();
                    checkWhosWin();
                }
            }
        };

        button[1].setOnAction(button1Event);
        button[2].setOnAction(button2Event);
        button[3].setOnAction(button3Event);
        button[4].setOnAction(button4Event);
        button[5].setOnAction(button5Event);
        button[6].setOnAction(button6Event);
        button[7].setOnAction(button7Event);
        button[8].setOnAction(button8Event);
        button[9].setOnAction(button9Event);
        compMovebutton.setOnAction(compMove);


        grid.getChildren().add(button[1]);
        grid.getChildren().add(button[2]);
        grid.getChildren().add(button[3]);
        grid.getChildren().add(button[4]);
        grid.getChildren().add(button[5]);
        grid.getChildren().add(button[6]);
        grid.getChildren().add(button[7]);
        grid.getChildren().add(button[8]);
        grid.getChildren().add(button[9]);
        grid.getChildren().add(label);
        Scene scene = new Scene(grid, 800, 800, Color.WHITESMOKE);

        primaryStage.setTitle("Kółko i krzyżyk");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);

    }
}

