
public class CoordinateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordinate a = new Coordinate();	//calls default constructor bc no parameters
		a.setCoordinate(3, 4);
		System.out.println(a.toString());
		a.dilate(8);
		System.out.println(a.toString());
	}

}
