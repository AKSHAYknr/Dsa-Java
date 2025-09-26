package Strings;

public class Vowels {
    public static void main(String[] args) {
        vowels("akshay");
    }
    public static void vowels(String str){
        int vowel = 0, consonent = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }else{
                    consonent++;
                }
            }
        }
        System.out.println(vowel + " " + consonent);
    }
}
