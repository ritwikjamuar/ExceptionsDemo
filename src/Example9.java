import java.util.Scanner;

/**
 * This example is to demonstrate the propagation of Exceptions.
 *
 * An exception is first thrown from the top of the stack and if it is not caught,
 * it drops down the call stack to the previous method.
 *
 * If not caught there, the exception again drops down to the previous method,
 * and so on until they are caught or until they reach the very bottom of the call stack.
 *
 * This is called exception propagation.
 *
 * By default, Unchecked Exceptions are forwarded in calling chain (propagated).
 * By default, Checked Exceptions are not forwarded in calling chain (propagated).
 */

public class Example9
{
	public static void main ( String[] args )
	{
		Example9 object = new Example9 ();
		object.one ();
	}

	private void one()
	{
		try { two(); }
		catch ( Exception e ) { System.out.println ( "Exception occurred" ); }
	}

	private void two() { three(); }

	private void three() { four(); }

	private void four()
	{
		System.out.print ( "Enter a Number : " );
		int a = new Scanner ( System.in).nextInt () / 0;
	}

	/*
	 * In this case, method four() is throwing ArithmeticException which is an Unchecked Exception.
	 *
	 * And, this exception is not being handled in this method.
	 * So this exception propagates to the caller method three().
	 * Unable to find Exception Handler there, Exception again propagates to caller method two().
	 * Unable to find the Exception Handler there also, Exception again propagates to caller method one().
	 * Exception finds the Exception Handler there, and thus it is handled.
	 */
}