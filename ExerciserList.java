//Wei 
import java.util.Scanner;

class ExerciserList {
	ExerciserList(DoubleEnd a) {
		Scanner scn = new Scanner(System.in);
		System.out
				.print("* p-print, i-insert to front,e-insert to end head,d-delete front,f-find and delete");
		while (scn.hasNext()) {

			char cmd = scn.next().charAt(0);
			switch (cmd) {

			case 'p':
				a.display();
				break;

			case 'i':

			{
				System.out.print("value to inserted in front: ");
				String val = scn.next();
				a.addtoFront(val);
				break;
			}
			case 'e':

			{
				System.out.print("value to inserted in end: ");
				String val = scn.next();
				a.addtoEnd(val);
				break;
			}
			case 'd': {
				System.out.print("pop the value in front: ");

				a.popFront();
				break;
			}
			case 'f': {
				System.out.print("value to find and delete: ");
				String val = scn.next();
				a.remove(val);
				System.out.println("Found and delete " + val);

				break;
			}
			case 'q':
				return;
			default:
				System.out.println("unrec cmd letter " + cmd);
			} // end switch
			System.out.print("* ");
		} // end while
	}
}