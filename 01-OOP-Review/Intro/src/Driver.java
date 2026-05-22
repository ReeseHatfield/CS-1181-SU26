public class Driver {
    public static void main(String[] args) {
        // System.out.println("hello world");

        // // String s1 = new String("Reese");
        // // goToClass(s1);

        // Student s1 = new Student("Reese");
        // // s1.goToClass();
    
        // // declared type (left side)
        // // actual type (runtime type, right side)
        // Object s2 = new Student("Greg");


        // // StudentProcessor sp = new StudentProcessor();
        // StudentProcessor.goToClass(new Student("Reese"));

        

        // // Vehicle car = new Vehicle();
        // Vehicle reeseVehicle = new Car();
        // Vehicle mattVehicle = new Truck();
        // FourWheeler gregsCar = new FourWheeler();

        // workOnVehicle(reeseVehicle);
        // workOnVehicle(mattVehicle);
        // workOnVehicle(gregsCar);

        // Vehicle v = new Car();

        // Vehicle v2 = new FourWheeler();
        // v2.drive();


        // reeseVehicle.drive();
        // mattVehicle.drive();

        // reeseVehicle.turn();


        // Vehicle myFourWheeler = new FourWheeler();


        // // myFourWheeler.driveOffRoad();
        // workOnVehicle(new FourWheeler());

        Student s = new GradStudent("Reese", "Dr. Wischgol");
        
        var gs = new GradStudent("Alice", "Bobby");

        s.goToClass();
    
        // Commuter c = new Faculty();
        // c.

        foo(new Faculty());
        foo(new GradStudent("Alice", "Bob"));

    }

    public static void foo(Commuter c){
        c.commuteToWright(new Car());
    }

    public static void workOnVehicle(Vehicle v){

        // FourWheeler temp = (FourWheeler) v;

        // temp.driveOffRoad();
        // (FourWheeler) v.driveOffRoad();

        v.drive();
    }


    
}