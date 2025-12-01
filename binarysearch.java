

    import java.io.*;

class BST {

    // Tree Node
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Insert Node in BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    // Search an itemmmmmmm
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // Printigb  In-order Traversal
    public void inorder() {
        System.out.print("In-order: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Print Leaf Nodes
    public void printLeafNodes() {
        System.out.print("Leaf Nodes: ");
        printLeafRec(root);
        System.out.println();
    }

    private void printLeafRec(Node root) {
        if (root == null) return;

        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");

        printLeafRec(root.left);
        printLeafRec(root.right);
    }

    // Print Parent and Children of a given node
    public void printParentChild(int key) {
        printParentChildRec(root, null, key);
    }

    private void printParentChildRec(Node root, Node parent, int key) {
        if (root == null) {
            System.out.println("Item not found!");
            return;
        }

        if (root.data == key) {
            if (parent != null)
                System.out.println("Parent: " + parent.data);
            else
                System.out.println("Parent: None (This is the root)");

            System.out.println("Left Child: " + (root.left != null ? root.left.data : "None"));
            System.out.println("Right Child: " + (root.right != null ? root.right.data : "None"));
            return;
        }

        if (key < root.data)
            printParentChildRec(root.left, root, key);
        else
            printParentChildRec(root.right, root, key);
    }

    // Save BST In-order to a File
    public void saveToFile(String filename) {
        try {
            FileWriter fw = new FileWriter("bst.txt");
            saveInorder(root, fw);
            fw.close();
            System.out.println("BST saved to " + filename);
        } catch (Exception e) {
            System.out.println("Error saving file!");
        }
    }

    private void saveInorder(Node root, FileWriter fw) throws IOException {
        if (root != null) {
            saveInorder(root.left, fw);
            fw.write(root.data + " ");
            saveInorder(root.right, fw);
        }
    }
}

public class binarysearch {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

        System.out.println("Search 40: " + tree.search(40));
        System.out.println("Search 90: " + tree.search(90));

        tree.printLeafNodes();

        tree.printParentChild(30);
        tree.printParentChild(70);

        tree.saveToFile("bst.txt");
    }
}

    

