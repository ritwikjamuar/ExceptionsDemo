import java.io.EOFException;
import java.io.IOException;

/**
 * This is another program to demonstrate the Exception Handling when a method is overridden.
 *
 * When the super class method declares/throw an Exception,
 * sub class method can chose to declare same exception,
 * or sub class exception,
 * or no exception.
 *
 * But sub class cannot declare the parent exception.
 */

class Parent2
{
	void run() throws IOException
	{
		System.out.println("Hello");
	}
}

public class Example13 extends Parent2
{
	public static void main(String[] args)
	{
		Parent2 parent = new Example13 ();
		try
		{
			parent.run ();
		}
		catch ( IOException e )
		{
			e.printStackTrace ();
		}
	}

	void run()
	{
		System.out.println("World");
	}

	/*void run() throws IOException
	{
		System.out.println("World");
	}*/

	/*void run() throws EOFException
	{
		System.out.println("World");
	}*/

	/*void run() throws Exception
	{
		System.out.println("World");
	}*/

	/*
	 * In this,
	 *
	 * Uncommented run() method is overriding Parent2's run() method which has declared IOException.
	 * The code will execute since this sub-class method is not throwing any exception.
	 *
	 * comment the run() method with no exception declared,
	 * and uncomment the run() method with IOException declared.
	 * The code will execute since this sub-class method is throwing the same exception as declared by super-class method.
	 *
	 * comment the run() with IOException declared,
	 * and uncomment the run() method with EOFException declared.
	 * The code will execute since this sub-class method has declared EOFException which is the sub-class exception of IOException,
	 * declared in the super-class method.
	 *
	 * comment the run() with EOFException declared,
	 * and uncomment the run() method with Exception declared.
	 * The code will not compile by the Compiler, since this sub-class method has declared Exception which is the super-class of IOException,
	 * declared in the super-class method.
	 */
}