public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;
    public int height;  // Adicionado para AVL

    public TreeNode(int value) {
        this.value = value;
        this.height = 1;  // Novo nó tem altura 1
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.height = 1 + Math.max(getHeight(left), getHeight(right));
    }

    // Método auxiliar para altura (trata null)
    public static int getHeight(TreeNode node) {
        return node == null ? 0 : node.height;
    }

    // Atualiza a altura do nó
    public void updateHeight() {
        this.height = 1 + Math.max(getHeight(left), getHeight(right));
    }

    // Método para imprimir a árvore (simplificado)
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("(empty tree)");
            return;
        }

        System.out.println("Tree (in-order):");
        inOrderTraversal(root);
        System.out.println("\n\nTree structure:");
        System.out.println("\n");
        printTreeHelper(root, 0);
    }

    private static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    private static void printTreeHelper(TreeNode node, int level) {
        if (node == null) return;

        printTreeHelper(node.right, level + 1);
        for (int i = 0; i < level; i++) System.out.print("    ");
        System.out.println(node.value + " (h:" + node.height + ")");
        printTreeHelper(node.left, level + 1);
    }
}
