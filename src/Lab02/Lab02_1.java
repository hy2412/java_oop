package Lab02;

import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scannerHeight = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        float height = scannerHeight.nextFloat();
        Scanner scannerWeight = new Scanner(System.in);
        System.out.print("Please enter your weight(kg): ");
        float weight = scannerWeight.nextFloat();
        float BMI = (weight / (height * 2));
        float suggestWeightForUnderWeight = ((18.5f * height * 2) - weight);
        float suggestWeightForOverWeight = (weight - (24.9f * height * 2));
        float suggestWeightForObesity = (weight - (29.9f * height * 2));
        System.out.printf("BMI = %.2f", BMI);
        if (BMI < 18.5) {
            System.out.println("\nUnderweight \nYou should gain " + suggestWeightForUnderWeight + "kg");
        } else if (BMI < 25) {
            System.out.println("\nNormal weight \nPerfect");
        } else if (BMI < 30) {
            System.out.println("\nOverweight \nYou should lose " + suggestWeightForOverWeight + "kg");
        } else System.out.println("\nObesity \nYou should lose " + suggestWeightForObesity + "kg");
    }
}
