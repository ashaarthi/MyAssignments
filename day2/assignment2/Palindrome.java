package week3.day2.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="madam";
		String rev="";
		char[] inputCharArray=input.toCharArray();
		for (int i = inputCharArray.length - 1; i >= 0; i--) {
			rev=rev+inputCharArray[i];
			
			
			
		}
			System.out.println("Reversed input: "+rev);
			
			if(input.equalsIgnoreCase(rev)) {
				System.out.println("The given string is palindrome");
			}
			else
			{
				System.out.println("The given string is not palindrome");
			}
			
			

	}

}
