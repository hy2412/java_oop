package lab06;

public class Lab06_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String digits = "";
        for (int index = 0; index < myStr.length(); index++) {
            char a = myStr.charAt(index);
            if (Character.isDigit(a)) {
                digits += a;
            }
        }
        System.out.println(digits);
    }
}
