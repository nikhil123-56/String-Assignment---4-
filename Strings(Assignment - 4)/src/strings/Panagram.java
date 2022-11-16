package strings;



public class Panagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		boolean[] mark = new boolean [26];
		int index = 0;
		for ( int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				index = str.charAt(i) - 'A';
	
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				index = str.charAt(i) - 'a';
			}
			else 
			{
				continue;
			}
			mark[index] = true;
		}
		
		for (int i = 0; i < mark.length; i++)
		{
			if(mark[i] == false)
			{
				System.out.println("Given String is not a Pangram");
				break;
			}
		}
			
				System.out.println("String is pangram");
			
			
					
		
		
	}
}
