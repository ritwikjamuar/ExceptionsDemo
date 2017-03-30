import java.io.IOException;

/**
 * This program is to demonstrate the Exception Handling when a method is overridden.
 *
 * When the super class method does not declare the exception,
 * sub class method cannot declare the exception when Exception is Checked type,
 * but, sub class method can declare the exception when Exception is Unchecked Type.
 */

class Parent
{
	void run()
	{
		System.out.println("Hello");
	}
}

public class Example12 extends Parent
{
	public static void main ( String[] args )
	{
		Parent parent = new Example12 ();
		parent.run ();
	}

	void run() /*throws IOException*/
	{
		System.out.println("World");
	}

	/*void run() throws NullPointerException
	{
		System.out.println("Null");
	}*/

	/*
	 * In this, uncomment the IOException declaration in line 27,
	 * and compiler will not compile this Program.
	 * This is because, the superclass run() method does not declare the checked Exception IOException.
	 *
	 * If we replace from Checked Exception to Unchecked Exception in here,
	 * then Compiler will compile the code.
	 *
	 * To demonstrate that,
	 * uncomment the code from line 32 - 35,
	 * and comment the code from 27 - 30.
	 */
}