public abstract class Book implements Chargeable {
    private double ddNumber;
    public void setDdNumber(double ddNumber) {
        this.ddNumber = ddNumber;
    }


    private String title;
    public void setTitle(String title) {
        this.title = title;
    }


    private int daysLeftOnLoan;
    
    public int getDaysLeftOnLoan() {
        return daysLeftOnLoan;
    }

    public void setDaysLeftOnLoan(int daysLeftOnLoan) {
        this.daysLeftOnLoan = daysLeftOnLoan;
    }

    public Book(double ddNumber, String title){
        this.ddNumber = ddNumber;
        this.title = title;
        this.daysLeftOnLoan = 10;
    }

    public double getDdNumber() {
        return ddNumber;
    }


    public String getTitle() {
        return title;
    }

}