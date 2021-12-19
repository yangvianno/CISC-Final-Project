package edu.sdccd.cisc191;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Presents the user with the game graphical user interface
 */
public class ViewGameBoard extends Application {
    private Canvas gameCanvas = new Canvas(200, 200); // TODO initialize gameCanvas;
    private ControllerGameBoard controller = new ControllerGameBoard();
    private GameBoardLabel fishRemaining = new GameBoardLabel();
    private GameBoardLabel guessesRemaining = new GameBoardLabel();
    private GameBoardLabel message = new GameBoardLabel();

    Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void updateHeader() { //set children of HBox and calculate the remaining with
        //Label
        fishRemaining.setText("Fish: " + controller.modelGameBoard.getFishRemaining());
        guessesRemaining.setText("Bait: " + controller.modelGameBoard.getGuessesRemaining());

        if(controller.fishWin()) {
            message.setText("Fishes win!"); //setText is a method in Label class of GameBoardLabel
        } else if(controller.playerWins()) {
            message.setText("You win!");
        } else {
            message.setText("Find the fish!");
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Gone Fishing");

        // TODO display game there are infinite ways to do this, I used BorderPane with HBox and VBox.
        BorderPane layout = new BorderPane();
        VBox verticalBox = new VBox(10);
        HBox textLabel = new HBox();
        updateHeader(); //initiate this method to get "fishRemaining, guessesRemaining, message"
        textLabel.getChildren().addAll(fishRemaining, guessesRemaining, message); //add them in one HBox
        layout.setTop(textLabel); //add that HBox, which just got added, to layout

        for (int row = 0; row < ModelGameBoard.DIMENSION; row++) {
            // TODO: create row container
            HBox rowContainer = new HBox(10); //has to be here // TODO: create row container
            for (int col = 0; col < ModelGameBoard.DIMENSION; col++) {
                GameBoardButton button = new GameBoardButton(row, col, controller.modelGameBoard.fishAt(row,col));
                int finalRow = row;
                int finalCol = col;
                button.setOnAction(e -> {
                    controller.makeGuess(finalRow, finalCol);
                    if(!controller.isGameOver()) {
                        button.handleClick();
                        updateHeader(); //if not place here, the system won't count down when start playing
        //because in updateHeader() has getFishRemaining() & getGuessesRemaining() to countdown after each bait
                    }
                });
                rowContainer.getChildren().add(button); // TODO: add button to row
            }
            verticalBox.getChildren().add(rowContainer); // TODO: add row to column
        }
        layout.setCenter(verticalBox); //not sure why it's not in center when run
        // TODO: create scene, and show
        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}