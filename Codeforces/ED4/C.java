import java.util.Stack;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        char[] map = new char[256];
        map['['] = ']';
        map['<'] = '>';
        map['{'] = '}';
        map['('] = ')';

        for (char c : s) {
            if (c == '{' || c == '(' || c == '<' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                count = Integer.MIN_VALUE;
            } else {
                char top  = stack.pop();
                if (map[top] != c) count += 1;
            }
        }

        if (count < 0 || !stack.isEmpty()) {
        System.out.println("Impossible");
        } else {
            System.out.println(count);
        }
    }
}
