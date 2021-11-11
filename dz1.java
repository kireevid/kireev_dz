class HomeWorkApp {

	public static void main(String[] args) {
		printThreeWords(); 

	}

	public static void printThreeWords() {
	    System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
		checkSumSign();
    }

    public static void checkSumSign() {
		int a = 0;
        int b = 1;
	System.out.println("The amount is " + ((a + b)>=0? "positive" : "negative"));
	printColor();

}

    public static void printColor() {
	    int value = 777;
		if (value <= 0){
    	System.out.println("red");
		} ;
		if (value > 1 && value<=100 ) {
		System.out.println("yellow");
		} ;
		if (value>100) {
		System.out.println("green");
		} 
		compareNumbers();
	}

    public static void compareNumbers() {
		int a = 1;
		int b = 2;
		if (a>=b) {
		System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}

	}


}