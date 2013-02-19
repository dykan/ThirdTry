import java.util.ArrayList;
import java.util.Random;

public class Contacts extends ArrayList<Cell> {
	private static final long serialVersionUID = 1L;
	// Send a random cell from the contacts
	public Contacts(Cell father) {
		add(father);
	}
	private static Random a = new Random();
	public Cell getRandom() {
		System.out.println("d- " + "getRandon()");
		return get(Math.abs(a.nextInt()) % size());
	}
}