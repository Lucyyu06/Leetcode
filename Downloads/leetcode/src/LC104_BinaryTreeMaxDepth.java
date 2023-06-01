
public class LC104_BinaryTreeMaxDepth {
    public static void main(String[] args) {
        // Test Case 1: Empty tree
        TreeNode tree1 = null;
        test(tree1, "Test Case 1");

        // Test Case 2: Tree with a single node
        TreeNode tree2 = new TreeNode(1);
        test(tree2, "Test Case 2");

        // Test Case 3: Tree with multiple nodes
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(3);
        tree3.left.left = new TreeNode(4);
        tree3.left.right = new TreeNode(5);
        test(tree3, "Test Case 3");

        // Add more test cases as needed
        TreeNode tree4 = new TreeNode(3);
        tree4.left = new TreeNode(9);
        tree4.right = new TreeNode(20);
        tree4.right.left = new TreeNode(15);
        tree4.right.right = new TreeNode(7);

        test(tree4, "Test Case 4");
    }

    private static void test(TreeNode root, String testCase) {
        LC104_BinaryTreeMaxDepth solution = new LC104_BinaryTreeMaxDepth();
        int result = solution.maxDepth(root);
        System.out.println(testCase + ": " + result);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
