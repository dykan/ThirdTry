public class Cell {
	public final String myName;
	protected long strength = 10000;
	private Contacts contacts;

	public Cell(int myName, Cell father) {
		System.out.println("d- " + "cell(father,maxfriends)");
		this.myName = "Cell " + myName;
		contacts = new Contacts(father != null ? father
				: GiveBirth.create(this));
	}

	public void run() {
		// TODO: this doesnt work
		System.out.println("d- " + "run() ");
		if (contacts.getRandom().hi(this)) {
			strength++;
		}
	}

	public boolean hi(Cell me) {
		System.out.println("d- " + "hi(me) ");
		// should calculate his values and decide if he wants a friendship with
		// him
		if (me.strength < (strength - Math.sqrt(strength))) {
			return false;
		}
		return true;
	}
}
