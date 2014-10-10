package MyLists;
public class LinkedList {
    Node head=null;
	public void insert(int data){
		if(head==null)head=new Node(data);
		else{
			Node temp=head;
			while(temp.next!=null)temp=temp.next;
			temp.next=new Node(data,temp);
		}
	}
	
}
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
	}
	Node(int data, Node parent){
		parent.next=this;
		this.data=data;
	}
}
