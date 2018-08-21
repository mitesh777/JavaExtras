
public class q6 {

	public static void main(String[] args) {
		int num=0,a=1,i=0;
		System.out.println("Enter the last number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		do
		
			{if(i%3!=0)
				{System.out.print(" " + a);
				a=a+4*i;
				
				}
			i++;
			}while(a<=num);
	}

}
