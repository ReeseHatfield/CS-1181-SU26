import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Driver {
    public static void main(String[] args) {
        // List<String> list1 = new ArrayList<>();
        // List<String> list2 = new LinkedList<>();

        // foo(list1);

        Queue<String> q1 = new LinkedList<>();
        q1.offer("Alice");
        q1.offer("Bob");
        q1.offer("Charlie");


        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }


        Stack<String> s1 = new Stack<>();
        s1.push("Alice");
        s1.push("Bob");
        s1.push("Charlie");

        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }

        class TaC {
            private int time;
        }

        Queue<TaC> waitingTrucks = new LinkedList<>();
        boolean isBlocked = false;
        // PQ<Event> events
        // initialize events with a bunch of 
        // TruckStart
        // TrainStart
        // TrainEnd

        // while(events not empty){
            
            // Event cur = events.poll()

            // if(cur instance TruckStart)
            // -> events.offer(new TaC(cur.time + some_fixed_amount))
            // else if (){
            // }
            // chain of if statments
            // offer a TruckEnd
            // handle a truck end
            // -> dont offer anything
    // }


        System.out.println();
        System.out.println();
        System.out.println();

        Map<String, String> favColors = new HashMap<>();
        favColors.put("Reese", "Black");
        favColors.put("Clarissa", "Purple");
        favColors.put("Bibek", "Grey");


        String reesesFav = favColors.get("Reese");
        System.out.println(reesesFav);

        Map<String, Number> favNumbers = new HashMap<>();

        favNumbers.put("Reese", 3.14);
        favNumbers.put("Bibek", 0);
        favNumbers.put("Clarissa", 2);
        System.out.println(favNumbers.get("Bibek"));

        System.out.println(favNumbers);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        System.out.println(numbers);
        System.out.println(numbers.contains(4));


        System.out.println(containsDuplicate("hello"));
        System.out.println(containsDuplicate("car"));


        review();
    }

    // 
    public static boolean containsDuplicate(String s){
        // double for loop
        // O(n ^ 2)

        // for(int i = 0; i < s.length(); i ++){
        //     for(int j = 0; j < s.length(); j ++){
        //         // if check
            
        //     }
        // }

        // O(N)
        Set<Character> chars = new HashSet<>();
        for(Character c: s.toCharArray()){
            chars.add(c);
        }

        return chars.size() != s.length();
    }

    public void foo(List<String> l){
        l.add(0, "hello");
    }

    public static void review(){
        // lambda expression

        class Task implements MyRunnable {

            @Override
            public void run(String s) {
                System.out.println("Hello world");
            }

        }



        // runThingTenTimes(new Task());

        // runThingTenTimes(new MyRunnable() {

        //     @Override
        //     public void run(String s) {
        //         System.out.println("hello world " + s);
        //     }
            
        // });

        // () -> {}

        runThingTenTimes((str) -> {
            System.out.println("Hello world " + str);
        });

        // runThingTenTimes(null);


        Item c1 = new Item("Baseball bat");
        // shallow copy
        // Item c2 = c1;


        Item c2 = new Item(c1);

        c2.setName("Tennis Racket");

        System.out.println(c1);

        Student s1 = new GradStudent("Reese");
        s1.goToClass();


    }

    public static void runThingTenTimes(MyRunnable r){
        for(int i = 0; i < 10; i ++){
            r.run("Reese");
        }
    }
}

interface MyRunnable {
    public void run(String s);
}

class Event {
    private double time;
    // time constructor
}

class TruckStart extends Event {
    // super cons. call
}

class TruckArriveAtCrossing extends Event {
    // super cons. call
}