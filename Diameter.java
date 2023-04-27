class Solution {
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
    int diameter(Node root) {
        if(root==null)
        return 0;
        
        int left_part=diameter(root.left);
        int right_part=diameter(root.right);
        int combo=height(root.right) + height(root.left)+1;
        
        int ans=Math.max(left_part,(Math.max(right_part,combo)));
        return ans;
    }
}
