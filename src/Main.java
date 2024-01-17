import java.util.*;
public class Main{
    public static void hollow_rectangle(int row, int col){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inv_rot_pyramid(int row,int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(col - i >= j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void inv_half_pyramid(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (col - i)+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
//        hollow_rectangle(4,4);
//        inv_rot_pyramid(4,4);
        inv_half_pyramid(4,4);
    }
}