package game_menus;

import java.util.List;
import java.util.Scanner;

public class gameMenuObject {
    public void printMenu(){
        System.out.println("-------MENU-------");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print Numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find a number");
        System.out.println("6. Exit");
    }
    public int getUserSelected(){
        System.out.print("Please enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int userSelected = scanner.nextInt();
        return userSelected;
    }
    public void addNumberToArrayList(List<Integer> myArrayList){
        System.out.print("Please enter the number you want to add into Array List: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        myArrayList.add(number);
    }
    public void printArrayList(List<Integer> myArrayList){
        if (myArrayList.isEmpty())
            System.out.println("The array is empty");
        else System.out.println("The numbers are: " + myArrayList);
    }
    public int findMaxNumber(List<Integer> myArrayList){
        int maxNumber = myArrayList.get(0);
            for (int index1 = 0; index1 < myArrayList.size(); index1++) {
                if (maxNumber < myArrayList.get(index1)) {
                    maxNumber = myArrayList.get(index1);
                }
            }
        return maxNumber;
    }
    public int findMinNumber(List<Integer> myArrayList){
        int minNumber = myArrayList.get(0);
            for (int index2 = 0; index2 < myArrayList.size(); index2++) {
                if (minNumber > myArrayList.get(index2)){
                    minNumber = myArrayList.get(index2);
                }
            }
        return minNumber;
    }
    public int findNumber(List<Integer> myArrayList){
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

