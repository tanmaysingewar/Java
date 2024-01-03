//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age > 18){
//            System.out.println("You are Adult");
//        }
//        else {
//            System.out.println("You are not Adult");
//        }
//    }
//}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int initialValur = 0;
        int count = 0;
        while(initialValur <= input){
            count = count + initialValur;
            System.out.println("Current No: "+initialValur+" Count: " + count);
            initialValur++;
//            While loop End Here
        }
    }
}