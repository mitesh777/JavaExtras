
public class inwords {

	public static void main(String[] args) {
		int num=0,dig=0,rev=0,di=0;
		String str="";
		System.out.println("Enter the number");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		
	
		
		while(num!=0)
		{
			dig=num%10;
			switch(dig)
			{
			case 0 : str="Zero " + str;break;
			case 1 : str="One " + str;break;
			case 2 : str="Two " + str;break;
			case 3 : str="Three " + str;break;
			case 4 : str="Four " + str;break;
			case 5 : str="Five " + str;break;
			case 6 : str="Six " + str;break;
			case 7 : str="Seven " + str;break;
			case 8 : str="Eight "+ str;break;
			case 9 : str="Nine " + str;break;
			default :str="No Such Number " + str;break;
			
			}
			num=num/10;
		}		
		System.out.println( "words: "+ str);
	}

}
