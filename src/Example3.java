/**
 * This program is to demonstrate what would happen if Unchecked Exceptions are not handled using try-catch block.
 */

public class Example3
{
	public static void main(String[] args)
	{
		/*
		 * When we don't handle the unchecked exceptions, program will terminate at runtime.
		 * The program will execute until the line of code is not throwing the exception.
		 *
		 * If exception is not handled, JVM provides a default exception handler that performs the following tasks:
		 *      # Prints out Exception description.
		 *      # Prints the Stack Trace (Hierarchy of methods where the exception occurred).
		 *      # Causes the Program to terminate.
		 */

		System.out.println ("Beginning of Code.");
		int a = 1/0;
		System.out.println (a);
		System.out.println("Rest of Code.");

		/*
		 * The execution of above code begins from line 14 and terminates at line 15.
		 * Thus Console printed Output 'Beginning of Code' but not 'Rest of Code'.
		 */
	}
}