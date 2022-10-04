package lab05;

import game_menus.gameMenu;

import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myArrayList = new java.util.ArrayList<>();
        gameMenu.printMenu();

        while (isContinuing) {
            int userSelected = gameMenu.getUserSelected();
            switch (userSelected) {
                case 1:
                    gameMenu.addNumberToArrayList(myArrayList);
                    break;
                case 2:
                    gameMenu.printArrayList(myArrayList);
                    break;
                case 3:
                    if (myArrayList.isEmpty())
                        System.out.println("The array is empty");
                    else{
                        int maxValue = gameMenu.findMaxNumber(myArrayList);
                        System.out.println("The maximum number is: " + gameMenu.findMaxNumber(myArrayList));
                    };
                    break;
                case 4:
                    if (myArrayList.isEmpty()) System.out.println("The array is empty");
                    else {
                        int minValue = gameMenu.findMinNumber(myArrayList);
                        System.out.println("The minimum number is: " + gameMenu.findMinNumber(myArrayList));
                    }
                    break;
                case 5:
                    if (myArrayList.isEmpty()) System.out.println("The array is empty");
                    else {
                        int findNumber = gameMenu.findNumber(myArrayList);
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
}
