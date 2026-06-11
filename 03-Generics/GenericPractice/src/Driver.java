import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Driver {
    public static void main(String[] args) {

        // Wildcards in generics
        

        int i = 5;
        // Collections

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Alice");
        l1.add("Bob");
        l1.add("Charlie");
        // printNumericalList(l1);

        // ListPrinter<String> printer = new ListPrinter<>();
        // printer.printList(l1);

        ArrayList<Double> l2 = new ArrayList<>();
        l2.add(1.0);
        l2.add(2.0);
        l2.add(3.0);
        // Driver.<Integer>printList(l2);
        System.out.println(sumNumericalList(l2));

        // ArrayList<?> l3 = new ArrayList<>();

        // l3.add(3.0);

        // ArrayList<? extends Number> l4 = new ArrayList<>();
        // l4.add(4.0);
        // l4.add(4);

        ArrayList<? super Number> l5 = new ArrayList<>();

        l5.add(4.0);
        // l5.add("Hello");
        l5.get(0);


        int i2 = 2;

        Object o1 = new Object();
        Object o2 = o1;

// ===============================================
        int[] myIntArray = new int[99];

        myIntArray[0] = 78;
        myIntArray[20] = 45;

        // int idx = 0;
        // for(int i = 0; i < idx; i ++){
        //     idx += 1;
        // }

        Node n1 = new Node("Alice");
        Object o3 = new Object();

        Node n2 = new Node("Bob");
        Node n3 = new Node("Charlie");

        n1.setNext(n2);
        n2.setNext(n3);

        System.out.println(n1.next.next.data);


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



}