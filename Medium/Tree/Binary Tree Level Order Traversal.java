import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> adjlist = new LinkedList<List<Integer>>();

        if (root == null)
            return adjlist;
        q.add(root);

        while (!q.isEmpty()) {
            int level = q.size();

            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < level; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }

                sublist.add(q.poll().val);
            }

            adjlist.add(sublist);
        }

        return adjlist;
    }
}