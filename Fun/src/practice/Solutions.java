package practice;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solutions{

	
    public ListNode sortList(ListNode head) {
    int size=size(head);
    
     msort(head,0,size);   
     return head;  
    }
    
    void  msort(ListNode head,int low,int high){
    	
        if(high<=low)return;
        else{
            int mid=(low+high)/2;
           
            msort(head,low,mid);
            
            msort(head,mid+1,high);
                
            merge(head,low,mid,high);
        }
    }   
    
    void merge(ListNode head, int low, int mid, int high){
        ListNode node=new ListNode(0);
        ListNode ret=node;
       
        int i=low;
        int j=mid+1;
    	
        while(i<mid || j<high ){
            if( i<mid){
            	
                     
                while(getIndex(head,i).val < getIndex(head,j).val && i<mid ){
                    node.next=getNode(head,i);
                    i++;
                    node=node.next;
                }
            }
            if(j<high){
            	
                while(getIndex(head,i).val>getIndex(head,j).val && j<high){
                    node.next=getNode(head,j);
                    j++;
                    node=node.next;
                }
            }
                while(j<high  && i>= mid){
                	node.next=getNode(head,j);
                    j++;
                    node=node.next;
                }
                while(i<mid && j>=high){
                	node.next=getNode(head,i);
                    i++;
                    node=node.next;
                }
            
        }
        node=head;
        i=0;
       
        while(i<low && ret.next!=null)   {
        	node=node.next;
        	
        	i++;
        }
        
        while(ret.next!=null){
        	 
        	node.val=ret.val;
        	ret=ret.next;
        	node=node.next;
        	
        }
        
        
        
    }
    ListNode getNode(ListNode head,int i){
        ListNode node= new ListNode(getIndex(head,i).val);
        return node;
    }
    
    ListNode getIndex(ListNode head,int index){
    	
        int i=0;
        ListNode node=head.next;
    	
       
        if(node==null)return null;
        while(i<index ){
        
            node=node.next;
            i++;
        }
        return node;
    }
    
    int size(ListNode node){
        int i=-1;
        
        while(node.next!=null){
            node=node.next;
            i++;
        }
        return i;
    }

	
	
}