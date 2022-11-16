package strings;

import java.util.*;

public class CountVowelsConsonantsOthers {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scanner.nextLine();
		int vowels=0,cons = 0,special = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
			{
				 ch = Character.toLowerCase(ch);
			      
	                if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                    ch == 'o' || ch == 'u')
	                    vowels++;
	                else
	                    cons++;
			}
			else if (ch >='0' && ch<='9')
			{
				continue;
				
			}
			else if (ch == ' ')
			{
				continue;
				
			}
			else{
				special++;
			}
			
		}
		System.out.println("Number of Consonants : "+ cons);
		System.out.println("Number of Vowels : "+ vowels);
		System.out.println("Number of Special Characters : "+ special);
		
		
		
	}

}
