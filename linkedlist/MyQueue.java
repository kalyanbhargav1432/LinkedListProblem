package linkedlist;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
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

	public INode dequeue() {
		return myLinkedList.popLast();
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
