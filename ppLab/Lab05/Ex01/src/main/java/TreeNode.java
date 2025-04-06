import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int value) {
        this(value, null, null);
    }

    // Método para imprimir a árvore em nível (BFS)
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("(Árvore vazia)");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.value + " ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        System.out.println();
    }
}
