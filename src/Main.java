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

    public static int maxInArray(int[] array){
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int binarySearch(int[] array, int key){
        int start = 0;
        int end = array.length - 1;


        while (start <= end){
            int mid = (start + end) / 2;

            if(array[mid] == key){
                return mid;
            }
            if (array[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void reverse(int[] array){
        int first = 0, last = array.length - 1;

        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }
    }

    public static void pari_array(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                System.out.print("["+array[i] +","+ array[j]+"]");
            }
            System.out.println();
        }
    }

    public static void sub_array(int[] array){
        int ts = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("["+array[k]+"]");
                }
                ts ++;
                System.out.println();
            }
        }

        System.out.println("Total Sub array : " + ts);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
//        int res = linearSearch(array,4);
//        int res = maxInArray(array);
//        int res = binarySearch(array, 3);
//        System.out.println(res);
//        reverse(array);
        sub_array(array);

    }
}