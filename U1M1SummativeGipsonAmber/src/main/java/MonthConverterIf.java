import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 to 12: ");
        int input = scanner.nextInt();
        if (input < 13 && input >= 1) {
            String[] monthName = {"Invalid Entry", "January", "Febuaray", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println("Month: " + monthName[input]);
        } else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}


