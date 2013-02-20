
public class GiveBirth {
	private static long name = 0;
	public static Cell create(Cell father){
		Cell cell= new Cell(name,father);
		name++;
		return cell;
	}
}