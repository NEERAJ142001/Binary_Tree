package love_babbar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node
{
    int data;
    node left;
    node right;

    node(int d){
        this.data=d;
        this.right=null;
        this.left=null;
    }
}
public class Binary_tree {
    node root;
    Binary_tree() {
        root=null;
    }
   private node buildatree(node root){
       Scanner sc=new Scanner(System.in);
        System.out.println("input a data");
        int data=sc.nextInt();
        root=new node(data);
        if(data==-1)
        {
            return null;
        }
       System.out.println("enter the element to insert in left side="+data);
        root.left=buildatree(root.left);
       System.out.println("enter the element to insert in right side="+data);
       root.right=buildatree(root.right);

       return root;
    }
    private  static void preorder(node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    private static void postorder(node root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    private static void levelorder(node root)
    {
        if(root==null)
            return;
        Queue<node> s=new LinkedList<>();
        s.add(root);
        s.add(null);

        while(!s.isEmpty())
        {
            node currentNode=s.remove();
            // null indicates the next line null==next line
            if(currentNode==null) {
                System.out.println();
                //its means all the elements is printed
                if (s.isEmpty())
                    break;
                //adding null to queue for printing next line
                else
                    s.add(null);
            }
            else {
                //printing the data of cuurent node
                System.out.println(currentNode.data + " ");
                //if left child is not null then we add left child into queue
                if (currentNode.left != null)
                    s.add(currentNode.left);
                ////if right child is not null then we add right child into queue
                if (currentNode.right != null)
                    s.add(currentNode.left);
            }
        }
        }

    public static void main(String[] args) {
        node root=null;
        Binary_tree x=new Binary_tree();
        root=x.buildatree(root);
        System.out.println(root);
        preorder(root);
        inorder(root);
    }

}
