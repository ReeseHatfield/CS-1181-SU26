public class CustomArrayList {
    // arrays must know their size

    private Object[] arr = new Object[10];

    public void add(Object o){
        // if( array is full)
        // make new array of size 20
        // copy all values over

        // then actually add it
        arr[0] = o;
    }

    public Object getFirst(){
        return arr[0];
    }
    // public void add(int i){
    //     // if( array is full)
    //     // make new array of size 20
    //     // copy all values over

    //     // then actually add it
    // }
}
