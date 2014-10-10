package Lists;

public class StartOfLoop {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.head=new SingleListNode(0);
		for(int i=1;i<12;i++)list.add(i-1, i);
		list.itemAtIndex(11).next=list.itemAtIndex(4);
		
		findStartOfLoop(list.head);
		SingleListNode temp=list.head;
		//System.out.print(temp.data+"->");
		for(int i=0;i<13;i++){
			//System.out.print(temp.data+"->");
		    temp=temp.next;
	     }

	}

	private static void findStartOfLoop(SingleListNode head) {
		SingleListNode fast=head.next.next, slow=head.next;
		
		while(!slow.equals(fast)){
			fast=fast.next.next;
			slow=slow.next;
		}
		slow=head;
		while(!slow.equals(fast)){
			slow=slow.next;
			fast=fast.next;
		}
		System.out.println(fast.data);
	}

}
