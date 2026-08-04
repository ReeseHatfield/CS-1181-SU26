import java.util.ArrayList;
import java.util.List;

public class Driver {


    public static void main(String[] args) {
        // Student s1 = new Student("Alice");

        // // shallow copy
        // Student s2 = new Student(s1);
        // s2.setName("Bob");
        
        // System.out.println(s2);
        // System.out.println(s1);

        int total = countThreeTimesTheElevens(List.of(1, 2, 11, 25, 11, 15));

        System.out.println(total);

        Student<Integer> s1 = new Student<>("Alice");
        Student<Test> s2 = new Student<>("Bob");
        // Student<Double> s1 = new Student<>("Alice");
        // Student<Item> s2 = new Student<>("Bob");
        
        ArrayList<Student<?>> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);


        WorkerThread t1 = new WorkerThread();
        t1.start();

        Thread t2 = new Thread(new MyTask());
        t2.start();

       
        
        Thread t3 = new Thread(() -> {
            System.out.println("hello from lambda");
        });
        t3.start();

        class MyTaskNew implements Runnable {

            @Override
            public void run() {
                System.out.println("Hello from named INNER class");
            }

        }
        Thread t4 = new Thread(new MyTaskNew());
        t4.start();

        Thread t5 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello from anonymous inner class");
            }

        });
        t5.start();

        Thread t6 = new Thread(() -> {
            System.out.println("hello from lambda");
        });
        t6.start();



    }

    // recursion => 
    public static int countThreeTimesTheElevens(List<Integer> list){
        if(list.size() == 0){
            return 0;
        }

        // pretend I have a method that counts 11
        Integer fir = list.get(0);

        int total = 0;
        if(fir == 11){
            total = 1;
        }


        total += countThreeTimesTheElevens(list.subList(1, list.size()));
        // for(int i = 0; i < 3; i++){
        // }

        // new MyTaskNew();

        // here 
        // total should be right
        return total; 

    } 

    public void solveProblemNormally(){
        System.out.println("does something");
        // ...
    }
}