/**
 * This program is to demonstrate the ordering of exceptions in catch block.
 */

public class Example5
{
	public static void main(String[] args)
	{
		System.out.println ("Beginning of Code.");

		/*
		 * When declaring multiple catch blocks, one must order the blocks
		 * from most Specific Exception to most Generic Exception.
		 *
		 * If the order of Exceptions is reversed from most Generic to most Specific,
		 * whatever exception is thrown from try block will be caught by Generic Exception Class,
		 * leaving the Specific Exception classes useless, creating the compile time error,
		 * stating that those Specific Exceptions has already been caught by Generic Exception class.
		 */

		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch ( Exception e )
		{
			System.out.println("Exception occurred");
			e.printStackTrace ();
		}
		/*catch ( ArithmeticException e )
		{
			System.out.println("task1 is completed");
		}
		catch ( ArrayIndexOutOfBoundsException e )
		{
			System.out.println("task 2 completed");
		}*/

		System.out.println("Rest of Code.");

		/*
		 * Uncomment the two multiple catch statements and try to compile the Code.
		 *
		 * Above code will cause Compile Time Error stating that
		 * ArithmeticException and ArrayIndexOutOfBoundsException has been caught by Exception class.
		 */
	}
}