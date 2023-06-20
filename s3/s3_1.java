package s3;


public class s3_1 {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.sortList();
		list.reverseList();
		list.printList();
	}
}