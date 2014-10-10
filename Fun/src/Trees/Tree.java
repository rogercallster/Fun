package Trees;

import java.util.Stack;

//bst

public class Tree {
       TreeNode<Integer> head=null,parent;
       
	//insert a node
       boolean insert(int data){
    	   
    	if(head==null)head=new TreeNode<Integer>(data);
    	else{
    		TreeNode<Integer> temp=head,parent = null;
    		while(temp!=null){
    			parent=temp;
    			temp=(TreeNode<Integer>) (temp.data>data?temp.leftChild:temp.rightChild);
    		}
    	    if(((int) parent.data)>data) parent.leftChild=new TreeNode<Integer>(data);
    	    else parent.rightChild=new TreeNode<Integer>(data);
    	}
    	return true;
       }

	//delete a node
     //delete a node

       TreeNode<Integer> delete (TreeNode<Integer> root, int data){
    	   
    	   TreeNode <Integer> node=findNode(data);
    	   if(node==null)return node;
    	   else {
    		   TreeNode <Integer> parent=findParent(data);
    		   if(node.rightChild==null|| node.leftChild==null){
    			   
    		   }
    			   
    	   }
    	   return node;
    	   
      }
       
       
       private TreeNode<Integer> findNode(int data) {
		return null;
	}

	private TreeNode<Integer> findParent(int data) {

		return null;
	}

	private Integer findLastFitNode(TreeNode<Integer> temp) {
		// TODO Auto-generated method stub
		return null;
	}

	//inorder traversal using Stack and without using stack or recursion
       void printWithStack(TreeNode<Integer> head){
    	   
    	   Stack <TreeNode<Integer>> stack= new Stack<TreeNode<Integer>>();
    	   TreeNode <Integer> temp=head;
    	   stack.push(head);
    	   while(!stack.empty()){
    		   temp=temp.leftChild;
    		  
    		   if(temp==null){
    			   TreeNode pop=stack.pop();
    			   
    			   while(pop!=null){
    				   
    				   if(pop.rightChild==null){
    					  
    					   System.out.println(pop.data);
    					   if(!stack.empty())pop=stack.pop();
    					   else pop=null;
    				   }
    				   else{
    					   System.out.println(pop.data);
    					   temp=pop.rightChild;
    					   stack.push(temp);
    					   break;
    				   }   
    			   }
    		   }
    		   else stack.push(temp);
    	   }
    	   
       }
       
       //print
       void print(TreeNode<Integer> head){
    	       if(head==null)return;
    	   
    		   print(head.leftChild);
    		   System.out.println(head.data);
    		   print(head.rightChild);
    	   
       }

	public int height() {
		  
		return getHeight(head ,0);
	}

	private int getHeight(TreeNode<Integer> node, int i) {
		      if(node.rightChild==null|| node.leftChild==null){
		    	  return i+1;
		      }
		      else{
		         return max(getHeight( node.leftChild,i+1),getHeight( node.rightChild,i+1));    	  
		      }
		
	}

	private int max(int a, int b) {
		
		return a>b ?a:b;
	}
}
