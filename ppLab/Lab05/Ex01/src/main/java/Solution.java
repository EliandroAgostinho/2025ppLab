//import javax.swing.tree.TreeNode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static TreeNode flatten(ListNode head) {
        if (head == null) return null;

        // Usar TreeSet para valores únicos e ordenados
        Set<Integer> values = new TreeSet<>();
        ListNode current = head;

        while (current != null) {
            if (current.data != null) {
                collectTreeValues((TreeNode) current.data, values);
            }
            current = current.next;
        }

        if (values.isEmpty()) return null;

        // Construir a árvore em nível
        Iterator<Integer> it = values.iterator();
        TreeNode root = new TreeNode(it.next());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (it.hasNext()) {
            TreeNode node = queue.poll();

            if (it.hasNext()) {
                node.left = new TreeNode(it.next());
                queue.add(node.left);

                node.right = new TreeNode(it.next());
                queue.add(node.right);
            }

        }

        return root;
    }

    // Método renomeado para evitar conflito com javax.swing.tree.TreeNode
    private static void collectTreeValues(TreeNode node, Set<Integer> values) {
        if (node == null) return;
        values.add(node.value);
        collectTreeValues(node.left, values);
        collectTreeValues(node.right, values);
    }
}