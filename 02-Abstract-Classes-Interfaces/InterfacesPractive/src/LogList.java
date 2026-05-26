import java.util.ArrayList;
import java.util.List;

// public class LogList extends ArrayList<String>{

public class LogList {

    private ArrayList<String> logs = new ArrayList<>();


    /**
     * Adds a log to the list
     * @param logToAdd the log to add to the list
     */
    public void addLog(String logToAdd){
        logs.add(logToAdd);
        // super.add(logToAdd);
    }

    public void printEveryOther(){
        for(int i = 0; i < this.logs.size(); i += 2){
            System.out.println(this.logs.get(i));
        }
        // for(int i = 0; i < this.size(); i += 2){
        //     System.out.println(this.get(i));
        // }
    }
    
}
