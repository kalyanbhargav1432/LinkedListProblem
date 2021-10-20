package linkedlist;

import org.junit.Assert;
import org.junit.Test;

class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.println("print nodes:");
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

	@Test
	public void given3NumbersInStackWhenpopedShouldMatchWithLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode popedNode = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, popedNode);
	}

	@Test
	public void given3NumbersInStackWhenpopedShouldBeMatchWithLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyStack myStack = new MyStack();
		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myFirstNode, peak);
	}
}