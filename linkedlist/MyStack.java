package linkedlist;

public class MyStack {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();

	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);

	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
