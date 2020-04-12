package Minesweeper;


public class Field {
    private int fieldSize = 10;
    private int[][] field = new int[10][10];
    private int placeholder;

    public Field() {
    }
    public Field(int placeholder) {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                this.field[i][j] = placeholder;
            }
        }
    }

    public Field(int[][] field) {
        this.field = field;
    }

    public int getField(int x, int y) {
        return this.field[x][y];
    }

    public int[][] getFullField() {
        return this.field;
    }

    public void addBombs(int maxValueOfBombs) {
        for (int i = 0; i < maxValueOfBombs; i++) {
            this.field[(int) (Math.random() * 10)][(int) (Math.random() * 10)] = -2;
        }
    }

    public void clearField() {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                this.field[i][j] = 0;
            }
        }
    }

    public void setField(int[] setFieldArray) {
        this.field[(setFieldArray[1])][(setFieldArray[2])] = setFieldArray[0];
    }
    public void setField(int type, int x, int y) {
        this.field[x][y] = type;
    }





    public boolean gameOver() {

        return false;
    }

    public void tapOnField(int[][] hardField, int[] incomingTap) {
        int[] tap = incomingTap;









        /*int[] tap = incomingTap;
        int checkTap = hardField[tap[1]][tap[2]];
        switch (checkTap) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                this.field[tap[1]][tap[2]] = checkTap;
                break;
            case 0:
                this.field[tap[1]][tap[2]] = 0;
                for(int i = 0; i < 4; i++) {
                    tap[1]++;
                    if (tap[1] >= 0 && tap[1] < 10 && tap[2] >= 0 && tap[2] < 10) {
                        tapOnField(hardField, tap);
                    }
                    tap[2] =- 1;
                    if (tap[1] >= 0 && tap[1] < 10 && tap[2] >= 0 && tap[2] < 10) {
                        tapOnField(hardField, tap);
                    }
                    //tap[1] =+ 1;
                    tap[2] =+ 1;
                    if (tap[1] >= 0 && tap[1] < 10 && tap[2] >= 0 && tap[2] < 10) {
                        tapOnField(hardField, tap);
                    }
                    tap[2] =- 1;
                    if (tap[1] >= 0 && tap[1] < 10 && tap[2] >= 0 && tap[2] < 10) {
                        tapOnField(hardField, tap);
                    }
                }
                break;
            case -2:
                this.field[tap[1]][tap[2]] = 9;
                //gameOver
                break;
            default:
                System.out.println("Errorcode 007");
        }
        System.out.println("End");*/



    }
    public void addNumbersToField () {
        for(int i = 0; i < 10;i++) {
            for(int j = 0; j < 10; j++) {
                //field
                if(field[i][j] != -2) {
                    //if bomb
                    int minesAround = 0;
                    for (int k = i - 1; k < i + 2; k++) {
                        for (int m = j - 1; m < j + 2; m++) {
                            if (k >= 0 && k < 10 && m >= 0 && m < 10) {
                                if (field[k][m] == -2) {
                                    minesAround++;
                                }
                            }
                        }
                    }
                    field[i][j] = minesAround;
                }
            }
        }
    }
}