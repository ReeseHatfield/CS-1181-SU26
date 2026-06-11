
// public class Box<T> {
    
//     private T value;

//     public Box(T thingToHold){
//         this.value = thingToHold;
//     }

//     public T getValue(){
//         return this.value;
//     }
// }


// first time T is used (after the class name)
// -> generic declaration
public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{
    
    private T value;

    public Box(T thingToHold){
        this.value = thingToHold;
    }

    public T getValue(){
        return this.value;
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString(){
        return this.value.toString();
    }
}
