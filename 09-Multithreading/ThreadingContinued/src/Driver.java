public class Driver {


    public static volatile boolean shouldKeepRunning = true;

    public static void main(String[] args) throws InterruptedException{
        // long startTime = System.currentTimeMillis();

        // new Thread(() -> {
        //     while(shouldKeepRunning){
        //         // System.out.println("h1");
        //     }
        //     System.out.println("T1 has finished");
        // }).start();

        // ...join() -> await



        // Thread.sleep(1000);
        // shouldKeepRunning = false;
        // System.out.println("Reached end of main");

        // long endTime = System.currentTimeMillis();

        // System.out.println(endTime - startTime);

        Counter c = new Counter();

        Runnable task = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.getValue());


        int value = 1;

        value++;

        value++;
        
        
    }
}