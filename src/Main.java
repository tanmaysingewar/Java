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

    public static void floyd_triangle(int num){
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println(" ");
        }
    }

    public static void static_triangle(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j) % 2  == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
//        hollow_rectangle(4,4);
//        inv_rot_pyramid(4,4);
//        inv_half_pyramid(4,4);
        floyd_triangle(5);
//        static_triangle(5);
    }

}