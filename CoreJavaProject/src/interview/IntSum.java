package interview;

public class IntSum {
    public static void main(String[] args) {
        int sum = 1234;
        System.out.println("Adding all integers");
        int result = String.valueOf(sum)
                .chars().map(Character::getNumericValue)
                .sum();
        System.out.println(result);

        System.out.println("Multiplying all the integers");
        int multiply = String.valueOf(sum).chars()
                .map(c -> c - '0')
                .reduce(1, (a,b) -> a*b);
        System.out.println(multiply);

        System.out.println("Subtracting all the integers");
        int subtract =String.valueOf(sum)
                .chars().map(c -> c - '0')
                .reduce(1, (a,b) -> a-b);
        System.out.println(subtract);
    }
}
