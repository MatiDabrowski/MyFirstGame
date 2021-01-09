package com.kodilla.kolkokrzyzyk;

public class CheckWhosTurn {

    public String checkWhosTurn(String whosTurn){
        if (whosTurn.equals("X")) {
            return "O";
        } else {
            return "X";
        }
    }

}
