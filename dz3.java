/**
 *HomeWork3
 * @author Kireev Igor
 */
 import java.util.Arrays;
 import java.util.Random;
 
 class dz3 {
	 
	static Random random = new Random();
	 
	public static void main(String[] args) {
		 
		//1
		int[] arrOne = createAndFllArray(10, true, 2);
		System.out.println(Arrays.toString(arrOne));
		for (int i = 0; i < arrOne.length; i++) {
		    arrOne[i] = 1 - arrOne[i];
		}
		System.out.println(Arrays.toString(arrOne));
		
		//2
		int[] arrTwo = createAndFllArray(100, false, 1);
		System.out.println(Arrays.toString(arrTwo));
		
		//3
		int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i =0; i < arrThree.length; i++) {
			if (arrThree[i] < 6) {
				arrThree[i] *= 2;
			}
		}
		System.out.println(Arrays.toString(arrThree));
		
		// 4
		int[][] matrix = new int[7][7];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][i] = 1;
			matrix[i][matrix.length - i - 1] = 1;
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		//5
		int[] arrFive = createAndFllArray(15, 5);
		System.out.println(Arrays.toString(arrFive));
		
		//6
		int[] arrSix = createAndFllArray(15, true, 15);
		System.out.println(Arrays.toString(arrSix));
		int[] minMax = findMinMax(arrSix);
		System.out.println(Arrays.toString(minMax));
		
		//7
		int[][] test = {{2, 1, 1, 2, 1}, {2, 1, 1, 1, 2}, {7, 7}};
		for (int i = 0; i < test.length; i++) {
			System.out.println(
			    Arrays.toString(test[i]) + " " + checkBalance (test[i]));
		}
		
		//8
		System.out.println(Arrays.toString(shiftArray (new int[] {1, 2, 3, 4, 5}, 1)));
		System.out.println(Arrays.toString(shiftArray (new int[] {1, 2, 3, 4, 5}, -2)));
	}
	
	static int[] createAndFllArray(int len, int initialValue) {
		int[] arr = new int[len];
		Arrays.fill(arr, initialValue);
		return arr;
	}
	
	static int[] createAndFllArray(int length, boolean rnd, int value) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			if (rnd) {
				arr[i] = random.nextInt(value);
			} else {
				arr[i] = i + value;
			}
		}
		return arr;
	}
	
	static int[] findMinMax(int[] array) {
		int min = array[0], max = array[0];
		for (int i : array) {
			if (min > i) {
				min = i;
			}
			if (max < i) {
				max = i;
			}
		}
		return new int[]{min, max};
	}
	
	static boolean checkBalance(int[] array) {
		int sumArray = 0, sumLeft = 0;
		for (int i : array) {
			sumArray += i;
		}
		for (int i = 0 ; i < array.length - 1; i++) {
			sumLeft += array[i];
			if (sumLeft*2 == sumArray) {
				return true;
			}
		}
		return false;
	}
	
	static int[] shiftArray(int[] array, int shift) {
		shift = shift % array.length; //
		if (shift < 0) {
			shift += array.length; //
		}
		for (int cnt = 0; cnt < shift; cnt++) {
			int tmp = array[array.length - 1];
			for (int i = array.length - 1; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = tmp;
		}
		return array;
	}
}