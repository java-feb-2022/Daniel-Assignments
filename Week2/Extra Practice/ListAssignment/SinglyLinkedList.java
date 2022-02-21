
public class SinglyLinkedList {
	
    public Node head;
    
    public SinglyLinkedList() {
        // your code here
    	this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public int remove() {
    	Node current = head;
    	int valToReturn;
    	while(current.next.next != null) {
    		current = current.next;
//    		if(current.next == null) {
//    			System.out.println("item to remove: " + current.value);
//    			current = null;
//    		}
    	}
    	valToReturn = current.next.value;
    	current.next = null;
    	return valToReturn;
    }
    
    public void printValues() {
    	Node current = this.head;
    	while(current != null) {
    		System.out.println(current.value);
    		current = current.next;
    	}
    }
}
