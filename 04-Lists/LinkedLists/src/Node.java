public class Node<T> {
    public T data;
    public Node<T> next;

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data){
        this.data = data;
    }

    

}
