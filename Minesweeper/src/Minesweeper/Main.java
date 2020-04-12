package Minesweeper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Preload
        int fieldSize = 10;
        System.out.println("-Minesweeper-");
        Field mineField = new Field();
        mineField.addBombs(10);
        Field playerField = new Field(-1);
        Input input = new Input();
        boolean gameOver = false;
        boolean allClear = false;
        Output output = new Output();
        mineField.addNumbersToField();


        //testing Area
        output.printField(mineField.getFullField());




        //game starts
        output.printField(playerField.getFullField());
        int[] tap = input.fieldTap();
        switch (playerField.getField(tap[1],tap[2])) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                System.out.println("Field allready unhidden]");
                break;
            case -2:
                System.out.println("Field set as possible Bomb, pls uncheck with : B" + tap[1] + tap[2]);
                break;
            case -1:
                playerField.tapOnField(mineField.getFullField(), tap);
                System.out.println("Finisch");
                output.printField(playerField.getFullField());
                break;
            default:
                System.out.println("Error on input");
        }
    }








        /*
        while (!gameOver || !allClear) {
            output.printField(playerField.getFullField());
                int[] tap = input.fieldTap(); //ask for Tap
                if(tap[0] == -2) {
                    playerField.setField(tap);
            } else if (tap[0] == -1) {
                    switch (mineField.getField(tap[1], tap[2])) {
                        case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                            playerField.setField(tap[1],tap[2], mineField.getField(tap[1], tap[2]));
                    }

                    } else {
                        // GameOver
                        System.out.println("You lost all your Niggers, go buy some more!");
                        output.printField(mineField.getFullField());
                    }
                }


        }
*/







        //System.out.println(Arrays.toString(input.fieldTap()));


        //output.printField(playerField.getField());
        //(mineField.getField());

}
