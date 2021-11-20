public class passwordGenerator {
	private String prefix;
	private int number;
	private static int count=0;
	
	public passwordGenerator(int numb, String p) {
//		pwCount ++;
		prefix = p;
		number = numb;	//check back on this
        count = 0;
	}
	public passwordGenerator(int numb) {
//		pwCount++;
		prefix = "A";
		number = numb;
        count = 0;
	}
	public String pwGen() {
		int i=0;
		int n=0;
//		String n = "";
		int randomDigit=0;
		while(i < number){
			randomDigit = (int)(Math.random() * 10);
			n=10*n+randomDigit;
			i++;
		}
		count++;
		return prefix + "." + n;
	}
	public int pwCount() {
		// TODO Auto-generated method stub
		return count;
	}
	public static void main (String[] args) {
        System.out.println();
        System.out.println("Password 1:");
		passwordGenerator pw1 = new passwordGenerator(4, "chs");
		System.out.println("Count: " + (pw1.pwCount()));
		System.out.println("Generated Password: " + pw1.pwGen());
		System.out.println("Generated Password: " + pw1.pwGen());
		System.out.println("Count: " + pw1.pwCount());
        System.out.println();

        System.out.println("Password 2:");
		passwordGenerator pw2 = new passwordGenerator(6);
		System.out.println("Count: " + pw2.pwCount());
		System.out.println("Generated Password: " + pw2.pwGen());
		System.out.println("Count: " + pw2.pwCount());
        System.out.println();
	}
}
