package linkedlist;

public class MyNodes<K> implements linkedlist.INode<K> {
	private K key;
	private INode next;

	public MyNodes(K key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (MyNodes<K>) next;
	}

}
