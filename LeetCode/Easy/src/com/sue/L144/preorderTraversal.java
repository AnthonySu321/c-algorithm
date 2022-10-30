package com.sue.L144;

//import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anthony
 * @create 2022-10-29 22:29
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
           this.left = left;
          this.right = right;
      }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root==null){
            return;
        }

        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);

    }
}

class Solution1{
    public static void main(String[] args) {
//        System.out.println(123123);
//        TreeNode t = new TreeNode(){1,null,2,3};
        StrToTreeNode strToTreeNode = new StrToTreeNode();
        TreeNode root = strToTreeNode.createTree("1,null,2,3");

        Solution s = new Solution();
        List<Integer> res = s.preorderTraversal(root);
        System.out.println(res);
    }
}
