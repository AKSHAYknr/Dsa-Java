package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("akshay", "ajay", "abhi"));
        list.add(Arrays.asList("joy", "jose", "johny"));

        Stream<String> stream = list.stream().flatMap((List<String> names) -> 
                                        names.stream().map((String name) -> name.toLowerCase()));
    }
}
