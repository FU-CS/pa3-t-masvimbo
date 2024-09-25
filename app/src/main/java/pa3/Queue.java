
package pa3;


/**
 * A queue of nodes.
 */
public class Queue {
    /** 
     * Constructs an empty queue.
     */
    public Node [] arr;
    private int tracker; 
    private int capacity;
    

    public Queue () {
        this.tracker = 0;
        this.capacity = 10;
        this.arr = new Node[capacity];
        
    }
    /**
     * Adds a node to the queue.
     * @param node
     */
    public void enqueue(Node node) {

        if (this.tracker >= this.capacity){
            this.arr[tracker] = node;
            tracker = tracker + 1;
        }
        else{
            this.capacity = this.capacity + 5;
            Node [] previous; 
            previous = this.arr;
            this.arr = new Node[this.capacity];
            
            for (int i = 0; i < this.tracker; i++){
                this.arr[i] = previous[i];
            }
        }
        this.arr[tracker] = node;
        this.tracker = this.tracker + 1;
    }


    /**
     * Removes and returns the node at the front of the queue.
     * @return the node at the front of the queue.
     */
    public Node dequeue() {

        if (this.tracker == 0) return null;
        
        Node firstnode = this.arr[0];
        for(int i = 0; i < this.tracker -1; i ++){
            this.arr[i] = this.arr[i+1];
        }

        this.tracker = this.tracker - 1;
    
        return firstnode; 
    }

    /**
     * Returns true if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        return this.tracker == 0;   
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(4);
        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.dequeue().value); // Should print 4
    }
    
}
