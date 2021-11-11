/**
 * dz2
 * @author Kireev Igor
 */
class dz2 {
    
	public static void main(String[] args) {
		System.out.println(isBetween10And20(1, 0));
		System.out.println(isBetween10And20(11, 0));
		System.out.println(isBetween10And20(111, 0));
		
		isPositiveOrNegative(-1);
		isPositiveOrNegative(0);
		isPositiveOrNegative(1);
		
		System.out.println(isNegative(-1));
		System.out.println(isNegative(0));
		System.out.println(isNegative(1));
		
		repeatString("kak_to_tak", 5);
		
    }
	
	static boolean isBetween10And20(int a, int b) {
		return a + b >= 10 && a + b <= 20;
	}
	
	static void isPositiveOrNegative(int a) {
		System.out.println(a >= 0? "Positive" : "Negative") ;
	}
	
	static boolean isNegative(int a) {
		return a < 0;
	}
	static void repeatString(String s, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
}