package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		boolean andResultA = (a > b && b < a);
		System.out.println(andResultA);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean andResultB = (isSunny && isWarm);
		System.out.println(andResultB);
		
		int x = 3;
		int y = 24;
		boolean andResultC = (x >= 0) && (y % 2 == 0);
		System.out.println(andResultC);
		
		boolean hasPermisson = false;
		boolean notResult = !(hasPermisson = false);
		System.out.println(notResult);
	}

}
