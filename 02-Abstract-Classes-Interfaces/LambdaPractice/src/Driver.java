import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // outer classes
        // named classes

        // class Foo {

        // }

        // new Foo();

        // Lambda expressions

        // new ArrayList<>(50);


        System.out.println(transformValue(new AddTwo()));

        System.out.println(transformValue(new MathTransformation(){

            @Override
            public int transform(int i) {
                return i + 3;   
            }
            
        }));

        MathTransformation mt1 = (i) -> {
            return i + 4;
        };

        System.out.println(transformValue((i) -> {
            return i + 5;
        }));

        MathTransformation mt2 = i -> i + 6;


        System.out.println();
        System.out.println();
        System.out.println();


        // instantiate list via ... = new List();
        // list.apply(new MathTransformation)
        // list.apply(i -> i + 2))

        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 20; i ++){
            myList.add(i);
        }

        // at a much later point

        // MathList ml = new MathList(myList);
        // ml.apply((e) -> {
        //     return e + 3;
        // });
        ArrayList<Integer> newList = new MathList(myList)
            .apply(i -> i + 2)
            .apply(i -> i * 2)
            .apply(i -> i + 10)
            .toArrayList();


        System.out.println(newList);

        System.out.println();
        System.out.println();
        System.out.println();

        CustomArrayList cal = new CustomArrayList();
        cal.add(3);
        // cal.add("Reese");

        // ....

        
        String s = (String) cal.getFirst();

        ArrayList<String> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        // ... add a bunch of values

        // Integer s1 = l1.get(0);
    }

    public static int transformValue(MathTransformation mt){
        int a = 5;

        return mt.transform(a);
    }
}