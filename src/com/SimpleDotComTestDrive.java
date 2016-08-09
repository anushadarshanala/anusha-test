package com;

import java.io.IOException;

public class SimpleDotComTestDrive {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println("in main");
		/*int[] locationCells= new int[7];
		locationCells[2]=2;
		locationCells[3]=3;
		locationCells[4]=4;*/

		SimpleDotCom s= new SimpleDotCom();
		int num=s.guessNumber();
		System.out.println("loc cells"+num);
		int[] locationCells= {num,num+1,num+2};
		s.setLocationCells(locationCells);
		s.checkYourself();
		
	}

}
