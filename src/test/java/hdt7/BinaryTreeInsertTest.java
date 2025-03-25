package hdt7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeInsertTest {
    private BinaryTree<Integer> intTree;
    private BinaryTree<String> stringTree;

    @BeforeEach
    void setup() {
        intTree = new BinaryTree<>();
        stringTree = new BinaryTree<>();
    }

    @Test
    void testInsertSearchInt() {
        intTree.insert(10);
        intTree.insert(5);
        intTree.insert(15);
        intTree.insert(3);
        intTree.insert(7);

        assertEquals(10, intTree.search(10));
        assertEquals(5, intTree.search(5));
        assertEquals(15, intTree.search(15));
        assertEquals(3, intTree.search(3));
        assertEquals(7, intTree.search(7));

        assertNull(intTree.search(20));
    }

    @Test
    void testInsertSearchString() {
        stringTree.insert("1");
        stringTree.insert("2");
        stringTree.insert("3");

        assertEquals("1", stringTree.search("1"));
        assertEquals("2", stringTree.search("2"));
        assertEquals("3", stringTree.search("3"));

        assertNull(stringTree.search("4"));
    }

    @Test
    void testInsertDuplicados() {
        intTree.insert(10);
        intTree.insert(10);
        intTree.insert(10);

        assertEquals(10, intTree.search(10));
    }
}