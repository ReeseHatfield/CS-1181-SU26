// generic => parameter, but for the type
// public class Student<T extends Number> {
public class Student<T extends Comparable<T>> {
    private T rank;
    private String name;
    private Item item;

    public Student(Student<T> other){
        this.name = new String(other.name);
        this.item = new Item(other.item);

        // this.names = new ArrayList<>(this.names)

        // this.rank.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
