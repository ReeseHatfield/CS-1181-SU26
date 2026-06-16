public class Event implements Comparable<Event>{
    private int time;

    

    public Event(int time) {
        this.time = time;
    }


    @Override
    public int compareTo(Event o) {
        if(this.time < o.time){
            return -1;
        }
        else if(this.time > o.time){
            return +1;
        }
        else {
            return 0;
        }
    }


    @Override
    public String toString(){
        return "Event: " + this.time;
    }


    
}
