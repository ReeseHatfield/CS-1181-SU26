public class Driver {
    public static void main(String[] args) {
        System.out.println("hello world");

        // String s1 = new String("Reese");
        // goToClass(s1);

        Student s1 = new Student("Reese");
        // s1.goToClass();
    
        // declared type (left side)
        // actual type (runtime type, right side)
        Object s2 = new Student("Greg");


        StudentProcessor sp = new StudentProcessor();
        StudentProcessor.goToClass(s2);
        
    }



    
}