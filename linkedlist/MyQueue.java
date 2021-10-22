package linkedlist;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
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
