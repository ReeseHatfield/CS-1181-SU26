public class Faculty implements Commuter, Grader{

    @Override
    public void commuteToWright(Vehicle v) {
        System.out.println("Drive to work");
    }

    @Override
    public void gradeAssignment() {
        System.out.println("Grades your code");
    }
    
}
