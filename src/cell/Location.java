package cell;

import java.util.Random;

import util.MyProps;


public class Location {
	private long x;
	private long y;
	
	private Location(long x, long y){
		this.x = x;
		this.y = y;
	}
	
	public long getX() {
		return x;
	}
	public void setX(long x) {
		this.x = x;
	}
	public long getY() {
		return y;
	}
	public void setY(long y) {
		this.y = y;
	}
	
	public static Location getNewLocation(){
		long maxX = MyProps.getInst().getLong(MyProps.MAX_X);
		long maxY = MyProps.getInst().getLong(MyProps.MAX_Y);
		return new Location(getLong(maxX), getLong(maxY));
	}

	private static long getLong(long max) {
		return new Random().nextLong() % max;
	}

}
