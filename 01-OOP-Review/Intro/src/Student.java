import java.util.ArrayList;

public class Student extends Object {
    public String name;
    public Double gpa;
    public ArrayList<String> classes;

    public Student(String name){
        this.name = name;
        this.gpa = 3.0;

        this.classes = new ArrayList<>();
        this.classes.add("CS-1181");
        this.classes.add("CS-2200");
    }

    // public void goToClass(){
    //     for(String c: this.classes){
    //         System.out.println(this.name + " goes to " + c);
    //     }
    // }
}
