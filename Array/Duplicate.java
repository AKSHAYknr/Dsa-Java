import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};    
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.toString());
    }
}
