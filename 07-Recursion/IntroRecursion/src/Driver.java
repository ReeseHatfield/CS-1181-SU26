import java.util.Scanner;

public class Driver {

    
    public static void main(String[] args){


        // Scanner scnr = new Scanner(System.in);
        // scnr.nextInt();
        // foo1();

        // System.out.println(countOccurances('l', "hello"));

        for(int i = 0; i < 50; i++){

            System.out.println(fibN(i));
        }   

    }


    public static int fibN(int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }


        // f(4) + f(3)
        // f(3) + f(2) + f(2) + f(1)
        // f(2) + f(1) + f(1) + f(0) + f(1) + f(0) + 1


        return fibN(n - 1) + fibN(n - 2);
    }

    public static int countOccurances(char target, String s){
        System.out.println("s " + s);
        System.out.println("target " + target);
        System.out.println();

        // base case
        if(s.isEmpty()){
            return 0;
        }


        char first = s.charAt(0);
        if(first == target){
            // found AN occurance
            // recursive step
            return 1 + countOccurances(target, s.substring(1));
        }
        else {
            // recursive steps
            return 0 + countOccurances(target, s.substring(1));
        }

    }

    public static void doThing(int timesRan){
        // some bit of code
        // System.out.println(timesRan);

        if(timesRan >= 3){
            return;
        }

        // prints something
        doThing(timesRan + 1);

    }

    public static void foo1(){
        foo2();

    }

    public static void foo2(){
        foo3();
    }

    public static void foo3(){
        foo4();
    }

    public static void foo4(){
        throw new RuntimeException();
    }
}