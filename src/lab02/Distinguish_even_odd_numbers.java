package lab02;

import java.util.Scanner;

public class Distinguish_even_odd_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        int oddNumber = 2;

        if (number % oddNumber == 0){
            System.out.println("It's an odd number");
    }else {
            System.out.println("It's an even number");
        }
    }
}
