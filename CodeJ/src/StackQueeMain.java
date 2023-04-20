import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;

public class StackQueeMain {
    public static void main(String[] args){
        System.out.println("Stack");
        Stack<Integer> x=new Stack<>();
        x.push(2);
        x.push(55);
        x.push(3);
        System.out.println(x.peek());
        System.out.println(x.size());
        System.out.println(x.pop());
        System.out.println(x.peek());

        System.out.println("Queue");
        Queue<Integer> q=new ArrayDeque<>();
        System.out.println(q);
        q.add(5);
        q.add(4);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q);
        q=null;
        System.out.println(q);
    }
}
