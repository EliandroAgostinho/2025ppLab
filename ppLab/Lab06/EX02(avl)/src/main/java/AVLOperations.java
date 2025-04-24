public class AVLOperations {
    // Task 4: AVL Rotations

    // Single right rotation
    public static TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.updateHeight();
        x.updateHeight();

        return x;
    }

    // Single left rotation
    public static TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.updateHeight();
        y.updateHeight();

        return y;
    }

    // Get balance factor
    private static int getBalance(TreeNode node) {
        if (node == null) return 0;
        return TreeNode.getHeight(node.left) - TreeNode.getHeight(node.right);
    }

    // Task 5: Insert with AVL balancing
    public static TreeNode insert(TreeNode root, int value) {
        // Standard BST insertion
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        } else {
            return root; // Duplicates not allowed
        }

        // Update height
        root.updateHeight();

        // Get balance factor
        int balance = getBalance(root);

        // Perform rotations if needed

        // Left Left Case
        if (balance > 1 && value < root.left.value) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && value > root.right.value) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && value > root.left.value) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && value < root.right.value) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
}
