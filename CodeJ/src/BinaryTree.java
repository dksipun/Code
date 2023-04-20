import java.util.*;
public class BinaryTree {
    public BinaryTreeNode root;

    public BinaryTree(){
        this.root=null;
    }
    public BinaryTree(int data){
        this.root=new BinaryTreeNode(data);
    }
    /* BinaryTree(List<Integer> nodeDataList) initializes the data members
       of BinaryTree using the given data slice */
    public BinaryTree(List<Integer> nodeDataList) {
        this.root = null;
        for (Integer nodeData : nodeDataList) {
            insert(nodeData);
        }
    }

    public void insert(int nodeData){
        BinaryTreeNode newNode=new BinaryTreeNode(nodeData);
        if (this.root==null){
            this.root=newNode;
        }else{
            BinaryTreeNode parent=null;
            BinaryTreeNode tempNode=this.root;
            while (tempNode!=null){
                parent=tempNode;
                if(nodeData<=tempNode.data){
                    tempNode=tempNode.left;
                }else {
                    tempNode=tempNode.right;
                }
            }
            if(nodeData<=parent.data){
                parent.left=newNode;
            }else {
                parent.right=newNode;
            }
        }
    }

    public int getSubTreeNodeCount(BinaryTreeNode node) {
        if(node==null){
            return 0;
        }else {
            return 1+getSubTreeNodeCount(node.left)+getSubTreeNodeCount(node.right);
        }
    }
}
