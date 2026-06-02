import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Submission {
    public static void main(String[] args) {


        ArrayList<Integer> streamList = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            streamList.add(i);
        }

        // streams not on any test
        // streamList
        //     .stream()
        //     .map((e) -> e * 2)
        //     .map((e) -> e + 1)
        //     .forEach(e -> {
        //         System.out.println(e);
        //     });





        // lambda expression's fill out anonymouse inner class bodies
        Foo f = (a) -> { 
            System.out.println(a * 2);
        };

        f.doThing(5);



        System.out.println("hello world");
        Soda s1 = new Soda(4, 70);
        Soda s2 = new Soda(2, 60);
        Soda s3 = new Soda(1, 50);
        Soda s4 = new Soda(0, 40);

        // Foo f = new Foo() {

        //     @Override
        //     public void doThing() {


        //     }
            
        // };

        ArrayList<Soda> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // named inner class
        class SweetnessLevelSodaComp implements Comparator<Soda> {

            @Override
            public int compare(Soda s1, Soda s2) {

                if (s1.getSweetnessLevel() < s2.getSweetnessLevel()) {
                    return +1;
                } else if (s1.getSweetnessLevel() > s2.getSweetnessLevel()) {
                    return -1;
                } else {
                    return 0;

                }
            }

        }

        // anonymous inner type
        // Collections.sort(list, new Comparator<Soda>(){

        //     @Override
        //     public int compare(Soda s1, Soda s2) {
        //         if (s1.getSweetnessLevel() < s2.getSweetnessLevel()) {
        //             return +1;
        //         } else if (s1.getSweetnessLevel() > s2.getSweetnessLevel()) {
        //             return -1;
        //         } else {
        //             return 0;
        //         }

        //     }

        // });

        Collections.sort(list, (compSoda1, compSoda2) -> {
            if (compSoda1.getSweetnessLevel() < compSoda2.getSweetnessLevel()) {
                return +1;
            } else if (compSoda1.getSweetnessLevel() > compSoda2.getSweetnessLevel()) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println(list);

    }


    public static void foo(){
        // new SweetnessLevelSodaComp();
    }
}

// (name) outer class
// comparable -> natural ordering
class Soda implements Comparable<Soda> {
    private int calories;
    private int sweetnessLevel;

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public Soda(int sweetnessLevel, int calories) {
        this.sweetnessLevel = sweetnessLevel;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "(" + this.sweetnessLevel + ": " + this.calories + ")";
    }

    @Override
    public int compareTo(Soda other) {
        if (this.calories < other.calories) {
            return -1;
        } else if (this.calories > other.calories) {
            return +1;
        } else {
            return 0;
        }

    }

}