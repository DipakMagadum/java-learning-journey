class TreeNode {

    int employeeId;
    TreeNode left;
    TreeNode right;

    public TreeNode(int employeeId) {

        this.employeeId = employeeId;

    }

}

public class TreeTraversalDemo {

    public static void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.employeeId + " ");

        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);

        System.out.print(root.employeeId + " ");

        inOrder(root.right);

    }

    public static void postOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.employeeId + " ");

    }

    public static void main(String[] args) {

        TreeNode ceo = new TreeNode(100);

        ceo.left = new TreeNode(50);
        ceo.right = new TreeNode(150);

        ceo.left.left = new TreeNode(25);
        ceo.left.right = new TreeNode(75);

        ceo.right.left = new TreeNode(125);
        ceo.right.right = new TreeNode(175);

        System.out.println("Preorder Traversal:");

        preOrder(ceo);

        System.out.println("\n");

        System.out.println("Inorder Traversal:");

        inOrder(ceo);

        System.out.println("\n");

        System.out.println("Postorder Traversal:");

        postOrder(ceo);

    }

}