package com;
import java.io.IOException;

import com.GameHelper;
public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits=0;
	GameHelper helper= new GameHelper();
	public void setLocationCells(int[] locCells)
	{
		locationCells=locCells;
	}
	
	
	public void checkYourself() throws NumberFormatException, IOException
	{
		String result="miss";
		for(int cell:locationCells )
		{
			int guess=  Integer.parseInt( helper.getUserInput() );
System.out.println(guess);
			if(guess==cell)
			{
				System.out.println("hit");
				result="hit";
				numOfHits++;
			}
			else
				result="miss";
		}
		
		if(numOfHits==locationCells.length)
		{
			System.out.println("kill");
			result="kill";
		}
		System.out.println(result+numOfHits);
	}
	
public int guessNumber()
{
	int i= (int)(Math.random()*5);
	return i;
}
	
}
