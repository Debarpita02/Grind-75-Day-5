class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertTreeLogic(root);
        return root;   
    }
    public void invertTreeLogic(TreeNode root) {
        if(root == null) {
            return;
        } else {

            invertTreeLogic(root.left);
            invertTreeLogic(root.right);

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}