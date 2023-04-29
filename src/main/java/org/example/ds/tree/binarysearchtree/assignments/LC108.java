package org.example.ds.tree.binarysearchtree.assignments;


public class LC108 {

    TreeNode root;
    public LC108(){
        root = null;
    }

    public TreeNode insertNode(TreeNode node, int val){
        if(node == null){
            node = new TreeNode(val);
            return node;
        }
        if(val<node.val)
            node.left = insertNode(node.left,val);
        else if(val > node.val)
            node.right = insertNode(node.right,val);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        for(int i : nums)
            root = insertNode(root,i);
        return root;
    }

    void print(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println("value "+root.val);
            inOrder(root.right);
        }
    }

}
