package Lab03;

import java.util.Arrays;

public class Lab03_3 {
    public static void main(String[] args) {
        int[] myArr = {2, 10, 1, 9, 15, 1, 22};
        for (int index1 = 0; index1 < myArr.length; index1++) {
            for (int index2 = index1 + 1; index2 < myArr.length; index2++) {
                if (myArr[index1] > myArr[index2]) {
                    int sortedArray = myArr[index1];
                    myArr[index1] = myArr[index2];
                    myArr[index2] = sortedArray;
                }
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
}
