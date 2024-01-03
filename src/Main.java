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

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int initialValur = 0;
//        int count = 0;
//        while(initialValur <= input){
//            count = count + initialValur;
//            System.out.println("Current No: "+initialValur+" Count: " + count);
//            initialValur++;
////            While loop End Here
//        }
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i<=10; i++){
//            System.out.println("Hello World");
//        }
//
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int reverseNumber = 0;
//        while(number > 0){
//            int lastDigit = number % 10;
////            System.out.print(lastDigit);
//            reverseNumber = (reverseNumber * 10) + lastDigit;
//            number = number/10;
//        }
//        System.out.println(reverseNumber);
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = 1;
//        while (true){
//            num = sc.nextInt();
//            if((num % 10) == 0){
//                System.out.println("No number will be displayed");
//                continue;
//            }
//            System.out.println(num);
//        }
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean isPrime = true;
//        for (int i = 2; i >= number; i++){
//            if(number % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime){
//            System.out.println("Number is non Prime");
//        }
//        else {
//            System.out.println("Number is Prime !!");
//        }
//    }
//}