package repetition.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(2);
        iList.add(7);
        iList.add(88);
        iList.add(null);
        iList.add(6);
        iList.add(13);

        List<Integer> result = iList.stream()
                .filter(Objects::nonNull)
                .map(Test::increment)
                .peek(System.out::println)
                .map((decr) -> --decr)
                .collect(Collectors.toList());

        System.out.println(iList);
        System.out.println(result);
    }
    private static int increment(int i) {
        return ++i;
    }
}
