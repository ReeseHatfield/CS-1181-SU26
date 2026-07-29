public class AdderThread extends Thread {
    private int start;
    private int end;
    private int id;

    public AdderThread(int id, int start, int end){

        System.out.println("Thread: " + id + " " + start + "-" + end);
        this.start = start;
        this.end = end;
    }

    private int sum;

    public int getSum(){
        if(!isFinished){
            throw new RuntimeException("Invliad thread state");
        }
        
        return sum;
    }

    private boolean isFinished = false;

    @Override
    public void run(){

        for(int i = start; i < end; i++){
            this.sum += i;
        }

        this.isFinished = true;


    }
}
