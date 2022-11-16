package strings;

import java.util.*;
public class Maximum_Ocuurence_Of_Character {

	private static Scanner y;

	public static void main(String[] args) {
		y = new Scanner(System.in);
		System.out.println("Enter String");
		String name = y.nextLine();
		int[] count = new int[256];
		for(int i = 0; i < name.length(); i++)
		{
			count[name.charAt(i)]++;
		}
		int max = -1;
		char ch = ' ';
		for(int i = 0; i<name.length(); i++)
		{
			if( max < count[name.charAt(i)])
			{
				max = count[name.charAt(i)];
				ch = name.charAt(i);
			}
		}
		System.out.println("The Maximum occurence of character is:" + ch +" is equal to:" + max);
		
		
		
		

	}

}
