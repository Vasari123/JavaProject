package stringRotate;

public class StringRotate {

    public static boolean areRotate(String str1, String str2){
        if (str1.length() != str2.length())
            return false;
        String doubled = str1+str1;
        return doubled.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(areRotate("abcd","cdab"));
        System.out.println(areRotate("abcd","acbd"));
    }
}
