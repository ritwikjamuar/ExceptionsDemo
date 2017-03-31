import java.util.Scanner;

/**
 * This program is to demonstrate how to make a Custom Exception class.
 *
 * In order to make one's own custom exception, class needs to extend Exception class.
 */

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message) { super( message ); }
}

public class Example14
{
	public static void main ( String[] args )
	{
		Example14 object = new Example14 ();

		System.out.print ( "Enter Your Age : " );

		try
		{
			object.validate ( new Scanner ( System.in).nextInt () );
		}
		catch ( InvalidAgeException e )
		{
			e.printStackTrace ();
		}

		System.out.println ( "Rest of Code" );
	}

	private void validate( int age ) throws InvalidAgeException
	{
		if ( age < 18 )
			throw new InvalidAgeException ( "Minor for Age" );
		else
			System.out.println ( "Welcome to Vote" );
	}
}