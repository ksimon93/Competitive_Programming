import java.util.Scanner;
import java.util.Stack;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] cs = in.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(cs[i]);
                continue;
            }

            char prev = stack.peek();
            char curr = cs[i];

            if (curr == prev) {
                stack.pop();
            } else {
                stack.push(cs[i]);
            }
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.print(sb.reverse().toString());
    }
}
