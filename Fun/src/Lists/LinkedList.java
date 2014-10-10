package Lists;

public class LinkedList {
	SingleListNode head=null;
	
	boolean add( int after, int data){
		
		if(head==null){
			head=new SingleListNode(data);
		}
		SingleListNode temp=head;
	    
		while(temp.data!=after && temp!=null){
			
			temp=temp.next;
			if(temp==null)return false;
		}
		
		temp.next=new SingleListNode(data);
		return true;
	
		}
	
	SingleListNode  itemAtIndex(int index){
		SingleListNode temp=head;
		int i=0;
		while(i!=index){
		temp=temp.next;
		i++;
		if(temp==null)return temp;
		}
		return temp;
	}
	
	int delete(SingleListNode node){
		
		return -1;}

}
/*
 * 
class Node{
	public Node next;
	int data;
	
}

 * class DoubleListNode extends Node{
	Node next;
	Node prev;
	
	public DoubleListNode() {}
	
	public DoubleListNode(int data) {
	    this.data=data;
	}
	
	public DoubleListNode(int data,DoubleListNode prev) {
		this.prev=prev;
		this.data=data;
		
	}
	public DoubleListNode(int data,DoubleListNode next, DoubleListNode prev) {
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
*/

class SingleListNode{
	SingleListNode next;
	int data;
	
	public SingleListNode() {}
	public SingleListNode(int data) {
		this.data=data;
	}
	public SingleListNode(int data, SingleListNode next) {
		this.data=data;
		this.next=next;
	}
}
