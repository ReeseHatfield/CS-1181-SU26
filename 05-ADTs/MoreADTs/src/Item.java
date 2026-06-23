public class Item {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(Item other){
        this.name = new String(other.name);
    }

    @Override
    public String toString(){
        return "Item: " + this.name;
    }
}
