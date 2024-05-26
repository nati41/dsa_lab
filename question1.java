class LinkedLists {
	Node head;
	
	static class Node{
		int value;
		Node next;
		
		Node(int data){
			value = data;
			next = null;
		}
}
}

public static void main(String[] args) {
	LinkedLists numlist =		new LinkedLists();
	numlist.head = new Node(1);
	Node node2 = new Node(2);
	Node node3 = new Node(3);
	numlist.head.next = node2;
	node2.next = node
