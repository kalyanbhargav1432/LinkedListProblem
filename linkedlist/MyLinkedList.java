package linkedlist;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		head.getNext().setNext(null);
		return tempNode;
	}

	public INode findNode() {
		int searchValue = 30;
		INode tempNode = head;
		while (!tempNode.getkey().equals(searchValue)) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void deleteInBetween(INode getNode, INode setNode) {
		INode temp = this.head;
		getNode.setNext(setNode);
	}

	public void size() {
		int i = 0;
		final int list = 1;
		INode temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			i++;
		}
		System.out.println("the total nodes:" + (i + list));
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getkey());
			if (!tempNode.equals(tail))
				myNodes.append("-->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getkey());
		System.out.println(myNodes);
	}
}