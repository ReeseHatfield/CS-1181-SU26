import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {
    public static void main(String[] args) {
        // ArrayList<String> al = new ArrayList<>();
        // LinkedList<String> ll = new LinkedList<>();
        // ll.add(null)

        Queue<String> q = new ArrayDeque<>();

        q.offer("Hello");
        q.offer("World");
        q.offer("my");
        q.offer("name");
        q.offer("is");
        q.offer("Reese");

        System.out.println(q.peek());

        String temp = q.poll();
        System.out.println(temp);

        System.out.println(q.poll());

        PriorityQueue<Event> pq = new PriorityQueue<>();
        pq.offer(new Event(6));
        pq.offer(new Event(3));
        pq.offer(new Event(5));
        pq.offer(new Event(0));
        pq.offer(new Event(1));

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        




    }
}