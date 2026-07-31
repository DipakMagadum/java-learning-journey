class Node {

    int rollNumber;
    Node left;
    Node right;

    public Node(int rollNumber) {

        this.rollNumber = rollNumber;

    }

}

public class BinarySearchTreeDemo {

    Node root;

    public Node insert(Node root, int rollNumber) {

        if (root == null) {

            return new Node(rollNumber);

        }

        if (rollNumber < root.rollNumber) {

            root.left = insert(root.left, rollNumber);

        } else if (rollNumber > root.rollNumber) {

            root.right = insert(root.right, rollNumber);

        }

        return root;

    }

    public boolean search(Node root, int rollNumber) {

        if (root == null) {

            return false;

        }

        if (root.rollNumber == rollNumber) {

            return true;

        }

        if (rollNumber < root.rollNumber) {

            return search(root.left, rollNumber);

        }

        return search(root.right, rollNumber);

    }

    public void inOrder(Node root) {

        if (root == null) {

            return;

        }

        inOrder(root.left);

        System.out.print(root.rollNumber + " ");

        inOrder(root.right);

    }

    public static void main(String[] args) {

        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");

        tree.inOrder(tree.root);

        System.out.println("\n");

        int searchRollNumber = 60;

        if (tree.search(tree.root, searchRollNumber)) {

            System.out.println(
                    "Roll Number " + searchRollNumber + " found."
            );

        } else {

            System.out.println(
                    "Roll Number " + searchRollNumber + " not found."
            );

        }

    }

}