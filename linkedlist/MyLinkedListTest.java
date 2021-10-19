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
		System.out.println("added:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);

		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToLast() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		System.out.println("append:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		System.out.println("insert:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstElementWhenDeleteShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myFirstNode);
		myLinkedList.pop();
		System.out.println("first element delete:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode)
				&& myLinkedList.tail.equals(myThirdNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastElementWhenDeleteShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.popLast();
		System.out.println("Last element delete:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void givenElementFindKeyShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		System.out.println("find Node:" + getNode.getkey());
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void givenElementInsertNewNodeAfterKeyShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		MyNodes<Integer> newNode = new MyNodes<>(40);
		myLinkedList.insert(getNode, newNode);
		System.out.println("final Node:");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

	@Test
	public void givenElementdeleteNewNodeAfterKeyShouldPassLinkedListResult() {
		MyNodes<Integer> myFirstNode = new MyNodes<>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		MyNodes<Integer> newNode = new MyNodes<>(40);
		myLinkedList.deleteInBetween(getNode, myFirstNode);
		System.out.println(" Node:");
		myLinkedList.printMyNodes();
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		System.out.println(result);
		Assert.assertTrue(result);
	}

}