package hdt7;

public class BinaryTree<E extends Comparable<E>> {
    private class Node {
        E data;
        Node left, right;

        Node(E data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(E data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, E data) {
        if (root == null) {
            return new Node(data);
        }
        
        int compareResult = data.compareTo(root.data);
        
        if (compareResult < 0) {
            root.left = insertRec(root.left, data);
        } else if (compareResult > 0) {
            root.right = insertRec(root.right, data);
        }        
        return root;
    }

    public E search(E key) {
        return searchRec(root, key);
    }

    private E searchRec(Node root, E key) {
        if (root == null) {
            return null;
        }
        
        int compareResult = key.compareTo(root.data);
        
        if (compareResult == 0) {
            return root.data;
        } else if (compareResult < 0) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
}