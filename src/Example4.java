/**
 * This program is to demonstrate a try block with multiple catch block.
 */

public class Example4
{
	public static void main(String[] args)
	{
		System.out.println ("Beginning of Code.");

		/*
		 * We can handle multiple exceptions out from a single try block.
		 * However it does not mean that when a multiple types of exception is thrown
		 * from a single try block, multiple catch blocks will execute.
		 *
		 * Only one catch block will execute at a time.
		 *
		 * Also, the catch blocks are ordered from Most Specific Exception class to Most Generic Exception class.
		 *
		 * Most Specific Exception classes : ArithmeticException, ArrayIndexOutOfBoundsException
		 * Most Generic Exception class: Exception
		 */

		try
		{
			int a[] = new int[5];
			a[2] = 1/0;
			a[6] = 11;
		}
		catch ( ArithmeticException e )
		{
			System.out.println ("Arithmetic Exception occurred");
			e.printStackTrace ();
		}
		catch ( ArrayIndexOutOfBoundsException e )
		{
			System.out.println ("Array Index Out Of Bounds Exception occurred");
			e.printStackTrace ();
		}
		catch ( Exception e )
		{
			System.out.println ("Exception occurred");
			e.printStackTrace ();
		}

		System.out.println("Rest of Code.");

		/*
		 * In the above case, Program encounters the ArithmeticException first,
		 * so catch block with ArithmeticException as parameter is invoked.
		 *
		 * If ArrayIndexOutOfBoundsException was encountered first, then catch block
		 * with ArrayIndexOutOfBoundsException as parameter would have been invoked.
		 */
	}
}