package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		
		printResult(add(a, b));
		printResult(subtract(a, b));
		printResult(multiply(a, b));
		printResult(divide(a, b));
	}
	public static int add(int x, int y) {
		return x + y;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		return a / b;
	}
	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
	}

