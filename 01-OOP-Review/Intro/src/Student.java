import java.util.ArrayList;

public abstract class Student extends Object {
    private String name;
    public String getName() {
        return name;
    }

    private Double gpa;
    
    private ArrayList<String> classes = new ArrayList<>();

    public ArrayList<String> getClasses() {
        return classes;
    }

    public Student(String name){
        this.name = name;
    }

    public void addClass(String className){
        this.classes.add(className);
    }

    public void setGPA(double newGPA){
        this.gpa = newGPA;
    }

    public abstract void goToClass();

    // public void goToClass(){
    //     for(String c: this.classes){
    //         System.out.println(this.name + " goes to " + c);
    //     }
    // }
}
