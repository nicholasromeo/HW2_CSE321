package CSE321.Homework2;

public class App {
	//added a comment
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static int subtract(int a, int b) {
		int sub = a-b;
		return sub;
	}

	public static int divide(int a, int b) {
		int div = a/b;
		return div;
	}
	
	public static boolean isEight(int a){
		boolean eight = true;
		if (a == 8) {
			eight = true;
			return eight;
		} else {
			eight = false;
		}
		return eight;
	}
}
