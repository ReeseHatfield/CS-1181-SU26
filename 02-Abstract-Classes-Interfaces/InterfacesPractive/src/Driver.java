import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Coffee c1 = new Coffee("Mocha", 5.00);
        Coffee c2 = new Coffee("Cappacino", 3.00);
        Coffee c3 = new Coffee("Breve", 3.50);
        Coffee c4 = new Coffee("Americano", 4.00);

        List<String> myList = new ArrayList<>(); 

        ArrayList<Coffee> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        Collections.sort(list);

        System.out.println(list);


        LogList ll = new LogList();
        ll.addLog("Event 1 occured");
        // ll.remove(0);
        ll.addLog("Event 2 occured");
        ll.addLog("Event 3 occured");
        ll.addLog("Event 4 occured");
        ll.addLog("Event 5 occured");
        ll.printEveryOther();


    }
}
