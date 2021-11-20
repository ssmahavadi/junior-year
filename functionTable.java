public class FunctionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf( "%13s %9s %12s %8s %14s", "Number", "Square", "Square Root", "Cube", "Fourth Root");
		System.out.println();
		for(int i=1; i<21; i++) {
			double square = Math.pow(i, 2);
			double squareRoot = Math.pow(i, 0.5);
			double cube = Math.pow(i, 3);
			double fourthRoot = Math.pow(i, 0.25);
			System.out.printf("%10d %10.0f %12.4f %10.0f %12.4f", i, square, squareRoot, cube, fourthRoot);
			System.out.println();

		}
	}

}
