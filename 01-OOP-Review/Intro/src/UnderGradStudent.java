public class UnderGradStudent extends Student {
    public UnderGradStudent(String name){
        super(name);

        super.setGPA(3.5);
    }

    @Override
    public void goToClass() {
        super.addClass("CS-2200");
        super.addClass("CS-1181");

        for(String c: super.getClasses()){
            System.out.println(super.getName() + " attends " + c);
        }
    }

    
}
