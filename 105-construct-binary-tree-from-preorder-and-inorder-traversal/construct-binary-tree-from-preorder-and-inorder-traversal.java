class Solution {
    int idx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode solve(int[] pre, int[] in, int l, int r) {
        if (l > r) return null;

        TreeNode root = new TreeNode(pre[idx++]);

        int i = l;
        while (in[i] != root.val) i++;

        root.left = solve(pre, in, l, i - 1);
        root.right = solve(pre, in, i + 1, r);

        return root;
    }
}