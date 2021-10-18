package linkedlist;


import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
		
	}
	
	
}
