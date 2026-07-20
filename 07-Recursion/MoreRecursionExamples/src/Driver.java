public class Driver {
    public static void main(String[] args){
        System.out.println(removeX("xx_java_xx"));
        System.out.println(removeX("xx_javxxxa_xx"));
        System.out.println(removeX("java_xx"));
        System.out.println(removeX("xxxxxxxxxxxxxxxx_jaxva_xx"));


        System.out.println(OccuranceCounter.countOccurances('x', "xx_javxxxa_xx"));
        System.out.println(OccuranceCounter.countOccurances('x', "xx_javxxxa_xx"));


        printTriangle(10);
        // printAsterix(15);

        System.out.println(insertAsterix("hello"));

        System.out.println(insertAsterix("aaa"));
    }

    public static String insertAsterix(String input){
        System.out.println("input is " + input);
        if(input.isEmpty()){
            return "";
        }
        
        if(input.length() == 1){
            return input;
        }

        char first = input.charAt(0);
        char second = input.charAt(1);

        if(first == second){
            // recursive step
            return "" + first + '*' + insertAsterix(input.substring(1));
        } 
        else {
            // recursive step
            return "" + first + insertAsterix(input.substring(1));
        }
    }

    public static void printAsterix(int num){
        if(num == 0){
            return;
        }

        System.out.print("* ");
        printAsterix(num - 1);
    }


    public static void printTriangle(int size){
        if(size == 0){
            // System.out.println("");
            return;
        }
        
        // print out size *s
        printAsterix(size);
        System.out.println();
        

        printTriangle(size - 1);

    }
    
    public static String removeX(String input){
        // base case
        if(input.length() == 0){
            return ""; 
        }
        
        // recursive step
        // well i dont know how to deal with the ENTIRE string
        char cur = input.charAt(0);

        if(cur == 'x'){
            // some kind of recursive call
            // String newString = input.substring(1);
            return removeX(input.substring(1));
        }
        else {
            // some kind of recursive call

            return cur + removeX(input.substring(1));
        }
    }
    
}