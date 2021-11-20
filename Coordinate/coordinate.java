
public class Coordinate {
	private int x;	//private instance
	private int y;	//variables
	public Coordinate() { x=y=0; }
	public Coordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//mutator method
	public void setCoordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//accessor method
	public int getX() { return x; }
	public int getY() { return y; }
	
	//mutator method
	public void dilate(int scaleFactor) {
		x*=scaleFactor;
		y*=scaleFactor;
	}
	
	//toString method
	public String toString() { return ("("+x+", "+y+")"); }
}
