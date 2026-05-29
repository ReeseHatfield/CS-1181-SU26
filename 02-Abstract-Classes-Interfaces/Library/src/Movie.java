public class Movie implements Renewable {
    private String title;
    private int daysLeftOnLoan = 10;


    public Movie(String title){
        this.title = title;
    }

    @Override
    public void renew() {
        this.daysLeftOnLoan = 10;
    }

    public String toString(){
        return "this is a movied titled: " + this.title;
    }
}
