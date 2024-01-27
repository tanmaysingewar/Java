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
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + array[k];
                    maxSum = Math.max(sum, maxSum);
                    System.out.print("["+array[k]+"]");
                }
                ts ++;
                System.out.print(" -> "+sum);
                System.out.println();
            }
        }
        System.out.println("Total Sub array : " + ts);
        System.out.println("Maximum sum : " + maxSum);
    }

    public static void max_sum_prefix(int[] arr){

        int[] prefix = new int[arr.length];

        int currSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;


        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i];

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("max sum = " + maxSum);
    }

    public static void kadanes(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum : "+ maxSum);
    }

    public static int trappedRainwater(int[] height){
        // Calculate max left boundary
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
//        Calculate max right boundary
        int[] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length - 1];
        for (int i = height.length- 2; i >= 0 ; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
//        loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
//        waterLevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
//        trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }


    public static int buyAndSellStocks(int [] price){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void jaiShreeRam(){
        System.out.println("Jai Shree Ram");
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void  SelectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
    
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int curr = arr[i];
            int pre = i -1;
            while (pre >= 0 && arr[pre] < curr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre +1] = curr;
        }
    }


    public static void main(String[] args) {
//        int[] array = {-2,-3,4,-1,-2,1,5,-3};
//        int res = linearSearch(array,4);
//        int res = maxInArray(array);
//        int res = binarySearch(array, 3);
//        System.out.println(res);
//        reverse(array);
//        kadanes(array);
//        int[] height = {4,2,0,6,3,2,5};
//        System.out.println("Trapped water is : "+trappedRainwater(height));
            int [] prices = {7,1,5,3,6,4};
//        System.out.println("Max Profile is : "+ buyAndSellStocks(prices));
//        jaiShreeRam();
//        bubbleSort(prices);
//        printArr(prices);
        insertionSort(prices);
        printArr(prices);
    }

}