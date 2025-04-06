public class SolutionTest {
    public static void main(String[] args) {
        // Criar árvores de teste
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));

        TreeNode tree2 = new TreeNode(5,
                null,
                new TreeNode(4));

        // Criar lista ligada de árvores
        ListNode listHead = new ListNode(tree1, new ListNode(tree2));

        // Achatar a lista e imprimir
        TreeNode flattenedTree = Solution.flatten(listHead);
        TreeNode.printTree(flattenedTree);
    }
}

