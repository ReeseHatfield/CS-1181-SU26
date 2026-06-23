public class GradStudent extends Student {

    public GradStudent(String name) {
        super(name);
    }

    @Override
    public void goToClass() {
        System.out.println("Goes to CS-7200");
    }
    
}
