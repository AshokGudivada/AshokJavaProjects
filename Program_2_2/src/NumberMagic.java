
public class NumberMagic 
{
	public static void main (String[] args)
	{

		int result;
		int originalNumber = 2147483647; // any number 2147483647

		// add one to the number
		result = originalNumber + 1;
		System.out.println(result);

		// multiply the result by two
		result = result * 2;
		System.out.println(result);

		// add four to the result
		result = result + 6;
		System.out.println(result);

		// divide the result by 2
		result = result / 2;
		System.out.println(result);

		// subtract the orginal number
		result = result - originalNumber;
		System.out.println(result);

		System.out.println("I guess your result is 4");
		System.out.println("What did you get? "+result);
	}
}
