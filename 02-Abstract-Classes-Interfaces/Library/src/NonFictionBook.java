public class NonFictionBook extends Book implements Renewable {

    private int cost = 10;

    public NonFictionBook(double ddNumber, String title){
        super(ddNumber, title);
    }

    // copy constructor taking in another isntance of the object
    public NonFictionBook(NonFictionBook nfb){
        // this.property = other.property

        // super.setTitle(nfb.getTitle());
        // super.setDdNumber(nfb.getDdNumber());;

        super(nfb.getDdNumber(), nfb.getTitle());
    }

    @Override
    public int getCost(int age) {
        return cost;

    }

    @Override
    public void renew(){
        System.out.println("NF was renewed");
        super.setDaysLeftOnLoan(10);
    }

    public String toString(){
        return super.getTitle() + ": " + super.getDdNumber();
    }

}