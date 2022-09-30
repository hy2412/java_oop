package lab06;

import java.util.Scanner;

public class Lab06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your time in text(ex: 2hrs and 10 minutes): ");
        String strTime = scanner.nextLine();
        int hrs = 0;
        int minutes = 0;
        String[] splitTime = strTime.split(" ");
        for(int i= 0; i < splitTime.length; i++) {
            if(splitTime[i].contains("hrs")) {
                String spitTimeHour = splitTime[i].replaceAll("[^0-9]", "");
                hrs = hrs + Integer.parseInt(spitTimeHour);
                minutes = hrs * 60;
            }
            if (splitTime[i].contains("minutes")) {
                minutes = minutes + Integer.parseInt(splitTime[i - 1]);
            }
        }
        System.out.println(String.format("Total minutes is: %d", minutes));

    }
}
