
public class seven {

	public static void main(String[] args) {
		int num=0,lcm=0,count=0,large=0;
		final int[] arr= {2,3,4,5,6};
		for(int i=0;i<arr.length-1;i++)
			
		{	
	lcm=arr[i]*arr[i+1]/fun(arr[i],arr[i+1]);
	
arr[i+1]=lcm;
		}
		
		
		for(int x=lcm+1;count<4;x=x+lcm)
		{
			if(x%7==0)
			{count++;
			if(count!=3)
				System.out.println(x);
		}}
		
	}
	static int  fun(int a, int b)
	{
	   
	    if (a == b)
	        return a;
	 
	    
	    if (a > b)
	        return fun(a-b, b);
	    return fun(a, b-a);
	}
}
