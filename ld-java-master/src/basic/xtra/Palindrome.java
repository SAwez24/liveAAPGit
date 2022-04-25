package basic.xtra;

public class Palindrome {

	public static void main(String[] args) {
		String words []= {"Hannah", "Texas", "Renner", "Eleele" };
		for(String word : words) {
			// reverse
			StringBuilder stringBuilder = new StringBuilder(word);
			StringBuilder reversedStringBuilder = stringBuilder.reverse();
			String reverseString = reversedStringBuilder.toString();
			//if else
			// ternary operator :? which can be used to substititued if ... else....
			System.err.println(word.equalsIgnoreCase(reverseString)? word + " is Palindrome": word + " is Not Palindrome"); 
		}
		
		System.out.println("****RESEACH******");
		for(String word : words) {
			//if else
			System.err.println(word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())? word + " is Palindrome": word + " is Not Palindrome"); 
		}
	}
	
}
