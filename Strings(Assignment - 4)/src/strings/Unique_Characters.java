package strings;

import java.util.*;

public class Unique_Characters {

	private static Scanner y;

	public static void main(String[] args) {
		y = new Scanner(System.in);
		System.out.println("Enter String Name");
		String name = y.nextLine(); 
		char [] ar = name.toCharArray();
		boolean uniqchar = true;
		for(int i = 0; i < ar.length; i++ )
		{
			for(int j = i+1; j < ar.length; j++)
			{
				if(ar[i] == ar[j])
				{
					uniqchar = false;
					break;
				}
			}
		}
		if(uniqchar)
		{
			System.out.println("String Contains Unique Characters");
		}
		else
		{
			System.out.println("String Doesn't contain Unique Characters");
		}
		
		
		
		

	}

}
