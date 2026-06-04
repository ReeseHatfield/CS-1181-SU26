import java.util.ArrayList;

public class MathList {

    private ArrayList<Integer> internalList;

    public MathList(ArrayList<Integer> al){
        this.internalList = new ArrayList<>(al);
    }

    public MathList apply(MathTransformation mt){
        for(int i = 0; i < this.internalList.size(); i ++){
            // i = curent position that we are tranforming

            int newValue = mt.transform(this.internalList.get(i));

            this.internalList.set(i, newValue);
        }

        return this;

    }

    public ArrayList<Integer> toArrayList(){
        return this.internalList;
    }
}
