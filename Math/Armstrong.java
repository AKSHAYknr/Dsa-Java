package Math;

public class Armstrong {
    public static void main(String[] args) {
        armstrong(1634);
    }
    public static void armstrong(int num){
        int number = num;
        int count = digitCount(number);
        int armstrong = 0;
        while(number > 0){
            int val = number % 10;
            armstrong += (int) (Math.pow(val, count));
            number /= 10;
        }
        System.out.println(armstrong);
        System.out.println(armstrong == num);
    }
    public static int digitCount(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
