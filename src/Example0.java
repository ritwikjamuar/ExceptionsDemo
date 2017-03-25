/**
 * Basic difference between Exception and Error is that
 * Exception is recoverable, while Error is not.
 *
 * Also, Exception is caused mostly by code written by us. Ex- FileNotFoundException, ArithmeticException.
 * Error is caused mostly by System, ie. part where we don't have the control. Ex- OutOfMemoryError, IOError.
 *
 * Exception class in Java extends Throwable class.
 */

public class Example0
{
	public static void main(String[] args)
	{
		/*
		 * In below case, code inside the try block is known to throw the exception.
		 * This exception is handled by us using catch block.
		 */
		try
		{
			int a = 50/0;
		}
		catch( ArithmeticException e )
		{
			e.printStackTrace();
		}
		System.out.println("Rest of Code");
	}
}