package switchCase;

public class SwitchCaseNullHandling {
    public static void main(String[] args) {
        Object obj = null;

        String result = switch (obj){
            case String s -> "String: " + s.toLowerCase();
            case Integer i -> "Integer" + i;
            case null -> "It is null";
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
