package lab06;

import java.util.Scanner;

public class Lab06_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int times = 3;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count<times){
            System.out.print("Please enter your password: ");
            String userInput = scanner.nextLine();
            if (userInput.equals(myPassword)){
                System.out.println("Welcome");
                break;
            }else count++;
            System.out.println("Inaccurate password, please try again");
        }
        if (count == times){
            System.out.println("You have entered the wrong password 3 times, please try again after 10 minutes");
        }
    }
}
