package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
	
	public String getUserInput() throws IOException{
		String line;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		if( (line=br.readLine())==null)
		{
			System.out.println("ntg");
			return null;
		}
		return line;
	}

}
