public class AVLTest {
    public static void main(String[] args) {
        // Test case 1: Left rotation
        TreeNode root1 = null;
        int[] values1 = {10, 20, 30};
        System.out.println("\nTest case 1: Left rotation needed [10, 20, 30]");
        for (int val : values1) {
            root1 = AVLOperations.insert(root1, val);
        }
        TreeNode.printTree(root1);

        // Test case 2: Right rotation
        TreeNode root2 = null;
        int[] values2 = {30, 20, 10};
        System.out.println("\nTest case 2: Right rotation needed [30, 20, 10]");
        for (int val : values2) {
            root2 = AVLOperations.insert(root2, val);
        }
        TreeNode.printTree(root2);

        // Test case 3: Double rotation
        TreeNode root3 = null;
        int[] values3 = {30, 10, 20};
        System.out.println("\nTest case 3: Double rotation needed [30, 10, 20]");
        for (int val : values3) {
            root3 = AVLOperations.insert(root3, val);
        }
        TreeNode.printTree(root3);

        // Test case 4: Multiple inserts
        TreeNode root4 = null;
        int[] values4 = {5, 10, 15, 20, 25, 30};
        System.out.println("\nTest case 4: Multiple inserts [5, 10, 15, 20, 25, 30]");
        for (int val : values4) {
            root4 = AVLOperations.insert(root4, val);
        }
        TreeNode.printTree(root4);
    }
}
