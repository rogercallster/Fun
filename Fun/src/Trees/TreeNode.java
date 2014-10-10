package Trees;

public class TreeNode<T> {
	TreeNode<T> leftChild;
	TreeNode<T> rightChild;
	T data;
	TreeNode(){}
	TreeNode(T data){
		this.data=data;
	}
}
