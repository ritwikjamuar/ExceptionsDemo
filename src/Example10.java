/**
 * This program is to demonstrate what happens when we make Checked Exception to propagate.
 */

public class Example10
{
	public static void main ( String[] args )
	{
		Example10 object = new Example10 ();
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
		/*throw new java.io.NotActiveException ( "Not Active" );*/
		throw new NullPointerException ( "Null Value" );

		/*
		 * Uncomment the line 37, and comment the line 38.
		 * Doing that will make this program unable to compile,
		 * since there is an error in line 37, which is,
		 * unhandled exception.
		 *
		 * Checked Exceptions has to be handled immediately,
		 * otherwise compiler will not compile the code successfully.
		 */
	}
}