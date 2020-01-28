import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int average = sum / 2;

        if (sum < 1000) {
            System.out.println("Their sum is ~" + sum);
        } else {
            System.out.println("Their sum is " + sum);
        }
        System.out.println("Their product is " + product);
        System.out.println("Their average is " + average);
    }
}

