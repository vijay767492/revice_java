import java.util.Deque;
import java.util.ArrayDeque;

public class push_at_bottom {
    public static void pushAtBottom(Deque<Integer> s, int e) {
        Deque<Integer> temp = new ArrayDeque<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        s.push(e);
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        pushAtBottom(s, 5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}