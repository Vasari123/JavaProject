package interview;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 19875;

        while (number > 9){
            number = String.valueOf(number)
                    .chars()
                    .map(c -> c - '0')
                    .sum();
        }
        System.out.println("The single digit is " + number);
    }
}
