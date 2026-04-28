import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> P = new Stack<>();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') { 
                P.push(c);
            }
            else if (c == ')') {
                if (P.isEmpty() || P.pop() != '(') {
                    return false;
                }
            }
            else if (c == ']') {
                if (P.isEmpty() || P.pop() != '[') {
                    return false;
                }
            }
            else if (c == '}') {
                if (P.isEmpty() || P.pop() != '{') {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        if (P.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
