import java.util.Stack;

public class reversestack{

    // Insert an element at the bottom of stack s
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Hold the top element
        int top = s.pop();
        // Recurse to insert data at bottom
        pushAtBottom(s, data);
        // Push the held top element back
        s.push(top);
    }

    // Reverse the stack s using recursion
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original stack: " + s);

        reverse(s);

        System.out.println("Reversed stack:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

    