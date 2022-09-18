package Lab03;

public class Lab03_2 {
    public static void main(String[] args) {
        int[] myArr = {-1, 5, 9, 2, 8, -3, 11};
        int maximumNum = myArr[0];
        int minimumNum = myArr[0];
        for (int index = 0; index < myArr.length; index++) {
            if (myArr[index] > maximumNum) {
                maximumNum = myArr[index];
            }
        }
        System.out.println("Maximum number is: " + maximumNum);
        for (int index = 0; index < myArr.length; index++) {
            if (myArr[index] < minimumNum) {
                minimumNum = myArr[index];
            }
        }
        System.out.println("Maximum number is: " + minimumNum);
    }
}
