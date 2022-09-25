package Lab04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab04_01 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myArrayList = new ArrayList<>();

        System.out.println("-------MENU-------");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print Numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find a number");
        System.out.println("6. Exit");

        while (isContinuing) {
            System.out.print("Please enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int userSelected = scanner.nextInt();
            switch (userSelected) {
                case 1:
                    System.out.print("Please enter the number you want to add into Array List: ");
                    int number = scanner.nextInt();
                    myArrayList.add(number);
                    break;
                case 2:
                    if (myArrayList.size() > 0)
                    System.out.println("The numbers are: " + myArrayList);
                    else System.out.println("The array is empty");
                    break;
                case 3:
                    if (myArrayList.size() > 0) {
                        int maxNumber = myArrayList.get(0);
                        for (int index1 = 0; index1 < myArrayList.size(); index1++) {
                            if (maxNumber < myArrayList.get(index1)) {
                                maxNumber = myArrayList.get(index1);
                            }
                        }
                        System.out.println("The maximum number is: " + maxNumber);
                    } else System.out.println("The array is empty");
                    break;
                case 4:
                    if (myArrayList.size() > 0) {
                        int minNumber = myArrayList.get(0);
                        for (int index2 = 0; index2 < myArrayList.size(); index2++) {
                            if (minNumber > myArrayList.get(index2)){
                                minNumber = myArrayList.get(index2);
                            }
                        }
                        System.out.println("The maximum number is: " + minNumber);
                    } else System.out.println("The array is empty");
                    break;
                case 5:
                    System.out.print("Please enter the number do you want to find: ");
                    int findNumber = scanner.nextInt();
                    if (myArrayList.size() > 0) {
                        if (myArrayList.contains(findNumber)) {
                            System.out.println("The number was found at index " + myArrayList.indexOf(findNumber));
                        } else {
                            System.out.println("The number was not found in array");
                        }
                    } else System.out.println("The array is empty");
                    break;
                case 6:
                    isContinuing = false;
                    System.out.println("See ya!!");
                    break;
                default:
                    System.out.println("Please enter the number in menu.");
            }
        }
    }

}

