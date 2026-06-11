import java.util.ArrayList;

public class ListPrinter<T> {

    // private T[] arr = new T[10];
    private Object[] arr = new Object[10];
    
    public void printList(ArrayList<T> list){
        for(T cur: list){
            System.out.println(cur);
        }
    }

}
