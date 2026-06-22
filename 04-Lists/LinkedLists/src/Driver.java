import java.util.ArrayList;
import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
        // Node n1 = new Node("Alice");
        // Object o3 = new Object();

        // Node n2 = new Node("Bob");
        // Node n3 = new Node("Charlie");

        // n1.setNext(n2);
        // n2.setNext(n3);

        // System.out.println(n1.next.next.data);

        // Node<String> n1 = new Node<String>("Hello");
        // Node<Integer> n2 = new Node<Integer>(5);
        // n1.setNext(n2);
    

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("Alice");
        myLinkedList.add("Bob");
        myLinkedList.add("Charlie");
        myLinkedList.add("Derek");
        myLinkedList.add("Eli");

        myLinkedList.insert("Hello", 3);

        myLinkedList.printList();

        // System.out.println(myLinkedList.get(0));

        // System.out.println(myLinkedList.get(7));

    }

    

    public static <T> void printList(ArrayList<T> list){
        for(T cur: list){
            System.out.println(cur);
        }

    }

    public static double sumNumericalList(ArrayList<? extends Number> list){


        double sum = 0.0;
        for(Number cur: list){
            sum += cur.doubleValue();
        }

        return sum;
    }


    // we want a way of charactering this function
    // divorced from actual speed
    // count operations
    // O(n)

    public static void foo(int n){

        // 1
        System.out.println("Hello world");

        // 1
        int sum = 0;


        // 1
        for(int i = 0; i < n; i++){
            sum += i;
        }
        // 3 * n

        // 1
        System.out.println(sum);
    }



}