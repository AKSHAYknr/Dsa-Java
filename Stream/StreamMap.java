package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AKSHAY");
        list.add("ROHITH");
        list.add("ANU");
        list.add("AJAY");

        List<String> list2 = list.stream().map((String name) -> name.toLowerCase())
                                                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
