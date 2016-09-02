
public class MyList {

	private Node head;
	
	private class Node{
		public int element;
		public Node link;
		
		public Node(int e, Node l){
			element = e;
			link = l;
		}
	}
	
	public MyList(){
		head = null;
	}
	
	public void add(int num){
		head = new Node(num, head);
	}
	
	public boolean find(int num){
		return findNumber(num, head);
	}
	
	private boolean findNumber(int n, Node h){
		if(h == null)
			return false;
		else if(h.element == n){
			return true;
		}else{
			return findNumber(n, h.link);
		}
	}
	
	public void print(){
		System.out.println(printList(head));
	}
	
	private String printList(Node h){
		if(h == null)
			return "";
		else{
			return printList(h.link) + Integer.toString(h.element) + " ";
		}
	}
	
	public void sum(){
		System.out.println(getSum(head));
	}
	
	private int getSum(Node h){
		if(h == null)
			return 0;
		else{
			return h.element + getSum(h.link);
		}
	}
}
