package Minesweeper;

public class Output {

    public void printField(int [][] field) {
        System.out.println("Enter 'B' for expect Bomb or 'N' for send Niger + Field. z.B. N4F");
        System.out.print(" ");
        for(int i = 0; i < 10;i++) { // A-F
            char k = (char) ('A' + i);
            System.out.print(" " + k);
        }
        System.out.println();
        for(int j = 0; j < 10; j++) { //1-9
            System.out.print(j);
            for(int k = 0; k < 10; k++) {
                printDecodeFieldArray(field[j][k]);
            }
            System.out.println();
        }
    }

    public void printDecodeFieldArray(int arrayField) {
        switch (arrayField) {
            case 0:
                System.out.print("  ");
                break;
            case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:
                System.out.print(" " + arrayField);
                break;
            case 9:
                System.out.println(" D");
            case -1:
                System.out.print(" ?");
                break;
            case -2:
                System.out.print(" B");
                break;
            case -3:
                System.out.print(" N");
                break;
            default:
                System.out.print("ERROR 404, Array not found");
        }
    }

}
