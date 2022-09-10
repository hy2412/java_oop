package Lab02;

import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        float   height = scanner1.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter your weight(kg): ");
        float   weight = scanner2.nextFloat();
        float BMI = (weight / (height * 2) );
        float suggestWeightForUnderWeight = (18.5f * height * 2);
        float suggestWeightForOverWeight = (24.9f * height * 2);
        float suggestWeightForObesity = (29.9f * height * 2);
        System.out.printf("BMI = %.2f",BMI);
        if (BMI <= 18.4) {
            System.out.println("\nUnderweight \nYou should increase your weight to " + suggestWeightForUnderWeight);
        }else if (BMI <=24.9){
            System.out.println("\nNormal weight \nPerfect");
        }else if (BMI <=29.9){
            System.out.println("\nOverweight \nYou should decrease your weight to " + suggestWeightForOverWeight);
        }else System.out.println("\nObesity \nYou should decrease your weight to " + suggestWeightForObesity);
    }
}
