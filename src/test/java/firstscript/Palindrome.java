package firstscript;

public class Palindrome {

	public static void main(String[] args) {
		String s ="satee";
		boolean result = true;
		for(int i=0;i<s.length()/2;i++)
		{
			if (s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				result = false;
				break;
			}
		}
		if(result)
		   System.out.println("Given string is ploindrom");
		else
			System.out.println("Given string is not polindrom");
		 System.out.println(s.length());
			
		
	}

}
