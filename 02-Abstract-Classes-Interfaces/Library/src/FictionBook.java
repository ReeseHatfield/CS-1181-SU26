public class FictionBook extends Book {
    private int cost = 5;
    
    public FictionBook(double ddNumber, String title){
        super(ddNumber, title);
    }

    @Override
    public int getCost(int age){
        if(age < 12){
            return 0;
        }


        return this.cost;
    }

}