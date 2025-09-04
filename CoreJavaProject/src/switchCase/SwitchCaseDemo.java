package switchCase;

public class SwitchCaseDemo {
    public static void switchBefore17(int num) {
        String result;
        switch (num) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            default:
                result = "Unknown";
                break;
        }
        System.out.println("Before 17 " + result);
    }

    public static void switchAfter17(int num) {

        String result = switch (num){
            case 1 -> "one";
            case 2 -> "Two";
            case 3 -> "three";
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
        System.out.println("Switch after 17 " + result);
    }

    public static void main(String[] args) {
        switchBefore17(1);
        switchAfter17(2);
    }
}
