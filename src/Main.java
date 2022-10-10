import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Fizz Buzz Game");
        System.out.println("How many children ?");
        int children = scanner.nextInt();
        for (int i = 1; i < children+1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");

            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}