public class MyLinkedList<T> {

    private Node<T> head;

    
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

    public void printList(){
        Node<T> current = head;

        while(current != null){

            System.out.println(current.data);
            current = current.next;
        }
    }

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
