package leetCode;

import java.util.Arrays;
import java.util.Objects;

public class RemoveEmptyStrings {
    public static void main(String[] args) {
        String[] input = {"Java",""," ",null,"Streams","Spring","Hibernate"};
        String[] array = Arrays.stream(input)
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(array));

    }
}
