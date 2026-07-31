public class VolatileExample {
    
    private static boolean keepRunning = true;
    public static void main(String[] args) throws InterruptedException {
        

        Thread t1 = new Thread(() -> {
            while(keepRunning){
                // System.out.println("I am still running");
                IO.print("still running");
            }

            System.out.println("Finished running");
        });
        t1.start();


        Thread.sleep(1000);
        keepRunning = false;


        System.out.println("Main thread has reached the end of main");
        

        // Runnable task = () -> {
          
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }

        //     // int i = 0;
        //     // while(true){
        //     //     i++;
        //     // }


        //     System.out.println("Reached end of t1");
        // };

        // Thread t1 = new Thread(task);
        // System.out.println(t1.getState());

        // t1.start();
        // Thread.sleep(2);
        // System.out.println(t1.getState());

        // Thread.sleep(2000);
        // System.out.println(t1.getState());

        // // t1.start();
        // new Thread(task).start();




        





    }
}
