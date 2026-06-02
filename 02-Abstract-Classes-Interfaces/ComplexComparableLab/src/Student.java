public class Student implements Comparable<Student> {
    private int foo = 5;
    private int bar = 6;
    @Override
    public int compareTo(Student other) {
        if(this.foo > other.foo){
            return 1;
        }
        else if(this.foo < other.foo){
            return -1;
        }
        else {
            return 0;
            // if else if else bar
        }
    }


}
