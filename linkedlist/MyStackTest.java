package linkedlist;

import org.junit.Assert;
import org.junit.Test;

class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStockShouldHaveLastAddedNode() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
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
}
