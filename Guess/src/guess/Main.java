package guess;
import mycontainers.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Programma avviato!");
		Tree t =new Tree(new Node("A"));
		t.addLeft(new Node("b"));
		t.addRight(new Node("c"));
		t.goLeft();
		t.addLeft(new Node("d"));
		t.goRoot();
		t.goRight();
		t.addRight(new Node("f"));
		t.addLeft(new Node("e"));
		t.goLeft();
		t.addRight(new Node("h"));
		t.addLeft(new Node("g"));
		System.out.println(t);
		
	}
	

}
