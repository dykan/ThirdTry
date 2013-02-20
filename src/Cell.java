import cell.Location;

public class Cell {
	public final String myName;
	protected long strength = 10000;
	private Contacts contacts;
	private Location location;

	public Cell(long myName, Cell father) {
		System.out.println("d- " + "cell(father,maxfriends)");
		this.myName = "Cell " + myName;
		this.location = Location.getNewLocation();
		contacts = new Contacts(father != null ? father
				: GiveBirth.create(this));
	}

	public void run() {
		System.out.println("d- " + "run() ");
		if (contacts.getRandom().hi(this)) {
			strength++;
		}
	}

	public boolean hi(Cell caller) {
		System.out.println("d- " + "hi(me) ");
		// should calculate his values and decide if he wants a friendship with
		// him
		if (caller.strength < (strength - Math.sqrt(strength))) {
			return false;
		}
		return true;
	}
}
