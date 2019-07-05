import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {

        System.out.println("Enter 5 Numbers: ");

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner number = new Scanner(System.in);
            arr[i] = number.nextInt();
        }
        System.out.println("The first number is:  " + arr[0]);
        System.out.println("The second number is:  " + arr[1]);
        System.out.println("The third number is:  " + arr[2]);
        System.out.println("The fourth number is:  " + arr[3]);
        System.out.println("The fifth number is:  " + arr[4]);
        }
    }

