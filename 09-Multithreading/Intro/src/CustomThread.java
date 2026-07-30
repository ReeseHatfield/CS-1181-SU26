public class CustomThread extends Thread {

    private int id;

    public CustomThread(int id){
        this.id = id;
    }



    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Thread " + this.id + ": " + i);
        }
    }
}
