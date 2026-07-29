import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("hello world");
        // int a = 5;
    
        // CustomThread t1 = new CustomThread(1);
        // t1.start();

        // CustomThread t2 = new CustomThread(2);
        // t2.start();


        // t1.join();
        // t2.join();

        
        // Thread t3 = new Thread(new MyTask());
        // t3.start();

        // t3.join();
        // System.out.println("Reached end of main");

        // int totalNumsToAdd = 101;
        // int numThreads = 4;

        // int chunkSize = totalNumsToAdd / numThreads;

        // ArrayList<AdderThread> threads = new ArrayList<>();
        // for(int i = 0; i < numThreads; i ++){

        //     int start = i * chunkSize;
        //     int end = start + chunkSize;

        //     if(i == numThreads - 1){
        //         end = totalNumsToAdd;
        //     }

        //     threads.add(new AdderThread(i, start, end));
        //     threads.get(i).start();
        // }

        
        // for(int i = 0; i < numThreads; i++){
        //     threads.get(i).join();
        // }

        // int totalSum = 0;
        // for(int i =0; i < numThreads; i++){
        //     totalSum += threads.get(i).sum;
        // }
        // System.out.println("Total: " + totalSum);

        Runnable task = () -> {

            while(shouldKeepRunning){
                System.out.println("Waiting on static boolean");
            }
        };

        Thread t1 = new Thread(task);
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                shouldKeepRunning = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();

    }

    public static volatile boolean shouldKeepRunning = true;

}