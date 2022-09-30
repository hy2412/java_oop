package lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab05_1 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myArrayList = new ArrayList<>();
        printMenu();

        while (isContinuing) {
            int userSelected = getUserSelected();
            switch (userSelected) {
                case 1:
                    addNumberToArrayList(myArrayList);
                    break;
                case 2:
                    printArrayList(myArrayList);
                    break;
                case 3:
                    if (myArrayList.isEmpty())
                        System.out.println("The array is empty");
                    else{
                        int maxValue = findMaxNumber(myArrayList);
                        System.out.println("The maximum number is: " + findMaxNumber(myArrayList));
                    };
                    break;
                case 4:
                    if (myArrayList.isEmpty()) System.out.println("The array is empty");
                    else {
                        int minValue = findMinNumber(myArrayList);
                        System.out.println("The minimum number is: " + findMinNumber(myArrayList));
                    }
                    break;
                case 5:
                    if (myArrayList.isEmpty()) System.out.println("The array is empty");
                    else {
                        int findNumber = findNumber(myArrayList);
                    }
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
    private static void printMenu(){
        System.out.println("-------MENU-------");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print Numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find a number");
        System.out.println("6. Exit");
    }
    private static int getUserSelected(){
        System.out.print("Please enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userSelected = scanner.nextInt();
        return userSelected;
    }
    private static void addNumberToArrayList(List<Integer> myArrayList){
        System.out.print("Please enter the number you want to add into Array List: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        myArrayList.add(number);
    }
    private static void printArrayList(List<Integer> myArrayList){
        if (myArrayList.isEmpty())
            System.out.println("The array is empty");
        else System.out.println("The numbers are: " + myArrayList);
    }
    private static int findMaxNumber(List<Integer> myArrayList){
        int maxNumber = myArrayList.get(0);
            for (int index1 = 0; index1 < myArrayList.size(); index1++) {
                if (maxNumber < myArrayList.get(index1)) {
                    maxNumber = myArrayList.get(index1);
                }
            }
        return maxNumber;
    }
    private static int findMinNumber(List<Integer> myArrayList){
        int minNumber = myArrayList.get(0);
            for (int index2 = 0; index2 < myArrayList.size(); index2++) {
                if (minNumber > myArrayList.get(index2)){
                    minNumber = myArrayList.get(index2);
                }
            }
        return minNumber;
    }
    private static int findNumber(List<Integer> myArrayList){
        System.out.print("Please enter the number do you want to find: ");
        Scanner scanner = new Scanner(System.in);
        int findNumber = scanner.nextInt();
            if (myArrayList.contains(findNumber)) {
                System.out.println("The number was found at index " + myArrayList.indexOf(findNumber));
            } else {
                System.out.println("The number was not found in array");
            }
        return findNumber;
    }
}

