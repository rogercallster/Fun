package practice;

//Doubly Linked List main class

public class LinkedList{
	public static void main(String[] str){
		Linkedlist ll=new Linkedlist();
		for(int i=0;i<10;i++) ll.insertAtEnd(i);

		//System.out.println(node(ll.head,2)[1]);
		NodeCount  nc = new NodeCount();
		nc.count=6;
		nc =swapK(ll.head, 6, nc) ;

		System.out.println(nc.count+" "+nc.data.data+" "+nc.data2.data);
		//ll.print();
	}
    static  NodeCount swapK(Node node ,int k, NodeCount nc){
    	   if(node.next==null){
    		   nc.count=1;;
    		   return nc;
    	   }
    	    if(nc.count==1 ) {
    	    	nc.data=node;
    	    	nc.count=0;
    	    }
    	    nc.count=nc.count==0?nc.count:nc.count-1;
    	    swapK(node.next,k,nc);
    	    nc.count++;
    	    if(k==nc.count)nc.data2=node;
    	    return nc;
    }

    static int[] node(Node head, int count ){
		 
	    if(head.next==null){
	    	int[]  ar=new int[2];
	       ar[0]=--count;
	       ar[1]=0;
	       
	       return ar;
	    }
	    else{
	        int [] ar =node(head.next,count);
	        if(ar[0]>1 ){
	        	ar[0]-=1;
	        }
	        else if (ar[0]==1 && ar[1]==0)ar[1]=head.data;
	        return ar;
	    }
	   }	
}
//class to have 2 elements

class NodeCount{
    Node data;
    int count;
    Node data2;
}

//Class for definitions on linked list
class Linkedlist{

  Node head=null;
//print linked list
  void print(){
      Node temp=head;
      while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
  }
//Inserting as last element
  void insertAtEnd(int data){
      
      Node temp=head;
      if(temp==null){
    	  head=new Node(data);
    	  return;
      }
      
      
      while(temp.next!=null )temp=temp.next;
      temp.next=new Node(data,temp);
  }
//method for Inserting at given Index
  void insertAtIndex(int index,int data){
	  int i=0;
      Node temp=head;
      while(i< index ){
          if(temp==null){
              return;
          }
          else{
              
              temp=temp.next;
              if(index==i){
              temp.next=new Node(data,temp,temp.next);
              temp.next.next.prev=temp.next;
              }
              i++;
          }
      }
  }
  
//delete the node at end
  Node deleteAtEnd(){
      if(head.next==null)return head;
      else{
          Node temp=head;
          while(temp.next!=null)temp=temp.next;
          Node ret=temp;
          temp=temp.prev;
          temp.next=null;
          ret.prev=null;
          return ret;
          
      }
  }
}
//Class for Node Data Structure
class Node{
      Node next;
      Node prev;
      int data;
      Node(){}
      Node(int data){
          this.data=data;
      }
      Node(int data, Node prev){
          this.data=data;
          this.prev=prev;
      }
      Node(int data, Node next, Node prev){
          this.data=data;
          this.next=next;
          this.prev=prev;
      }
  }