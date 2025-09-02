package interview;

import java.util.*;
import java.util.stream.Collectors;

public class BalancedStringCheck {
    public static boolean isBalanced(String input){
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()){
            if (ch =='(' || ch == '{' || ch == '['){
                 deque.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (deque.isEmpty()) return false;
                char top = deque.pop();
                if((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("()","{]","{}","({[]})","{])");
        Map<String, Boolean> map =  list.stream().collect(Collectors.toMap(e -> e, BalancedStringCheck::isBalanced));
        map.forEach((str, balanced) ->
                System.out.println(str + " -> " + (balanced ? "Balanced" : "Not Balanced")));
    }
}
