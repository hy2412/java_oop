package Lab03;

public class Lab03_1 {
    public static void main(String[] args) {
        int oddNumber = 0;
        int evenNumber = 0;
        int[] myArrNum = new int[]{1, 2, 5, 6, 18, 27, 55};
        for (int index = 0; index < 7; index++) {
            if ( myArrNum[index] % 2 == 0){
                oddNumber++;
            }else evenNumber++;
        }

        System.out.println(oddNumber);
        System.out.println(evenNumber);
    }
}

