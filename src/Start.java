import util.MyProps;



public class Start {

	public static void main(String[] args) {
		// the properties manager isnt sync so we init it now
		MyProps.getInst();
		
		// create root
		Cell root = GiveBirth.create(null);
		root.run();
		

	}
}