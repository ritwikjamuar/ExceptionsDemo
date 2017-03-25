/**
 * This program is to demonstrate the use of Finally block.
 *
 * For each try block there can be zero or more catch blocks, but only one finally block.
 *
 * finally block always executes whether exception is handled or not.
 *
 * finally block will not be executed if program exits(either by calling System.exit()
 * or by causing a fatal error that causes the process to abort).
 *
 * If one does not handle the exception, JVM executes the existing finally block in the code
 * before terminating the program.
 */

public class Example7
{
	public static void main(String[] args)
	{
		Test test = new Test();

		test.finally1 ();
		test.finally2 ();
		test.finally3 ();
	}
}

class Test
{
	/**
	 * Case 1:  When exception does not occur.
	 *
	 *          In this case, exception is not being thrown by try block,
	 *          but finally block will execute.
	 */
	void finally1 ()
	{
		try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch( NullPointerException e )
		{
			System.out.println( "Null Pointer Exception occurred" );
			e.printStackTrace ();
		}
		finally
		{
			System.out.println( "Finally 1" );
		}

		System.out.println ("Rest of Code.");
	}

	/**
	 * Case 2:  When exception occurs and handled.
	 *
	 *          In this case, exception has occurred in try block
	 *          and handled by catch block, followed by the
	 *          execution of finally block.
	 */
	void finally2 ()
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch ( ArithmeticException e )
		{
			System.out.println ("Arithmetic Exception occurred");
			e.printStackTrace ();
		}
		finally
		{
			System.out.println("Finally 2");
		}

		System.out.println ("Rest of Code.");
	}

	/**
	 * Case 3:  When exception occurs and not handled.
	 *
	 *          In this case, try block throws an exception
	 *          which is not handled by catch block,
	 *          but even then finally block will execute.
	 *
	 *          It is because, once an unhandled exception is raised,
	 *          it is handled by JVM's default Exception handler will
	 *          handle the exception, print the stack trace
	 *          and search for finally block.
	 *          If a finally block is found in the code, that block will execute,
	 *          and then, the program is terminated by JVM.
	 */
	void finally3 ()
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch ( NullPointerException e )
		{

			System.out.println( "Null Pointer Exception occurred" );
			e.printStackTrace ();
		}
		finally
		{
			System.out.println("Finally 3");
		}

		System.out.println ("Rest of Code.");
	}
}