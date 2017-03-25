/**
 * This program is to demonstrate Nested Try block.
 */

public class Example6
{
	public static void main(String[] args)
	{
		System.out.println ("Beginning of Code.");

		/*
		 * The try-catch block inside an try block block is called Nested Try Block.
		 *
		 * Sometimes a situation may arise where a part of a block may cause one error
		 * and the entire block itself may cause another error.
		 *
		 * In such cases, exception handlers have to be nested.
		 */

		try
		{
			try
			{
				int b =39/0;
			}
			catch ( ArithmeticException e )
			{
				System.out.println( "Arithmetic Exception occurred" );
				e.printStackTrace ();
			}

			try
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch ( ArrayIndexOutOfBoundsException e )
			{
				System.out.println( "Array Index Out Of Bounds Exception occurred" );
				e.printStackTrace ();
			}

			System.out.println("Try ends.");
		}
		catch ( Exception e )
		{
			System.out.println("Exception occurred");
			e.printStackTrace ();
		}

		System.out.println ("Rest of Code.");
	}
}