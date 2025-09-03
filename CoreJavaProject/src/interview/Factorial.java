package interview;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial =  IntStream.rangeClosed(1,number)
                .reduce(1,(a,b) -> a*b);
        System.out.println("The factorial number is:" + factorial);
    }
}
