import java.awt.*;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		int pos=0;
		boolean flag=false;
		//Your logic here	
		for(int i=0;i<=15;i++)
			{if(buttonClicked==buttons[i])
				{pos=i;
			break;}
			}
		if(Math.abs(emptyCellId-pos)==1 || Math.abs(emptyCellId-pos)==4)
		{flag=true;
		}
		else if ((emptyCellId-pos)==1 || Math.abs(emptyCellId-pos)==4)
		{
			flag=true;
		}
		else if ((emptyCellId-pos)==-1 || Math.abs(emptyCellId-pos)==4)
			{flag=true;}
		else if (Math.abs(emptyCellId-pos)==1 || (emptyCellId-pos)==4)
		{
			flag=true;
		}	
		else if (Math.abs(emptyCellId-pos)==1 || (emptyCellId-pos)==-4)
		{
			flag=true;
		}	
		if(flag==true)
		{

			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId=pos;
		}
		return emptyCellId;
		

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		boolean flag;
		//Your logic here
		int a ;
		for(int i=0;i<15;i++)
		{flag=false;
			a=getRandomNumber()%15+1;
			for(int j=0;j<=i;j++)
			{if(arr[j]==a)
				{flag=true;
				i--;}
			}
			if(flag==false)
				arr[i]=a;
		}
		return arr;
	}
	
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		// Your Logic here
		int[] arr = getIntegerArrayOfButtonIds(buttons);
		for(int i=0;i<=15;i++)
		{
			if(arr[i]!=i+1)
				{winner=false;
				break;}
		}
		return winner;
	}
}