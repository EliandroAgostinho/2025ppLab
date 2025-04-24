public class BSTOperations {

    // Task 1: Insert Operation
    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        }
        else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        // Ignora valores duplicados

        return root;
    }

    // Task 2: Search Operation
    public static TreeNode search(TreeNode root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        return value < root.value
                ? search(root.left, value)
                : search(root.right, value);
    }

    // Task 3: List Nodes (in-order traversal)
    public static void listInOrder(TreeNode root) {
        if (root != null) {
            listInOrder(root.left);
            System.out.print(root.value + " ");
            listInOrder(root.right);
        }
    }
}
