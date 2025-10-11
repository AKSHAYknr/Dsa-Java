package Array;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 1, 2, 1, 2, 1, 3, 1, 1};
        majority(arr);
    
    }
    private static void majority(int[] arr) {
        int count = 0; int candidate = 0;

        for(int num : arr){
            if(count == 0){
                candidate = num;
                count++;
            }else if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        int candidateCount = 0;
        for(int num : arr){
            if(num == candidate){
                candidateCount++;
            }
        }
        if(candidateCount > arr.length / 2){
            System.out.println("Majority" + " -> " + candidate);
        }
    }
}
