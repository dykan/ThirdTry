
public class GiveBirth {
	private static int name = 0;
	public static Cell create(Cell father){
		return new Cell(name,father);
	}
}