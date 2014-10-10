package Trees;

public class TreeTestGoo {


Node InorderNext(Node  node){
    if(node.rightChild!=null){
        return getLeftLeaf(node.rightChild);
    } 
    else{
        if (node.parent.data< node.data){
            Node temp=node;
            while(temp.data>temp.parent.data){
                 temp=temp.parent;
             }
            return  InorderNext(temp);
         }
        else{return node;}
    }
}


Node getLeftLeaf(Node node){
    if(node.leftChild==null)return node;
    else{
         Node temp=node.leftChild;     
         while(temp.leftChild!=null)temp=temp.leftChild;
         return temp;
     }
}

	
	
}
class Node{
 Node	leftChild,rightChild,parent;
	int data;
}