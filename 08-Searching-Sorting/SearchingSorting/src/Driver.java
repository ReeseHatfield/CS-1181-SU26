import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args){

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Charlie");
        myList.add("Bob");
        myList.add("Derek");
        myList.add("Eli");
        myList.add("Alice");



        System.out.println(myList.indexOf("sjdfhsdf"));

        // for every item in list
            // if item is targe
            // return indez

        ArrayList<Integer> unsorted = new ArrayList<>();
        unsorted.add(13);
        unsorted.add(5);
        unsorted.add(11);
        unsorted.add(9);
        unsorted.add(19);
        unsorted.add(16);
        unsorted.add(1);
        unsorted.add(25);

        

        // System.out.println(binarySearch(unsorted, 89));
        System.out.println(unsorted);

        ArrayList<Integer> l1 = createRandom();
        ArrayList<Integer> l2 = createRandom();

        System.out.println("Attempting Merge Sort");
        System.out.println(mergeSort(l1));

        System.out.println("Attempting Bubble Sort");
        System.out.println(bubbleSort(l2));

        // Collections.sort(null);


    }

    public static ArrayList<Integer> createRandom() {

        ArrayList<Integer> list = new ArrayList<>();
        Random rng = new Random();
        for(int i = 0; i < 100_000; i ++){
            list.add(rng.nextInt(0, 1000));
        }

        return list;
    }

    public static List<Integer> mergeSort(List<Integer> list){

        if(list.size() == 1){
            return list;
        }

        int mid = list.size() / 2;

        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);


        return merge(left, right);

    }


    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
        ArrayList<Integer> copy = new ArrayList<>(list);

        for(int i = 0; i < copy.size(); i ++){

            for(int j = 0; j < copy.size() - 1; j++){

                if(copy.get(j) > copy.get(j+1)){
                    Collections.swap(copy, j, j+1);
                }
            }
        }

        return copy;
    }

    public static int binarySearch(ArrayList<Integer> list, int target){
        return binarySearch(list, target, 0, list.size() - 1);
    }


    // binary Search
    public static int binarySearch(ArrayList<Integer> list, int target, int left, int right){

        int mid = (left + right) / 2;


        if(list.get(mid) == target){
            return mid;
        }

        if(left > right){
            return -1;
        }

        if(list.get(mid) > target ){
            return binarySearch(list, target, left, mid - 1);
        }
        else {
            return binarySearch(list, target, mid + 1, right);
        }

    }


     // O(n) merge two sorted lists
    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0; 
        int j = 0; 

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}