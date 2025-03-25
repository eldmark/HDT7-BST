package hdt7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeSearchTest {
    private BinaryTree<Integer> tree;

    @BeforeEach
    void setup() {
        tree = new BinaryTree<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
    }

    @Test
    void testSearchValoresExistentes() {
        assertEquals(50, tree.search(50));
        assertEquals(30, tree.search(30));
        assertEquals(70, tree.search(70));
        assertEquals(20, tree.search(20));
        assertEquals(40, tree.search(40));
        assertEquals(60, tree.search(60));
        assertEquals(80, tree.search(80));
    }

    @Test
    void testSearchValoresNoExistentes() {
        assertNull(tree.search(25));
        assertNull(tree.search(90));
        assertNull(tree.search(10));
    }
}