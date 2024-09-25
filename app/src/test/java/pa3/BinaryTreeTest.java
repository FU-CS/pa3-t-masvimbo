package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    
    @Test
    public void testAddSingleNode() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        assertEquals("1 ", tree.levelOrderTraversal());
    }

    @Test
    public void testAddMultipleNodes() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        assertEquals("1 2 3 ", tree.levelOrderTraversal());
    }

    // Tests for levelOrderTraversal()
    @Test
    public void testLevelOrderTraversalEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals("empty", tree.levelOrderTraversal());
    }

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals("1 2 3 4 5 6 7 ", tree.levelOrderTraversal());
    }

    // Tests for invert()
    @Test
    public void testInvert() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.invert();
        assertEquals("1 3 2 7 6 5 4 ", tree.levelOrderTraversal());
    }

    @Test
    public void testInvertEmptyTree() {
        BinaryTree tree = new BinaryTree();
        tree.invert();
        assertEquals("empty", tree.levelOrderTraversal());
    }

    // Tests for getHeight()
    @Test
    public void testGetHeight() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals(2, tree.getHeight());
    }

    @Test
    public void testGetHeightEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(-1, tree.getHeight());
    }
}
