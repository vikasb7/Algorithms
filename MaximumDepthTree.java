//Vikas Bhat
// Find Max depth of a binary tree

import java.util.LinkedList; 
import java.util.Queue;

import javax.swing.tree.TreeNode; 
public class MaximumDepthTree { 
       
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
    static class Node { 
        int key; 
        Node left, right; 
          
        // constructor 
        Node(int key){ 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    } 
    
    
    static Node root; 
    static Node temp = root; 

    public static int maxDepth(Node root2) {
        if(root2==null)
            return 0;
        
        if(root2.left==null && root2.right==null)
            return 1;
        
        int l= maxDepth( root2.left)+1;
        int r= maxDepth( root2.right)+1;
        
        System.out.println(r);
        
      
        return Math.max(l,r);
        
        
    }
    
    
       
 
    // Driver code 
    public static void main(String args[]) 
    { 
        root = new Node(3); 
        root.left = new Node(9); 
        root.right = new Node(20); 
        root.right.right = new Node(7); 
        root.right.left = new Node(15); 

        System.out.println(maxDepth(root));  
 
    } 
}