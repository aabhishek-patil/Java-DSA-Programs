import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
