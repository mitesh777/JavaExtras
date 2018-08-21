
public class binarytodecimal {

	public static void main(String[] args) {
		int num=0,dig=0,i=0;
		double dec=0;
		System.out.println("Enter the number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		while(num>0)
		{
			dig=num%10;
			num=num/10;
			dec=dec+dig*Math.pow(2,i);
			i++;
		}
	System.out.println("Decimal no." +(int)dec);
	}
	

}
