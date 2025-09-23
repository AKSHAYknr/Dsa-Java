public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        countEvenAndOdd(arr);
    }
    public static void countEvenAndOdd(int[] arr){
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("OddCount : " + oddCount + " EvenCount : " + evenCount);
    }
}
