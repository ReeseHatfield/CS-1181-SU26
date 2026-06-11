import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        foo(list);
        foo(new ArrayList<String>());
        list.add("hello world");
        // list.add(4);

        list.get(0);


        // 32 * 5
        int[] arr = new int[5];

        Box<String> b1 = new Box<>("hello");


        Box<Integer> b2 = new Box<>(1);

        Box<Double> b3 = new Box<Double>(3.0);

        // Pair<Box<Integer>, String> p1 = new Pair<>(new Box<Integer>(4), "world");

        // Pair<Integer, ArrayList<String>> p2 = new Pair<>(4, new ArrayList<String>());

        // Pair<String, Integer> p3 = new Pair<String,Integer>("hello", 8);
        // System.out.println(p3);

        Pair<Double, String> p5 = new Pair<Double,String>(4.0, "reese");

        Pair<Integer, String> p6 = new Pair<Integer,String>(4, "reese");

        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();

        ArrayList<Box<Integer>> allBoxes = new ArrayList<>();
        allBoxes.add(new Box<Integer>(1));
        allBoxes.add(new Box<Integer>(6));
        allBoxes.add(new Box<Integer>(2));
        allBoxes.add(new Box<Integer>(4));
        allBoxes.add(new Box<Integer>(5));
        allBoxes.add(new Box<Integer>(3));

        Collections.sort(allBoxes);
        System.out.println(allBoxes);

        // Box<NonCompType> temp = new Box<NonCompType>();
        // l2.get(0).get(0);
    }

    public static void foo(ArrayList<String> list){
        // implementation
    }
}