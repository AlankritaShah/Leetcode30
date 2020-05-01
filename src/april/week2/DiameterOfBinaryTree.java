package april.week2;

/**
 * 
@author alankrita
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 *
 */

public class DiameterOfBinaryTree {
	int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int h = getDiameter(root);
        return diameter;
    }
    
    private int getDiameter(TreeNode root){
        if(root == null)
            return -1;
        int left = getDiameter(root.left) + 1;
        int right = getDiameter(root.right) + 1;
        
        diameter = Math.max(diameter, left+right);
        
        return Math.max(left, right);
    }
    
    public static class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
    
    public static void main(String [] args)
	{
    	TreeNode node = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(5);
    	
    	node.left = node2;
    	node.right = node3;
    	
    	node2.left = node4;
    	node2.right = node5;
    	
		System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(node));
	}
}
