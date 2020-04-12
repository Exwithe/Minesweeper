package Minesweeper;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);

    public int[] fieldTap() {
        System.out.println("Enter 'B' for Bomb or 'N' for send Niger + Field. z.B. N4F");
        int[] typeYX = new int[3];
        String input = scanner.nextLine();
        if (input.length() == 3) {
        char[] inputCharArray = input.toCharArray();
            switch (inputCharArray[0]) {
                case 'N': typeYX[0] = -1;
                break;
                case 'B': typeYX[0] = -2;
                break;
                default:
                    System.out.println("No such type");
                    fieldTap();
            }
            switch (inputCharArray[1]) {
                case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
                    typeYX[1] = ((inputCharArray[1]) - 48);
                    break;
                default:
                    System.out.println("Second cordinate is false");
                    fieldTap();
            }
            switch (inputCharArray[2]) {
                case 'A':case 'B':case 'C':case 'D':case 'E':case 'F':case 'G':case 'H':case 'I':case 'J':
                    typeYX[2] = ((inputCharArray[2]) - 65);
                    return typeYX;
                default:
                    System.out.println("Third cordinate is false");

                    fieldTap();
                    }
        int[] arrayFiledTapType = new int[3];
        } else {
            System.out.println("ERROR, wrong Input");
        }
        return null;
    }
}
