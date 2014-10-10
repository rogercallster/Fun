package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.print.attribute.standard.MediaSize.ISO;

public class testTrees {
	public static <T> void main(String[] str){
		 
		
		Tree tree=new Tree();
		Tree tree1=new Tree();
		int[] a={8,5,2,9,4,6,8,7,1,3,11,10};
		int[] b={28,5,2,9,4,6,8,7,1,3,11,10};
		for(int i: a)  {
			tree.insert(i) ;
			
		}
		for(int i: b)  {
			tree1.insert(i) ;
			
		}
		//tree.printWithStack(tree.head);
		int var=0;
		//lcs(tree.head,1,3,var);
	//	printLayers(tree.head);
		//LinkedList<LinkedList<TreeNode>>  lll =levelOrderTraversal(tree.head);
		//for(int i=0 ;i< lll.size();i++){
		//	for(int j=0;j<lll.get(i).size();j++){
		//		System.out.print(lll.get(i).get(j).data+"->");
		//	}
		//	System.out.println();
		//}
		
		System.out.println(isomorphic(tree, tree1));
		
	}
	
	//isomorphic layer by layer
	 
	static boolean isomorphic(Tree a, Tree b){
	    ArrayList<Integer> al1;
		ArrayList<Integer> al2;

	    for(int i=0;i<a.height();i++){
	       al1=new ArrayList<Integer>();
	       al2=new ArrayList<Integer>();
	       getLayer(a.head,i,al1);
	       getLayer(b.head,i,al2);
	       if(al1.size()==al2.size()){
	           if(!compare(al1,al2))return false;
	       }
	       else return false;
	    }
		return true;
	}

	static void getLayer(TreeNode<Integer> node,int height, ArrayList<Integer> al ){
	    if(height==0){
	        al.add((int) node.data);
	        return;
	    }
	    else {
	    	if(node.rightChild!=null ) getLayer(node.rightChild, height+1, al );
	    	if(node.leftChild!=null ) getLayer(node.leftChild,  height+1, al );
	    }
	}

	static Boolean compare(ArrayList <Integer>al1, ArrayList<Integer>al2){

	    Collections.sort(al1);
	    Collections.sort(al2);
	    for(int i=0;i<al1.size();i++){
	        if(al1.get(i)!=al2.get(i))return false;
	    }
	    return true;
	}
	
	////////////////////
	
	 static LinkedList<LinkedList<TreeNode>> levelOrderTraversal(TreeNode root){
	     int count=0;
	     LinkedList<LinkedList<TreeNode>> linkedList=new LinkedList<LinkedList<TreeNode>>();
	     LinkedList<TreeNode> list=new LinkedList<TreeNode>();
	     list.add(root);
	     linkedList.add(count, list);
	     
	     TreeNode  n=null;
	     while(true){
	         for(int i=0;i<linkedList.get(count).size();i++){
	                  list=new LinkedList<TreeNode>();
	                  n=linkedList.get(count).get(i);
	                   if(n!=null){
	                       if(n.leftChild!=null)list.add(n.leftChild);
	                       if(n.rightChild!=null)list.add(n.rightChild);
	                       }
	                   
	         }
	         if(list.size()>0){
	        	 count++;
		         
	             linkedList.add(count,list);
	         }
	         else break;
	         

	     }
	     return linkedList;    
	}
	

	private static void printLayers(TreeNode<Integer> head) {
		    boolean more=true;
		    int height=0;
            while (more){
            	more=printElementsAtHeight(head, height);
            	height++;
            	System.out.println("---------");
            	
            }
	}
	
	

	private static boolean printElementsAtHeight(TreeNode<Integer> head,
			int height) {
		if(head==null)return false;
		else{
			if(height==0) {
				System.out.println(head.data);
				return true;
			}
			
			else {
				boolean l,r;
				l=printElementsAtHeight(head.leftChild, height-1);
				r=printElementsAtHeight(head.rightChild, height-1);
				return l|r;
			}
		}
		
	}

	private static boolean printElementsAtHeightNonRecursive(TreeNode<Integer> head,
			int height) {
	return false;	
	}
	private static Boolean lcs(TreeNode<Integer> head, int i, int j,int var) {
		if(head==null)return false;
		else{
			boolean l,r;
			if(head.data==i || head.data==j){
				
				return true;
			}
			else{
				
				l=lcs(head.leftChild,i,j,var);
				r=lcs(head.rightChild,i,j,var);
				//System.out.println(l+"  --  "+r+" "+head.data);
				if(r&l) {
					System.out.println(l+"  --  "+r+"  head.data "+head.data);
					var=head.data;
				}
				return l|r;
			}
		    
		}
		
	}

}
