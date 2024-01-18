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
    public static void butterfly(int num){
        // 1st half
        for (int i = 1; i <= num; i++) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2*(num-i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i = num; i >= 1; i--) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2*(num-i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int linearSearch(int array[], int num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
//        int res = linearSearch(array,4);
//        int res = maxInArray(array);
//        int res = binarySearch(array, 3);
//        System.out.println(res);
    }
}