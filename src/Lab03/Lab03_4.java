package Lab03;

import java.util.Arrays;

public class Lab03_4 {
    public static void main(String[] args) {
        int [] array1 = {1,1,2,8,9,33,44};
        int [] array2 = {2,10,13,30};
        int [] mergeTwoArray = new int[array1.length + array2.length];
        int index1 =0;
        int index2 =0;
        int indexMerge =0;
        while (index1 < array1.length && index2 < array2.length){
            if (array1[index1]<array2[index2]){
                mergeTwoArray[indexMerge++] = array1[index1++];
            }else mergeTwoArray[indexMerge++] = array2[index2++];
        }
        while (index1 <array1.length) {
            mergeTwoArray[indexMerge++] = array1[index1++];
        }
        while (index2 <array2.length) {
            mergeTwoArray[indexMerge++] = array2[index2++];
        }
        System.out.println(Arrays.toString(mergeTwoArray));
    }
}
