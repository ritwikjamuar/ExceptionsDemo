/**
 * There are five keywords associated with Exceptions Handling:
 *      # try
 *      # catch
 *      # finally
 *      # throw
 *      # throws
 *
 * try:     This keyword encloses block within braces.
 *          This block is where we can place some code which might throw an exception.
 *          This keyword must be used within the method, and must be followed either by catch or finally block.
 *
 * catch:   This keyword encloses block within braces.
 *          This block handles the exception (exception can be of Specific or Generic Type).
 *          This block executes if an exception of a particular type occurs within the try block.
 *          One can have multiple catch blocks with a single try block, but vice-versa is not true.
 */

public class Example2
{
	public static void main(String[] args)
	{
		System.out.println ("Beginning of Code.");

		/*
		 * Simplest Form of Try and Catch.
		 */
		try
		{
			/*
			 * Here, the declared integer has a value that can cause Runtime Exception.
			 * The Runtime Exception that will cause after execution of this code
			 * is of type ArithmeticException.
			 */
			int a = 1/0;
		}
		catch ( ArithmeticException e )
		{
			/*
			 * This block will check from try block whether it is throwing an exception or not.
			 *
			 * If try block does not throw exception, this block will not execute.
			 *
			 * If try block is throwing exception, and if type of exception try block is throwing
			 * does not match the type of exception mentioned as parameter for this block, then,
			 * this block will not execute.
			 * Ex-  Suppose above try block is throwing IllegalArgumentException,
			 *      but on this catch ArithmeticException is mentioned as parameter,
			 *      then this block will not execute.
			 *
			 * If try block is throwing exception, and if type of exception try block is throwing
			 * matches the type of exception mentioned as parameter for this block, only then,
			 * this block will execute.
			 *
			 * So, above try block throws ArithmeticException and this block has ArithmeticException as parameter,
			 * thus, this block will execute.
			 */

			System.out.println ("Arithmetic Exception occurred.");
			e.printStackTrace ();
		}

		System.out.println ("Rest of Code.");
	}
}