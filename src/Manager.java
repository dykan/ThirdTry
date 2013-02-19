import java.util.ArrayList;

/**
 * 
 * @author yhezkel
 * 
 *         This class is for handle two queues, there are two of them first the
 *         normal activity of a cell and the other one is the reaction of a cell
 *         they're different because the reaction should be faster also the
 *         reaction can cause the normal activity to become even slower
 */
public class Manager {
	private static ArrayList<Cell> reaction = new ArrayList<Cell>();
	private static ArrayList<Cell> normalAct = new ArrayList<Cell>();

	public static void add(Cell x, boolean normalActivity) {
		if (normalActivity)
			normalAct.add(x);
		else {
			normalAct.remove(x);
			reaction.add(x);
		}
	}
}