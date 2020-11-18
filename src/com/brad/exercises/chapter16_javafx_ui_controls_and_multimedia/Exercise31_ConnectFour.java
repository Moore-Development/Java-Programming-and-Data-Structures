package com.brad.exercises.chapter16_javafx_ui_controls_and_multimedia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise31_ConnectFour extends Application{

    private String turn = "Player1";
    Column[] columns = new Column[7];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    
        // create 7 column, six row board
        HBox board = new HBox();
        board.setStyle("-fx-background-color: green");
        board.setPadding(new Insets(10,10,10,10));

        for(int i = 0; i < 7; i++) {

            //board.add(cells[i][j] = new Cell(), i, j);
            board.getChildren().add(columns[i] = new Column(i));
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(board);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Connect Four");
        primaryStage.setScene(scene);
        primaryStage.show();

        // (done) user drops a disk on any cell

        // (done) user drops a disk by clicking on an availble cell (an unoccupied cell with a downward neighbor occupied)

        // (done) two players take turns dropping red and yellow disks

        // flashes the four winning cells if a player wins (four same-colored cells in a row, column, or diagonal)

        // reports no winners if all cells are occupied with no winners

        // display game status on a label after each move

    }

    public class Column extends VBox {

        private Cell[] cells = new Cell[6];
        private int columnNumber;

        public Column(int columnNumber) {

            this.columnNumber = columnNumber;

            for (int i = 5; i >= 0; i--) {
                this.getChildren().add(cells[i] = new Cell(this.columnNumber, i));
            }

            this.setOnMouseClicked(e -> handleMouseClick());
        }

        private void handleMouseClick() {

            for (int i = 0; i < cells.length; i++) {
                if (cells[i].getToken() == ' ') {
                    cells[i].setToken();
                    break;
                }
            }
        }

        public Cell[] getCells() {
            return this.cells;
        }
    }

    public class Cell extends StackPane {

        private char token = ' ';
        private Circle hole;
        private int row;
        private int column;

        public Cell(int column, int row) {

            this.row = row;
            this.column = column;
            this.hole = new Circle(30, Color.WHITE);
            this.getChildren().add(hole);
            setAlignment(hole, Pos.CENTER);
            this.setPadding(new Insets(5,5,5,5));
        }

        public void setToken() {

            if (turn != " ") {

                if (turn == "Player1") {
                    this.token = 'r';
                    this.hole = new Circle(30, Color.RED);
                    turn = "Player2";
                }

                else if (turn == "Player2") {
                    this.token = 'y';
                    this.hole = new Circle(30, Color.YELLOW);
                    turn = "Player1";
                }
                
                this.getChildren().add(hole);
                checkWin(this);
            }
        }

        public int getColumn() {

            return this.column;
        }

        public int getRow() {

            return this.row;
        }

        public char getToken() {

            return this.token;
        }
    }

    private void checkWin(Cell cell) {
        
        // check for vertical four-in-a-rows

        // only check vertical four-in-a-rows after the third row
        if (cell.getRow() >= 3) {

            // test if the below four cells contain the same token
            if (cell.getToken() == columns[cell.getColumn()].getCells()[cell.getRow() - 1].getToken()
                && cell.getToken() == columns[cell.getColumn()].getCells()[cell.getRow() - 2].getToken()
                && cell.getToken() == columns[cell.getColumn()].getCells()[cell.getRow() - 3].getToken()) {

                    System.out.println("Win");
            }
        }

        // check for horizontal four-in-a-rows

        // check for diagonal four-in-a-rows

    }
}
