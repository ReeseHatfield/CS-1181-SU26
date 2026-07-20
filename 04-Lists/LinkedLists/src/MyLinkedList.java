public class MyLinkedList<T> {

    private Node<T> head;

    
    // O(n)
    public void add(T elemToAdd){
        Node<T> addMe = new Node<>(elemToAdd);

        if(head == null){
            this.head = addMe;
            return;
        }

        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        // current should now be the last

        current.next = addMe;

    }

    // O(1)
    public void prepend(T elemToAdd){

    }

    // a function would take O(n^2)
    public void doThing(){
        // pretend this was the real size
        int size = 10;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j++){
                System.out.println("hello");
            }
        }
    }

    public void printList(){
        Node<T> current = head;

        while(current != null){

            System.out.println(current.data);
            current = current.next;
        }
    }

    // O(n)
    public T get(int index){

        Node<T> current = this.head;
        for(int i = 0; i < index; i ++){
            current = current.next;
        }

        return current.data;
    }

    // doesnt consider IOOB, head being null
    public void insert(T thingToInsert, int index){
        Node<T> addMe = new Node<>(thingToInsert);

        Node<T> current = this.head;
        for(int i = 0; i < index - 1; i ++){
            current = current.next;
        }

        addMe.next = current.next;
        current.next = addMe;

    }
}
