package switchCase;

public class PatternMatchingGuards {
    public static void main(String[] args) {
        Object obj = 42;
        String result = switch (obj){
            case Integer i when i%2==0 -> "Even number" +i;
            case Integer i when  i%2 !=0 -> "Odd number" + i;
            case null -> "it is null";
            default -> "It is default";
        };
        System.out.println(result);
    }
}
