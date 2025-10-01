package Stream;

import java.util.ArrayList;

public class Salary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3000);
        list.add(4000);
        list.add(6000);
        list.add(1000);

        long count = list.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println(count);
    }
}
