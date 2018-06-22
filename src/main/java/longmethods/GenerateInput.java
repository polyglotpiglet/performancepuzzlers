package longmethods;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateInput {

    public static void main(String... args) {
        int limit = 1396;

        String methodContent = IntStream.range(0, limit)
                .mapToObj(i -> "x += " + i + ";")
                .collect(Collectors.joining());

        System.out.println(methodContent);

    }


}
