package lec14_doublyLL;

public class DoublyLLNode <T>{

	public T data;
	public DoublyLLNode<T>next;
	public DoublyLLNode<T>prev;
	public DoublyLLNode(T data) {
		this.data=data;
	}
}
