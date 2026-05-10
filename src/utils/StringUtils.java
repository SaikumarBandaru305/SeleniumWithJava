package utils;

public class StringUtils {
    public static String reverse(String str) {
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String str){
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
}