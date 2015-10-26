package linear;

public class IntNode {

	private int data; 
	private IntNode next; 
	
	public IntNode() {
		this.data = 0; 
		this.next = null; 
	}
	
	public IntNode(int data) {
		this.data = data;
		this.next = null; 
	}
	
	public String toString() {
		return data + "";
	}
	
	public int getData(){
		return data; 
	}
	
	public IntNode getNext() {
		return next; 
	}
	
	public void setData(int data){
		this.data = data; 
	}
	
	public void setNext(IntNode next) {
		this.next = next; 
	}
	
	
	
}
