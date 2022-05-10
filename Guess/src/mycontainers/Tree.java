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
		current=root=null;
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
	
	public void add(String value) {
		Node nuovo=new Node(value);
		if(root==null) {
			root=current=nuovo;
		}else{}
		nuovo.setLeft(root);
		root=nuovo;
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
