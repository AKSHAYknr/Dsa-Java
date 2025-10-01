package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "cat";
        System.out.println(palindrome(0, str, str.length()-1));
    }

    private static boolean palindrome(int i, String str, int j) {
        if(i >= j) return true;

        if(str.charAt(i) != str.charAt(j)) return false;

        return palindrome(i+1, str, j-1);
    }
}
