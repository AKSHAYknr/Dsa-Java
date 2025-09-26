package Strings;

public class Digits {
    public static void main(String[] args) {
        System.out.println(onlyDigits("1234"));
    }
    public static boolean onlyDigits(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
