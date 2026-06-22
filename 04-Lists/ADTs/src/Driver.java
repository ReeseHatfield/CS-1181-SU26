import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Driver {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();
        myStack.push("Alice");
        myStack.push("Bob");
        myStack.push("Charlie");
        myStack.push("Derek");


        String next = myStack.pop();
        System.out.println(next);

        next = myStack.pop();

        System.out.println(next);

        System.out.println(myStack.peek());

        myStack.push("Hello");
        myStack.peek();
        System.out.println(myStack.pop());


        System.out.println(matchingParens("((()))"));
        System.out.println(matchingParens("((()"));
        System.out.println(matchingParens("()()((()))"));
        System.out.println(matchingParens("()()((())"));
        // System.out.println(matchingParens("))(("));


        while(!myStack.isEmpty()){
            String cur = myStack.pop();

            System.out.println(cur);
        }

        methodA();


        Queue<String> q1 = new LinkedList<>();
        q1.offer("Alice");
        q1.offer("Bob");
        q1.offer("Charlie");

        Queue<String> q2 = new LinkedList<>();
        q2.offer("Hello");
        q2.offer("World");


        Stack<Queue<String>> s1 = new Stack<>();
        s1.push(q1);
        s1.push(q2);


        System.out.println(s1.pop().poll());
    }


    public static boolean matchingParens(String input){


        Stack<Character> myStack = new Stack<>();

        for(Character c: input.toCharArray()){
            if(c.equals('(')){
                myStack.push(c);
            }
            else if(c.equals(')')){
                myStack.pop();
            }
            else {
                return false;
            }

        }

        return myStack.size() == 0;
    }


    public static void methodA(){
        methodB();
    }

    public static void methodB(){
        methodC();
    }

    public static void methodC(){
        
        try{
            methodD();
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }

    }

    public static void methodD(){
        throw new RuntimeException();
    }

}
