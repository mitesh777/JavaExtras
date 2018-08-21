
public class dectobinary {

	public static void main(String[] args) {
		int num=0,i=0,bin=0,dig=0;
		System.out.println("Enter the number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		while(num>0)
		{
			dig=num%2;
			num=num/2;
			bin+=dig*Math.pow(10,i);
			i++;
		}
		System.out.println("Decimal no." + bin);
	}

}
