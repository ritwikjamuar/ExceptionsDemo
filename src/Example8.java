import java.util.Scanner;

/**
 * This program is to demonstrate the use of throw keyword.
 *
 * throw is used to explicitly throw an exception.
 * We can throw either checked or unchecked exception in java by throw keyword.
 * The throw keyword is mainly used to throw custom exception.
 */

public class Example8
{
	public static void main(String[] args)
	{
		try
		{
			System.out.print ( "Enter your Age : " );
			validate ( new Scanner ( System.in ).nextInt () );
		}
		catch ( ArithmeticException e )
		{
			System.out.println( "Arithmetic Exception occurred" );
		}
		finally
		{
			System.out.print ( "Thank You" );
		}

		/*
		 * In the try block, a method is called, which seems to throw an exception.
		 * This method call is being handled in the catch block, followed by finally block.
		 */
	}

	private static void validate(int age)
	{
		if ( age < 18 )
			throw new ArithmeticException ( "Minor for Age" );
		else
			System.out.println( "Welcome to Vote" );

		/*
		 * If the provided parameter satisfies the condition,
		 * this method will throw an exception with some message.
		 *
		 * Else, a Statement will be printed.
		 */
	}
}