package linkedlist;

import org.junit.Assert;
import org.junit.Test;

class MyNodeTest {

	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}