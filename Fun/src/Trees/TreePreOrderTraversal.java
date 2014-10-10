package Trees;

import java.util.Stack;

public class TreePreOrderTraversal{
	
	public static void main(String[] argv){
		Tree tree= new Tree();
		int [] a={10,5,6,7,8,9,15,7,13,8,14,12,6,4,6,9,5,4,3,2,2,1,11,16,18,19,20,3,2,1};
		for(int i=0;i<a.length;i++)tree.insert(a[i]);
		preOrderTraversal(tree.head);
		System.out.println();
		recursivePreOrderTraversal(tree.head);
	}

	private static void recursivePreOrderTraversal(TreeNode<Integer> head) {
        if(head==null)return;
        System.out.print(head.data+" ");
        recursivePreOrderTraversal(head.leftChild);
        recursivePreOrderTraversal(head.rightChild);
	}

	private static void preOrderTraversal(TreeNode<Integer> head) {
		Stack <TreeNode<Integer>> stack =new Stack<TreeNode<Integer>>();
		TreeNode<Integer> pop,temp=head.leftChild;
		System.out.print(head.data+" ");
		stack.push(head);
		
		while(!stack.empty()){
			System.out.print(temp.data+" ");
			if(!stack.peek().equals(temp))
			stack.push(temp);
			if(temp.leftChild!=null){
			temp=temp.leftChild;
			}
			else{
				while(!stack.empty()){
					pop=stack.pop();
				    if(pop.rightChild!=null){
				    	temp=pop.rightChild;
				    	if(stack.empty() ) stack.push(temp);
				    	break;
				    }
				
				}
			}
		}
		
		
	}

}
