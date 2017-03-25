/**
 * There are two types of Exception:
 * 1. Checked Exceptions.
 * 2. Unchecked Exceptions.
 *
 * 1. Checked Exceptions:
 *      # These are the types of Exception, which are checked at the Compile Time.
 *      # If a Program exhibits this type of Exception, Compiler will not compile the code,
 *        and compiler will output the Exception Stack Trace.
 *      # Any Exception class which does not extends the RuntimeException class
 *        will be checked at Compile Time.
 *      # There is no need to handle this type of Exception
 *        as compiler is handling the exception for us by printing the Stack Trace.
 *      # Ex- IOException, ExecutionException, ParseException, etc.
 *
 * 2. Unchecked Exceptions:
 *      # These are the type of Exception, which are not checked at the Compile Time.
 *      # If a Program exhibits this type of Exception, Compiler will compile the code,
 *        and when code is run, exception will occur at Runtime.
 *      # Those Exception classes which extends the RuntimeException class will not be checked
 *        at the run-time.
 *      # For this type of Exception, we need to handle the exception explicitly.
 *      # Ex - ArithmeticException, IllegalArgumentException, ClassCastException.
 */

public class Example1
{
	public static void main(String[] args)
	{
		/*
		 * Scenario where Arithmetic Exception occurs.
		 */
		try { int a = 5/0; }
		catch ( ArithmeticException e ) { e.printStackTrace (); }

		/*
		 * Scenario where Null Pointer Exception occurs.
		 */
		try
		{
			String string = null;
			System.out.println (string);
		}
		catch ( NullPointerException e ) { e.printStackTrace (); }

		/*
		 * Scenario where Number Format Exception occurs.
		 */
		try { int b = Integer.parseInt("abc"); }
		catch ( NumberFormatException e ) { e.printStackTrace (); }

		/*
		 * Scenario where Array Index Out of Range Exception occurs.
		 */
		try
		{
			float c[] = new float[2];
			c[3] = 15;
		}
		catch ( NullPointerException e ) { e.printStackTrace (); }

		System.out.println ("Rest of Code");
	}
}