package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    
    @Test
    public void testEnqueueSingleNode() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        queue.enqueue(node1);
        assertEquals(node1, queue.dequeue());
    }

    @Test
    public void testEnqueueMultipleNodes() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue()); 
        assertEquals(node2, queue.dequeue()); 
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    
    @Test
    public void testDequeueEmpty() {
        Queue queue = new Queue();
        assertEquals(null, queue.dequeue()); 
    }

    @Test
    public void testDequeueFirst() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        Node node3 = new Node(6);
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);
        assertEquals(node1, queue.dequeue());
    }

    @Test
    public void testIsEmptyAfterAllDequeues() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
