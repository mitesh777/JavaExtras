public class SwapDemo {
	public static void main(String[] args) {
		int arg1 = 100;
		int arg2 = 200;
	swapValues(arg1,arg2);
	displayValues("swap",arg1,arg2);
	// make call to swapValues() and displayValues()

	}

	private static void swapValues(int arg1,int arg2) {
	arg1=arg1+arg2;
	arg2=arg1-arg2;
	arg1=arg1-arg2;
	}
	
	private static void displayValues(String str,int arg1, int arg2) {
		System.out.println(str);
		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);
	}
}