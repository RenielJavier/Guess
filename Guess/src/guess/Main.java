package guess;
import mycontainers.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Programma avviato!");
		Tree t =new Tree(new Node("Io sono la radice"));
		
		t.add("primo nodo");
		t.add("secondo nodo");
		
		System.out.println(t);
		
	}
	

}
