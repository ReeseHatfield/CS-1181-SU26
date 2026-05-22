public class GradStudent extends Student implements Commuter {
    
    public String advisor;
    
    public GradStudent(String name, String advisor){
        this.advisor = advisor;
        super(name);

        super.setGPA(3.0);
    }

    @Override
    public void goToClass() {
        super.addClass("CS-7200");
        super.addClass("CS-7110");

        for(String c: super.getClasses()){
            System.out.println(super.getName() + " attends " + c);
        }
    }

    @Override
    public void commuteToWright(Vehicle v) {
        System.out.println("Commutes to wright state");
        v.drive();
    }

}
