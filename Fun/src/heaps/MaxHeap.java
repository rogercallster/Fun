package heaps;

public class MaxHeap {
     int level=0;
     HeapNode root=null;
     void insert(int i){
    	 if(root==null){ 
    		 root=new HeapNode(i,null);
    		 level++;
    	 }
    	 else{

    		 HeapNode temp;
    		 temp = searchFreeNode(level-1,root);
    		 if( temp==null){
    			level++;
    			temp=searchFreeNode(level-1,root);
    		 }
    		 else{ 
    			 if(temp.left==null) temp.left=new HeapNode(i ,temp);
    			 else temp.right=new HeapNode(i ,temp);
    		 }
    		 if(i>temp.data ){
    			 if(temp.left!=null)if(temp.left.data==i) temp.left.data=temp.data;
    			 else temp.right.data=temp.data;
    			 swap(i,temp);
    		 }
    		 
    	 }
     }
	private void swap(int i, HeapNode temp) {
		
		   int j=0;
		   if(temp.parent==null){
			   temp.data=i;
			   return ;
		   }
           while(temp.parent.data<i){
        	   j=temp.parent.data;
        	   temp.parent.data=i;
        	   temp.data=j;
        	   temp=temp.parent;
        	   if(temp.parent==null)break;
           }		
	}
	
	private HeapNode searchFreeNode(int level, HeapNode root) {
		if(root==null)return null;
		if(level==0 && ( root.left==null || root.right==null)){
			return root;
		}
		else if( level==0 ) return null;
		else{
			HeapNode var = searchFreeNode(level-1, root.left);
			if(var!=null)return var;
			var=searchFreeNode(level-1, root.right);
		    return var;
			
			
		}
	}
	public void print(HeapNode node) {
		int i=0;
		while(i<level){
			callPrint(node,i);
			i++;
			System.out.println();
		}
	}
	private void callPrint(HeapNode node, int i) {
	   if (node==null)return;
       if(i==0){
    	   System.out.print(node.data+" ");
    	   return;
       }
       else{
    	   callPrint(node.left, i-1);
    	   callPrint(node.right, i-1);
       }
	}
	
	Boolean delete(){
		
		return true;
	}
}

class HeapNode{
	 HeapNode left,right,parent;
	 int data;
	 HeapNode(int data, HeapNode parent){
		 this.data=data;
		 this.parent=parent;
	 }

}