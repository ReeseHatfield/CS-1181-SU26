public class CounterExample {
    
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        
        Runnable task = () -> {

            for(int i = 0; i < 1000; i ++){
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
    }
}


class Counter {
    private int value = 0;


    public synchronized void increment(){
        this.value += 1;
    }


    public int getValue(){
        return this.value;
    }

}
