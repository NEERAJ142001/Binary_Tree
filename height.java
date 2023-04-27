/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
       if(node==null)
       return 0;
       int left=height(node.left);
       int right=height(node.right);
       
       if(right>=left)
       return (right+1);
       else
       return (left+1);
    }
}
