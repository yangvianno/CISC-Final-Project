package edu.sdccd.cisc191;

import javafx.scene.control.Button;

/**
 * Extends the basic JavaFX Button with game functionality
 */
public class GameBoardButton extends Button {
    private int row;
    private int col;
    private boolean hasFish;
    private boolean isGuessed;

    public GameBoardButton(int row, int col, boolean hasFish)
    {
        this.row = row;
        this.col = col;
        this.hasFish = hasFish;

        // TODO: set min/pref width, default text
        this.setText("?");
        this.setMinWidth(20);
        this.setPrefHeight(90);
    }

    public void handleClick() {
        // TODO: update text
        if(hasFish) {
            this.setText("<><"); // TODO "<><"
        } else {
            this.setText("X");// TODO "X"
        }
        isGuessed = true;
        setDisabled(true);
    }
}