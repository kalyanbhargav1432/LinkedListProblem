package linkedlist;

import org.junit.Assert;
import org.junit.Test;

class MyQueueTest {

	@Test
	public void given3NumbersInQueueWhenpopedShouldBeMatchWithLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode peak = myQueue.peak();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, peak);
	}

	@Test
	public void given3NumbersInQueueWhenpopedShouldMatchWithLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode peak = myQueue.peak();
		INode dequeue = myQueue.dequeue();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, peak);
	}

}
