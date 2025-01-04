import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 for exit: = ");

        while (true) {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;

        }
        System.out.println("Sum = " + sum);
    }
}
