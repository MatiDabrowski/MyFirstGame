package com.kodilla.chinczyk;

import java.util.Random;

public class Dice {
    private int no;

    public int returnDiceNo(){
        Random rand = new Random();
        no = rand.nextInt(6) + 1;
        return no;
    }
}
