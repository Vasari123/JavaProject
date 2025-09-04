package switchCase;

public class PatternSwitchExample {
    public static void main(String[] args) {
        Object obj = "AshokReddy";
        String result = switch (obj){
            case String s -> "String with length " + s.length();
            case Integer i -> "Integer with value" + i;
            case null -> "It is null";
            default -> "It is default";
        };
        System.out.println(result);
    }
}
