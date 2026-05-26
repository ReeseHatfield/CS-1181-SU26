public class Coffee extends Object implements Comparable<Coffee> {
    private String flavor;
    private double price;

    public Coffee(String flavor, double price){
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public int compareTo(Coffee other){
        return this.flavor.compareTo(other.flavor);

        // if(this.price > other.price){
        //     return +1;
        // }
        // else if(this.price < other.price){
        //     return -1;
        // }
        // else {
        //     return 0;
        // }

    }

    @Override
    public String toString(){
        return "[" + this.flavor + ": " + this.price + "]";
    }
}
