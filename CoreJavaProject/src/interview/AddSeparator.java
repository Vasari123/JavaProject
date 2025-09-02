package interview;

import java.util.Arrays;

/*It will add special characters after each word*/

public class AddSeparator {
    public static void main(String[] args) {
        String str = "java functional programming";
        String result = String.join("#$#", str.split(" "));
        System.out.println(result);
    }
}
