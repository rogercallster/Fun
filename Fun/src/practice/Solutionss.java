package practice;

public class Solutionss {
     public static void main(String[] st){
    	 ListNode head= new ListNode(0);
    	 ListNode temp= head;
    	 int[] i={4,2,7,5,9,3,8};
    	 for(int j: i){
    		 temp.next=new ListNode(j);
    		 temp=temp.next;
    	 }
    	 Solutions sol=new Solutions();
    	 sol.sortList(head);
    	 while(head!=null){
    		 System.out.println(head.val);
    		 head=head.next;
    	 }
     }
}
