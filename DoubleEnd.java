//Wei 
class ListNode {
	String data;
	ListNode next;
	ListNode previous;

	public ListNode(String d_Data) {
		data = d_Data;
	}

}

class DoubleEnd {
	private ListNode head;
	private ListNode head2;

	public DoubleEnd() {
		head = null;
		head2 = null;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addtoFront(String val) {
		ListNode newLink = new ListNode(val);

		if (isEmpty())
			head2 = newLink; // put old end to new link
		newLink.next = head; // put new link in old head
		head = newLink; // head to new link
		// System.out.println("Just added to head");
	}

	public void addtoEnd(String val) {
		ListNode newLink = new ListNode(val);

		if (isEmpty())
			head = newLink;
		else
			head2.next = newLink;
		head2 = newLink;
		// System.out.println("Just added to head End");
	}

	public String popFront() {
		String temp = head.data;
		if (head.next == null) // if there is no next item
			System.out.println("the list is empty");
		head = head.next; // if there are more move things up
		return temp;

	}

	public void display() {

		ListNode consider = head;
		while (consider != null) {
			System.out.print(consider.data + " ");
			consider = consider.next;
		}
		System.out.println("");
	}

	public boolean remove(String toRemove) {
		ListNode consider = head;
		ListNode previous = null;

		if (consider.data.equals(toRemove))
			popFront();// if only have one item or item looking for is in front
						// without forcing the user to use pop function

		else
			System.out.println("not found yet is not the firist item");

		while (consider != null)// loop the whole list
		{
			if (consider.data.equals(toRemove))// found
			{
				consider = consider.next;// move pointer
				if (previous == null) // special case
					previous = consider;
				else
					previous.next = consider;

				return true;
			} else {
				previous = consider;// loop the rest
				consider = consider.next;
			}
		} // end while
		return false;
	}
}// end of class double end

class DoubleEndApp {
	public static void main(String[] args) {
		DoubleEnd mainList = new DoubleEnd();
		new ExerciserList(mainList);

	}
}