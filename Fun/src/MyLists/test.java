package MyLists;

public class test {

	public static void main(String[] args) {
        int[] a={0,2,4,6,8};
        int [] b={0,1,3,5,7,9,19};//a*b
        LinkedList ll1=new LinkedList();
        for(int i:a)ll1.insert(i);

        LinkedList ll2=new LinkedList();
        for(int i:b)ll2.insert(i);
        
        mergeLinkedListAtAlternativePosition(ll1.head, ll2.head);
        Node temp=ll2.head;
        while(temp!=null){
        	System.out.println(temp.data);
        	temp=temp.next;
        }
        
	}

	static  Node mergeLinkedListAtAlternativePosition(Node head1,Node head2){
          if (head1.next==null)return head2;

          Node temp1=head1.next,temp2=head2.next;

          while(temp2.next!=null && head1.next!=null ){
              temp1=temp2.next;
              temp2.next= head1.next;
              head1.next=head1.next.next;    
              
                            
              temp2=temp2.next;
              temp2.next=temp1;
              temp2=temp2.next;
      
        }
        return head2;
    }
}
