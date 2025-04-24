public class BSTTest {
    public static void main(String[] args) {
        TreeNode root = null;
        int[] values = {20, 10, 30, 25, 35, 5, 15};

        // Insert
        for (int val : values) {
            root = BSTOperations.insert(root, val);
        }

        // Search
        System.out.println("Procura por 15: " + (BSTOperations.search(root, 15) != null ? "Encontrado" : "Não Encontrado"));
        System.out.println("Procura por 40: " + (BSTOperations.search(root, 40) != null ? "Encontrado" : "Não Encontrado"));

        // List in-order
        System.out.print("In-order traversal: ");
        BSTOperations.listInOrder(root);
        System.out.println();

        // Print tree structure
        TreeNode.printTree(root);
    }
}
