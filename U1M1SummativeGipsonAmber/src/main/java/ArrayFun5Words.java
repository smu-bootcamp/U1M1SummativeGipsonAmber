import java.util.Scanner;
public class ArrayFun5Words {
    public static void main(String[] args) {

            System.out.println("Enter 5 Words: ");

            String[] arr = new String [5];
            for (int i = 0; i < 5; i++) {
                Scanner number = new Scanner(System.in);
                arr[i] = number.nextLine();
            }
            System.out.println(arr[0]+ "  "+ arr[1]+ "  " + arr[2]+ "  " + arr[3]+ "  " + arr[4]);

        }
    }
