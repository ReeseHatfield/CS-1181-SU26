// public class Pair<T1, T2> {
//     private Box<T1> box1;
//     private Box<T2> box2;

//     public Pair(T1 e1, T2 e2){
//         this.box1 = new Box<>(e1);
//         this.box2 = new Box<>(e2);
//     }

//     public T1 getFirst(){
//         return this.box1.getValue();
//     }

//     public T2 getSecond(){
//         return this.box2.getValue();
//     }
// }


public class Pair<T1 extends Number, T2> {
    private T1 element1;
    private T2 element2;

    public Pair(T1 e1, T2 e2){
        this.element1 = e1;
        this.element2 = e2;
    }

    public T1 getFirst(){
        return this.element1;
    }

    public T2 getSecond(){
        return this.element2;
    }

    @Override
    public String toString(){
        // will only work with a String type bound
        // return this.element1.charAt(0) + ":" +this.element2;

        return this.element1.toString();

        // if(this.element1 instanceof Object){

        // }
    }
}