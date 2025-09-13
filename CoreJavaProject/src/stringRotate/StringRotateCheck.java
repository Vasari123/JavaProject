package stringRotate;

public class StringRotateCheck {

    public static boolean isRotate(String str1, String str2){
        if (str1.length() != str2.length())
            return false;
        String result = str1 + str1;
        return result.contains(str2);
    }
    public static void main(String[] args) {
        System.out.println(isRotate("abcde", "cdeab"));
        System.out.println(isRotate("abcde", "bdcae"));
    }
}
