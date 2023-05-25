package perfect.numbers;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.printf("%s is a perfect number.", number);

        } else {
            System.out.printf("%s is not a perfect number.", number);

        }
    }


}
