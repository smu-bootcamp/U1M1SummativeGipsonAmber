import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number 1 to 10: ");
        int number;

        do {
            Scanner input1 = new Scanner(System.in);
            number = input1.nextInt();

            switch (number) {
                case 1:
                    System.out.println(number);
                    break;
                case 2:
                    System.out.println(number);
                    break;
                case 3:
                    System.out.println(number);
                    break;
                case 4:
                    System.out.println(number);
                    break;
                case 5:
                    System.out.println(number);
                    break;
                case 6:
                    System.out.println(number);
                    break;
                case 7:
                    System.out.println(number);
                    break;
                case 8:
                    System.out.println(number);
                    break;
                case 9:
                    System.out.println(number);
                    break;
                case 10:
                    System.out.println(number);
                    break;
                default:
                    System.out.println("You must enter a number between 1 and 10, please try again");
                    break;
            }
        } while ((number) < 1 || (number) > 10);
    }
}