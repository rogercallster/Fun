package heaps;

public class test {

	public static void main(String[] args) {
     MaxHeap mh=new MaxHeap();
     for(int i=0;i<100;i++)mh.insert(i);
     mh.print(mh.root);
	}

}
