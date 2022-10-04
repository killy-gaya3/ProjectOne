package com.task;

import java.io.*;

public class ClassOne 
{

	public static void main(String[] args) 
	{
				
		int rno = 0;
		String name = null;
		double avg = 0;
		
		BufferedReader br = new BufferedReader(
				      new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter your roll num");
		rno = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name");
		name = br.readLine();
		
		System.out.println("Enter your avg marks");
		avg = Double.parseDouble(br.readLine());
		
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		
		System.out.println("Your data is");
		System.out.println("Rno = " + rno);
		System.out.println("Name = " + name);
		System.out.println("Avg = " + avg);
		

	}

}