public class OccuranceCounter {
    
    public static int countOccurances(char target, String s){
        return countOccurances(target, s, 0); 
    }
    
    private static int countOccurances(char target, String s, int foundOccurances){
        
        // base case
        if(s.isEmpty()){
            return foundOccurances;
        }
        
        
        char first = s.charAt(0);
        if(first == target){
            // found AN occurance
            // recursive step
            return countOccurances(target, s.substring(1), foundOccurances + 1);
        }
        else {
            // recursive steps
            return countOccurances(target, s.substring(1), foundOccurances);
        }

    }
}
