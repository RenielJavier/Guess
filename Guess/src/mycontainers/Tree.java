/*
 Classe Tree
 implementa l'albero di un binary tree 
 */
 
 
package mycontainers;

public class Tree {
	
	/*Attributes*/
	Node root;
	Node current;
	
	/*Constructors*/
	public Tree() {
		Node n= new Node("Uknown");
		root=current=n;
	}
	public Tree(Node root) {
		this.current=this.root=root;
	}

	public String printMe(Node n,String prefix) {
		//visita l'albero in ordine anticipato
		if(n==null)return prefix+"\n";else {
		return prefix+n+"\n"+printMe(n.getLeft(),prefix+"\t")+"\n"+printMe(n.getRight(),prefix+"\t");
		}
	}
	
	public void addLeft(Node n) {
		if(current==null) {
			return;
		}
		if(current.getLeft()==null) {
			current.setLeft(n);
			n.setParent(current);
		}
	}
	public void addRight(Node n) {
		if(current==null) {
			return;
		}
		if(current.getRight()==null) {
			current.setRight(n);
			n.setParent(current);
		}
	}
	
	public Node goLeft(){
		if(current!=null && current.getLeft()!=null) {
			current=current.getLeft();
		}
		return current;
	}
	public Node goRight(){
		if(current!=null && current.getRight()!=null) {
			current=current.getRight();
		}
		return current;
	}
	public Node goParent(){
		if(current!=null && current.getParent()!=null) {
			current=current.getParent();
		}
		return current;
	}
	
	public Node goRoot() {
		return current=root;
	}
	
	@Override
	public String toString() {
		return printMe(root,"");
	}

	public Node getRoot() {
		return root;
	}

	public Node getCurrent() {
		return current;
	}

	
	
}
