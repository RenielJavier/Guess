/*
 Class NODE 
 implementa un nodo di un albero binario
 */
package mycontainers;

public class Node {
	/*attributes*/
	private String value;
	private Node parent,left,right;
	private int id;
	private static int counter=0;
	
	/*Constructors*/
	public Node() {
		id=++counter;
		value=null;
		parent=left=right=null;
	}
	
	public Node(String value) {
		id=++counter;
		this.value=value;
		parent=left=right=null;
	}
	
	public Node(String value,Node parent,Node left, Node right) {
		id=++counter;
		this.value=value;
		this.parent=parent;
		this.left=left;
		this.right=right;
	}
	
	/*setters and getters*/
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return id+","+value+","+(parent==null ? 0 :parent.id)+","+(left==null ? 0 :left.id)+","+(right==null ? 0 : right.id)+",";
	}
	
	/*Methods*/
	public boolean isLeaf() {
		return left==null && right==null;
	}
	
}
