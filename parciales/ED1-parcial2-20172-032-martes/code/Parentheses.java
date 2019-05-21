
/**
 * Write a description of class hola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
    public class Parentheses {
    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';


    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if      (s.charAt(i) == L_PAREN)   stack.push(L_PAREN);


            else if (s.charAt(i) == R_PAREN) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_PAREN) return false;
            }

            // ignore all other characters

        }
        return stack.isEmpty();
    }
}