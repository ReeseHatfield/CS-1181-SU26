public class Driver {
    public static void main(String[] args){
        Library lib = new Library();

        // NonFictionBook b1 = (NonFictionBook) lib.checkout();

        Book checkedOut = lib.checkout();

        if(checkedOut instanceof FictionBook){
            FictionBook temp = (FictionBook) checkedOut;

            System.out.println(temp);
        }
        else if(checkedOut instanceof NonFictionBook){
            NonFictionBook temp = (NonFictionBook) checkedOut;

            temp.renew();
        }
        else if(checkedOut instanceof Renewable){

            Renewable r = (Renewable) checkedOut;
            System.out.println(r);
        }



        NonFictionBook nfb1 = new NonFictionBook(8.7, "Democracy And Balance");

        // shallow copy
        // NonFictionBook nfb2 = nfb1;
        // nfb2.setTitle("CodeTalkers");

        NonFictionBook nfb2 = new NonFictionBook(nfb1.getDdNumber(), nfb1.getTitle());
        nfb2.setTitle("CodeTalkers");



        System.out.println(nfb1);
        
    }
}