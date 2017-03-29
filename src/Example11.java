import java.io.IOException;

/**
 * This program is to demonstrate the usage of throws keyword.
 *
 * throws keyword is used to declare an exception.
 * It gives an information to the programmer that there may occur an exception,
 * So it is better for the us to provide the exception handling code
 * so that normal flow can be maintained.
 *
 * Only CheckedExceptions can be thrown, not UncheckedExceptions and Error.
 * Using this keyword enables CheckedExceptions to propagate to caller method,
 * so that Caller Method can handle that CheckedException.
 */

public class Example11
{
	public static void main ( String[] args )
	{
		System.out.println ( "Beginning of Code." );

		Example11 object = new Example11 ();
		object.one ();

		System.out.println ( "Rest of Code." );
	}

	private void one()
	{
		try { two(); }
		catch ( Exception e )
		{
			e.printStackTrace ();
			System.out.println ( "Exception occurred" );
		}
	}

	private void two() throws IOException { three (); }

	private void three() throws IOException { four(); }

	private void four () throws IOException
	{
		throw new IOException ( "Throw that piece of Shit" );
	}

	/*
	 * In this code, method four() is explicitly throwing an IOException to its caller.
	 * Note that this is an CheckedException.
	 *
	 * Caller of method four() is three() which is also throwing an IOException to its caller.
	 * Caller of method three() is two() which is also throwing an IOException to its caller.
	 * That way CheckedExceptions can be propagated from one method to another.
	 * Caller of method two() is one() which is handling the IOException./
	 *
	 * If method one() does not handles the exception by calling method two(),
	 * compiler will not compile the code.
	 *
	 * In the case when exception is not thrown from method four() and is handled in method one(),
	 * then code will execute normally.
	 *
	 * In the case when exception is thrown from method four() and is not handled in method one(),
	 * then compiler will not compile the code.
	 */
}