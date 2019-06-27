package com.cg.eis.Lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;

public class Ex2 {
	public static void main(String[] args)throws IOException
	{
		FileInputStream fil;
		LineNumberInputStream line;
		
		int i;
		try
		{
			fil=new FileInputStream("Libraries\\Documents\\vasthavsql");
			line=new LineNumberInputStream(fil);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No such file found");
			return;
		}
		do
		{
			i=line.read();
			if(i=='\n')
			{
				System.out.println();
				System.out.print(line.getLineNumber()+" ");
			}
			else
				System.out.print((char)i);
		}while(i!=-1);
		fil.close();
		line.close();
	}
}
