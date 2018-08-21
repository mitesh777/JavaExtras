
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		String rev="";
		System.out.println("Enter string ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		str= scanner.next();
		for(int j=str.length()-1;j>=0;j--)
				rev+=str.charAt(j);
		if(str.compareTo(rev)==0)
			System.out.println("Palindrome");
	
		else
			System.out.println("Not a palindrome");
	}

}
