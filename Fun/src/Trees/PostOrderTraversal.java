package Trees;
import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] argv){
		Tree tree= new Tree();
		int [] a={10,5,6,7,8,9,15,7,13,8,14,12,6,4,6,9,5,4,3,2,2,1,11,16,18,19,20,3,2,1};
		for(int i=0;i<a.length;i++)tree.insert(a[i]);
		
		
		recursivePostOrderTraversal(tree.head);
		System.out.println("\n\n\n\n");
		postOrderTraversal(tree.head);
	}

	private static void recursivePostOrderTraversal(TreeNode<Integer> head) {
       if(head==null)return;
       recursivePostOrderTraversal(head.leftChild);
       recursivePostOrderTraversal(head.rightChild);
       System.out.print(head.data+" ");
	}

	private static void postOrderTraversal(TreeNode<Integer> head) {
		Stack <TreeNode<Integer>> stack = new Stack<TreeNode<Integer>>();
		stack.push(head);
		TreeNode<Integer> temp=head,pop,pointer=null;
		while(!stack.empty()){
		     if(temp.leftChild!=null){
		    	 temp=temp.leftChild;
		    	 stack.push(temp);
		     }
		     else{
		    	 pop=stack.pop();
		    	 if(pop.rightChild==null || pop.equals(pointer)){
		    		 System.out.print(pop.data+" ");
		    		 
		    	 }
		    	 else{
		    		 pointer=pop;
		    		 stack.push(pop);
		    		 temp=pop.rightChild;
		    		 stack.push(temp);
		    	 }
		     }
		 }
	}
}
