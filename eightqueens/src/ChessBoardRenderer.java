public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		
		boolean flag=false;
	
if(square>=0 && square<=7)
	{if(square%2==0)
flag=true;}
	else if(square>=8 && square<=15)
	{if(square%2!=0)
		flag=true;}

	else if(square>=16 && square<=23)
		{if(square%2==0)
	flag=true;}
		else if(square>=24 && square<=31)
		{if(square%2!=0)
			flag=true;}
		else if(square>=32 && square<=39)
		{if(square%2==0)
			flag=true;}
		else if(square>=40 && square<=47)
		{if(square%2!=0)
			flag=true;}
		else if(square>=48 && square<=55)
		{if(square%2==0)
			flag=true;}
		else if(square>=56 && square<64)
		{if(square%2!=0)
			flag=true;}
		
	
		System.out.println(square);
		return flag;
	}
}
