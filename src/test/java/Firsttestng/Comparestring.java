package Firsttestng;

public class Comparestring {

	public static void main(String[] args) {
		/*String s = "WELCOME";
		String s1 = "welcome";
		if (s.equalsIgnoreCase(s1))
		{
			System.out.println("Both strings are same");
		}
		else
		{
			System.out.println("Strings are not equal");
		*/

		
		String s = new String("welcome");
		System.out.println(s.length());
		for (int i=0; i<s.length(); i++)
		{
		  if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)== 'i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		  {
			  System.out.println(s.charAt(i));
		  }
			
	}

	}
}
