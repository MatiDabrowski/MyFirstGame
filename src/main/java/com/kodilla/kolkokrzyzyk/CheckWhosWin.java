package com.kodilla.kolkokrzyzyk;

import javafx.scene.control.Alert;

import java.util.HashSet;
import java.util.Map;

public class CheckWhosWin {

    private Alert alertBox = new Alert(Alert.AlertType.INFORMATION);

    public void checkWhosWin(String xOrObutt1, String xOrObutt2, String xOrObutt3, String xOrObutt4, String xOrObutt5, String xOrObutt6, String xOrObutt7, String xOrObutt8, String xOrObutt9, HashSet disableButtons) {

        if(disableButtons.size() == 9) {
            alertBox.setContentText("Nobody win :(");
            alertBox.show();
        }

        if (xOrObutt1.equals("X") && xOrObutt2 == "X" && xOrObutt3 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt1 == "O" && xOrObutt2 == "O" && xOrObutt3 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt4 == "X" && xOrObutt5 == "X" && xOrObutt6 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt4 == "O" && xOrObutt5 == "O" && xOrObutt6 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt7 == "X" && xOrObutt8 == "X" && xOrObutt9 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt7 == "O" && xOrObutt8 == "O" && xOrObutt9 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt7 == "X" && xOrObutt8 == "X" && xOrObutt9 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt1 == "X" && xOrObutt4 == "X" && xOrObutt7 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt1 == "O" && xOrObutt4 == "O" && xOrObutt7 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt2 == "X" && xOrObutt5 == "X" && xOrObutt8 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt2 == "O" && xOrObutt5 == "O" && xOrObutt8 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt3 == "X" && xOrObutt6 == "X" && xOrObutt9 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt3 == "O" && xOrObutt6 == "O" && xOrObutt9 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt1 == "X" && xOrObutt5 == "X" && xOrObutt9 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt1 == "O" && xOrObutt5 == "O" && xOrObutt9 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if (xOrObutt3 == "X" && xOrObutt5 == "X" && xOrObutt7 == "X") {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if (xOrObutt3 == "O" && xOrObutt5 == "O" && xOrObutt7 == "O") {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
    }
}
