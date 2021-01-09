package com.kodilla.kolkokrzyzyk;
import javafx.scene.control.Alert;
import java.util.HashSet;


public class CheckWhosWin {

    private Alert alertBox = new Alert(Alert.AlertType.INFORMATION);

    public void checkWhosWin(String xOrObutt1, String xOrObutt2, String xOrObutt3, String xOrObutt4, String xOrObutt5, String xOrObutt6, String xOrObutt7, String xOrObutt8, String xOrObutt9, HashSet disableButtons) {

        if(disableButtons.size() == 9) {
            alertBox.setContentText("Nobody win :(");
            alertBox.show();
        }

        if ("X".equals(xOrObutt1) && "X".equals(xOrObutt2) && "X".equals(xOrObutt3)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt9) && "O".equals(xOrObutt2) && "O".equals(xOrObutt3)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt4) && "X".equals(xOrObutt5) && "X".equals(xOrObutt6)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt4) && "O".equals(xOrObutt5) && "O".equals(xOrObutt6)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt7) && "X".equals(xOrObutt8) && "X".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt7) && "O".equals(xOrObutt8) && "O".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt7) && "X".equals(xOrObutt8) && "X".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("X".equals(xOrObutt1) && "X".equals(xOrObutt4) && "X".equals(xOrObutt7)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt9) && "O".equals(xOrObutt4) && "O".equals(xOrObutt7)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt2) && "X".equals(xOrObutt5) && "X".equals(xOrObutt8)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt2) && "O".equals(xOrObutt5) && "O".equals(xOrObutt8)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt3) && "X".equals(xOrObutt6) && "X".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt3) && "O".equals(xOrObutt6) && "O".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt1) && "X".equals(xOrObutt5) && "X".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt9) && "O".equals(xOrObutt5) && "O".equals(xOrObutt9)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
        if ("X".equals(xOrObutt3) && "X".equals(xOrObutt5) && "X".equals(xOrObutt7)) {
            alertBox.setContentText("The winner is: X");
            alertBox.show();
        }
        if ("O".equals(xOrObutt3) && "O".equals(xOrObutt5) && "O".equals(xOrObutt7)) {
            alertBox.setContentText("The winner is: O");
            alertBox.show();
        }
    }
}
