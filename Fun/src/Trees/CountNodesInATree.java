package Trees;

public class CountNodesInATree {

	public static void main(String[] args) {
		Tree tree= new Tree();
		int [] a={10,5,6,7,8,9,15,7,13,8,14,12,6,4,6,9,5,4,3,2,2,1,11,16,18,19,20,3,2,1};
		for(int i=0;i<a.length;i++)tree.insert(a[i]);
		System.out.println(countNodes(tree.head));

	}

	private static int countNodes(TreeNode<Integer> head) {
		   int count = 0;
		    if(head==null)return 0;
		    else
		    {
		    	
		    	count+=countNodes(head.leftChild);
		    	count+=countNodes(head.rightChild);
		    }
		    return count+1;
	}

}
