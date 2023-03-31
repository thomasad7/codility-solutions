package codility.stacksqueues;

import java.util.Stack;

public class Nesting {
    
	public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
    
}
